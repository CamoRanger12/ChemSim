package ChemSim.data;

import java.math.*;
public class ForceVector {
	
	public float x;
	public float y;
	public float direction;
	public float magnitude;
	
	public ForceVector(){
		this(0, 0);
	}
	
	public ForceVector(float x,float y){
		this.x = x;
		this.y = y;
		this.checkVector(true);
	}
	
	private void checkVector(boolean fromxy){
		//soh cah toa
		if(fromxy){
			this.direction = (float) Math.atan2(y, x);
			this.magnitude = (float) (y / Math.cos(this.direction));
		}else{
			this.x = (float) (Math.tan(direction));
			this.y =(float) (Math.tan(direction));
		}
	}
	
}
