

public class Display{
	static View v;
	 static Controller c;
	 static Keys k;
	public static void main(String[] args) {
		v = new View();
		c = new Controller();
		k = new Keys();
		v.addController(c);
		c.addView(v);
		k.addController(c);
		v.createChooser();
	}
	
}