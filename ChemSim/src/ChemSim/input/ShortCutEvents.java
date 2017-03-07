package ChemSim.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import ChemSim.simulation.SimGraphics;

public class ShortCutEvents implements KeyListener{
	
	private SimGraphics s;
	@Override
	public void keyPressed(KeyEvent e) {
		//  Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//  Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//  Auto-generated method stub
		if(e.getKeyCode() == ' ')
			s.PauseButtonAction();
	}
	
	public ShortCutEvents(SimGraphics s){
		this.s = s;
	}

}
