package n1exercici1SamayoaS;

public class Producte {
	private String nom;
	private double preu;
	
	public Producte(String nom, double preu) {
		super();
		this.nom = nom;
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "Producte [nom: " + nom + ", preu: " + preu + "]";
	}

}
