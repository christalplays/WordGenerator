
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Controller implements java.awt.event.ActionListener{


	View view;
	Letter l;
	int cols;
	int width;
	int height;

	public Controller() {	
		System.out.println ("Controller()");
		l = new Letter();
		view = new View();
	} 
		
	public void actionPerformed(java.awt.event.ActionEvent e){
		switch(e.getActionCommand()) {
		case "go":
			int number1 = Integer.parseInt(view.getLaenge());
			
			view.setTextf(l.Rndm_Letter(number1));
			

			break;
		
		case "ln":
			
			int number2 = Integer.parseInt(view.getLaenge());
			l.Org_Letter(number2);
			view.setTextf(l.Rndm_Letter(number2));
			
			
		}
	} 
	

	

	public void addView(View v){
		System.out.println("Controller: adding view");
		this.view = v;
	} 
	
	
	
	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		} 
	}
	
	public static class CloseListenerSetup extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		} 
	}
} 
