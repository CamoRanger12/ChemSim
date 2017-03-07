package ChemSim.simulation;
import java.awt.Color;
import java.awt.Graphics;

import ChemSim.data.*;
public class Atom {
	
	public int protons;
	public int neutrons;
	public int electrons;
	private int massNumber;
	private int inValence;
	public Color color;
	
	public static int[] Shells = {};
	
	//creates Atom with specified protons, neutrons, and electrons
	public Atom(int protons, int neutrons, int electrons){
		this.protons = protons;
		this.neutrons = neutrons;
		this.electrons = electrons;
		this.massNumber = protons + neutrons;
		
	}
	
	//creates Atom off of specified element
	public Atom(Elements element){
		this(element.getProtons(), element.getNeutrons(), element.getProtons());
	}
	
	public void draw(int x, int y, Graphics g){
		g.setColor(this.color);
		g.fillOval(x, y, massNumber + 5, massNumber + 5);
	}
	
	public int getInvalence(){
		setInValence();
		return inValence;
	}
	
	public void setInValence(){
		int s;
		for(int i: Shells){
			if(this.electrons >= i){
				s = i;
				break;
			}
			this.inValence = this.electrons % i;
		}
	}
	
	
}
