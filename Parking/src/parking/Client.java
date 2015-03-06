package parking;

public class Client {
	private String nom;
	private String prenom;
	private int id;
	private String mail;
	private static int cptId = 0;
	
	public Client() {
		this.nom = "";
		this.prenom = "";
		this.id = ++cptId;
		this.mail = "";
	}
	
	public Client(String nom, String prenom, String mail) {
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
	}
	
	public String getNom() {
		return this.nom;
	}
}
