package parking;

import java.util.Date;

public class Reservation {
	
	private int id;
	private static int cptId = 0;
	private Date dateArrivee;
	private Place place;
	private Date duree;
	private Client client;
	private String etatReservation;
	
	public Reservation() {
		this.id = ++cptId;
		this.dateArrivee = null;
		this.place = null;
		this.duree = null;
		this.client = null;
		this.etatReservation = "Créée";
		
	}
	
	public Reservation(Date dateArrivee, Place place, Date duree, Client client) {
		this.id = ++cptId;
		this.dateArrivee = dateArrivee;
		this.place = place;
		this.duree = duree;
		this.client = client;
		this.etatReservation = "En attente";
	}

	public Date getDateArrivee() {
		return this.dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Place getPlace() {
		return this.place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getEtatReservation() {
		return this.etatReservation;
	}

	public void setEtatReservation(String etatReservation) {
		this.etatReservation = etatReservation;
	}

	public Date getDuree() {
		return this.duree;
	}

	public void setDuree(Date duree) {
		this.duree = duree;
	}
}
