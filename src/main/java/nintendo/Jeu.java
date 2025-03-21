package nintendo;

public class Jeu {
    private String nom;
    private Console console;
    private double prix;
    
	public Jeu(String nom, Console console, double prix) {
		this.nom = nom;
		this.console = console;
		this.prix = prix;
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

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Jeu [nom=" + nom + ", prix=" + prix + "]";
	}
}
