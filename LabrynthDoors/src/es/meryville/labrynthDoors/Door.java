package es.meryville.labrynthDoors;

import java.util.Random;

public class Door {
	private boolean certainDeath;
	private boolean allwaysTellsTheTruth;
	
	

	public Door(boolean certainDeath, boolean allwaysTellsTheTruth) {
		super();
		this.certainDeath = certainDeath;
		this.allwaysTellsTheTruth = allwaysTellsTheTruth;
	}

	public Door() {
		super();
		Random r = new Random(); 		 
		this.certainDeath=r.nextBoolean();
		this.allwaysTellsTheTruth=r.nextBoolean();
	}

	public void setToCertainDeath(boolean b) {
		 this.certainDeath=b ;		
	}

	public boolean enter() {		
		return !certainDeath;
	}


	public void setAllwaysTellsTheTruth(boolean b) {
		this.allwaysTellsTheTruth = b;		
	}

	public boolean askToCertainDeath() {
	    if (allwaysTellsTheTruth){
	    	return certainDeath;
	    }else {
	    	return !certainDeath; 
	    }
		
	}

	public boolean askToCertainDeath(Door doorTwo) {
		if (allwaysTellsTheTruth){
	    	return doorTwo.askToCertainDeath();
	    }else {
	    	return !doorTwo.askToCertainDeath(); 
	    }		
		
	}

	public Door opposite() {		
		return  new Door(!this.certainDeath, !this.allwaysTellsTheTruth);
	}

	@Override
	public String toString() {
		return "Door [certainDeath=" + certainDeath + ", allwaysTellsTheTruth="
				+ allwaysTellsTheTruth + "]";
	}
	
	

}
