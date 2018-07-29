


import java.lang.Integer;
import java.util.Observable;
import javax.swing.*;


public class View implements java.util.Observer {

	
	private Controller c;
	private JFrame frame;
	private int width;
	private int height;
	
	private JTextField anzBuchstaben, ausgabe;
	
	public View() {
		   	
	}
	
	public void createChooser() {
		JButton goButton = new JButton("Random Wort Generieren");
	    goButton.setActionCommand("go");
	    goButton.addActionListener(c);
	    goButton.setSize(100, 50);
	    goButton.setBounds(50, 300, 300, 20);
	    
	    JButton Olg = new JButton("Ähnliches Wort Generieren");
	    Olg.setActionCommand("ln");
	    Olg.addActionListener(c);
	    Olg.setSize(50, 50);
	    Olg.setBounds(50, 200, 300, 20);
	    
        JFrame f= new JFrame();
        
        ausgabe = new JTextField("", 1);  
        ausgabe.setBounds(100,25,150,20);
        ausgabe.setEditable(true);
        ausgabe.setText("Wort");
        
        anzBuchstaben = new JTextField("10", 1);  
        anzBuchstaben.setBounds(100,50,150,20);  
        anzBuchstaben.addActionListener(c);
        anzBuchstaben.setActionCommand("cols_input");
        
       
        
       
        
        JLabel Buch = new JLabel();
        Buch.setText("");
        Buch.setBounds(100-70,50-25, 300, 20);
        
        f.add(anzBuchstaben);
        f.add(ausgabe);
        f.add(Buch);
        f.add(goButton);
        f.add(Olg);
        f.setSize(400, 400);  
        f.setLayout(null);  
        f.setVisible(true);  
        
	}
	
	public void createDrawing() {
		frame = new JFrame("MazeRunner");
		frame.addKeyListener(new Keys());
		
		frame.addWindowListener(new Controller.CloseListener());	
		frame.setSize(width, height);
		frame.setLocation(100,100);
		frame.setVisible(true);
		
	}
	public void setTextf(String s) {
		ausgabe.setText(s);
	}

	
	public void addController(Controller controller){
		System.out.println("View      : adding controller");
		c = controller;
	}
	
	public int getWindowWidth() {
		return width;
	}
	
	public int getWindowsHeight() {
		return height;
	}
	public String getLaenge() {
		return anzBuchstaben.getText();
	}
	
	public int getHeightTF() {
		try {
			return Integer.parseInt(anzBuchstaben.getText());
		}
		catch (Exception e) {
			return 800;
		}
	}
	
	
	public void setWindowWidth(int _width) {
		width = _width;
	}
	
	public void setWindowsHeight(int _height) {
		height = _height;
	}
 
	public void update(Observable arg0, Object arg1) {
		
	}
}
 