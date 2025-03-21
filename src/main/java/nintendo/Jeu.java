package nintendo;

public class Jeu {
    private String nom;
    private Console console;
    private double prix;
    private Boutique boutique;
    

	public Jeu(String nom, Console console, double prix, Boutique boutique) {
		super();
		this.nom = nom;
		this.console = console;
		this.prix = prix;
		this.boutique = boutique;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Console getConsole() {
		return console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	public double getPrix() {
		return prix;
	}

	public Boutique getBoutique() {
		return boutique;
	}

	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Jeu [nom=" + nom + ", console=" + console + ", prix=" + prix + ", boutique=" + boutique + "]";
	}



}
