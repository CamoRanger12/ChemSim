package ChemSim.simulation;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Vector;

public class Molecule extends Particle{
	
	private ArrayList<ConnectedAtom> atoms;
	private ConnectedAtom[] atomsA;
	
	public Molecule(){
		super("molecule");
	}
	
	public void draw(Graphics G){
		
	}
	
	//class representing atoms and what it's connected to.
	private class ConnectedAtom{
		public Atom atom;
		public float[] angles;
		public int[] atomIDs;
		
		
		public ConnectedAtom(Atom atom){
			this.atom = atom;
			this.angles = new float[this.atom.getInvalence()];
			this.atomIDs = new int[this.atom.getInvalence()];
			
		}
		
		public void addconection(int id, int connectionId, float angle){
			this.angles[id] = angle;
			this.atomIDs[id] = connectionId;
			
		}
	}
}
