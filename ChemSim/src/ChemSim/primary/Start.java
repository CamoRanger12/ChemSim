package ChemSim.primary;


import ChemSim.input.ShortCutEvents;
//import java.awt.Graphics2D;
import ChemSim.simulation.*;

import javax.swing.JButton;
import javax.swing.JFrame;
																									
public final class Start {

	public static void main(String[] args) {
		
		JFrame mainFrame = new JFrame("ChemSim v0.0.0.0.0");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setSize(800, 400);
		
		SimGraphics s = new SimGraphics();
		mainFrame.add(s);
		JButton b = new JButton("merica");
		b.setLocation(200, 200);
		b.setSize(50, 100);
		b.setAlignmentX(0);
		//mainFrame.add(b);
		
		ShortCutEvents e = new ShortCutEvents(s);
		
		mainFrame.setVisible(true);
		
		
	}

}
