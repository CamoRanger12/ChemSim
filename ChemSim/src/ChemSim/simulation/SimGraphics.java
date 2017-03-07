package ChemSim.simulation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SimGraphics extends JPanel {

	int x = 0;
	int y = 0;
	byte xinc = 1;
	byte yinc = 1;
	boolean paused = false;
	
	float fps;
	long ptime = -1;
	int p = 0;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(ptime == -1)
			ptime = System.currentTimeMillis();
		else{
			long t = System.currentTimeMillis() - ptime;
			if(t != 0){
			fps = (float)(1000.0/t);
			//f = t 
			p++;
			if(p > 10){
				System.out.println(fps);
				
				p = 0;
			}
			}
			ptime = System.currentTimeMillis();
		}
		
		
		this.setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		g.drawLine(this.getWidth() / 2, this.getHeight() / 2, x, y);
		g.fillOval(x - 5, y - 5, 10, 10);
		
		if (!paused) {
			x += xinc;
			y += yinc;
			if (x >= this.getWidth())
				xinc = -1;
			else if (x <= 0)
				xinc = 1;
			if (y >= this.getHeight())
				yinc = -1;
			else if (y <= 0)
				yinc = 1;
			//ptime = System.currentTimeMillis();
			repaint();
		}

	}

	public SimGraphics() {

		JButton b = new JButton("P");
		b.setSize(80, 80);
		
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PauseButtonAction();
			}

		});
		this.add(b);
		JButton x = new JButton("djkl;oif");
		this.add(x);
		
	}
	
	public void PauseButtonAction(){
		if (paused) {
			paused = false;
			repaint();
		} else
			paused = true;
	}

}
