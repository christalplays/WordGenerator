

import java.awt.event.KeyEvent;

public class Keys implements java.awt.event.KeyListener{
	
	
	
	public Keys() {}
	
	public void addController(Controller controller) {
	Controller	c = controller;
	}
	
	public void keyPressed(KeyEvent arg0) {	}

	public void keyReleased(KeyEvent arg0) { }

	public void keyTyped(KeyEvent arg0) {
		switch(arg0.getKeyCode()) {
		case 37:
			break;
		case 38:
			break;
		case 39:
			break;
		case 40:
			break;
		}
	}
}