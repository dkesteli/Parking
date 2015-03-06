package parking;

public class Place {
	
	private int numPlace;
	private Parking nomDuParking;
	private boolean libre;
	
	public Place(int numPlace,Parking nomDuParking,boolean libre){
		this.libre=true;
		this.nomDuParking=nomDuParking;
		this.numPlace=numPlace;
	}
	
	public int getNumPlace(){
		return numPlace;
	}
	
	public boolean getLibre(){
		return libre;
	}
	
	public Parking getParking(){
		return nomDuParking;
	}
	
	public void setOccupé(){
		this.libre=false;
	}
	
	

}
