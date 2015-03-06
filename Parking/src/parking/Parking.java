package parking;

public class Parking {
	
	private String idParking;
	private String adresse;
	private int capacite;
	private int placesLibres;
	
	public Parking(String idParking,String adresse, int capacite){
		this.adresse=adresse;
		this.capacite=capacite;
		this.idParking=idParking;
		this.placesLibres=capacite; //à l'initialisation toutes les places sont libres
	}
	
	public String getId(){
		return idParking;
	}
	
	public String getAdresse(){
		return adresse;
	}
	
	public int getCapacite(){
		return capacite;
	}
	
	public int getPlacesLibres(){
		return placesLibres;
	}
	
	public String toString(){
		return "ID Parking : "+idParking+"\nAdresse : "+adresse+"\nCapacité Totale : "+capacite+"\nNombre de places libres : "+placesLibres;
	}
	

}
