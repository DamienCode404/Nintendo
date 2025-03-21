package nintendo;

import java.time.LocalDate;

public abstract class Console {
	protected LocalDate dateSortie;
	protected double prix;
	protected String name;
	public Console(LocalDate dateSortie, double prix, String name) {
		super();
		this.dateSortie = dateSortie;
		this.prix = prix;
		this.name = name;
	}
	public LocalDate getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Console [dateSortie=" + dateSortie + ", prix=" + prix + ", name=" + name + "]";
	}
	
	
}
