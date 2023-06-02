package Projet;

public class CategorieChambre {
	private String nomCategorie;
	private int capacite;
	private int tarif_de_base;
	public CategorieChambre(String nomCategorie, int capacite, int tarif_de_base) {
		this.nomCategorie = nomCategorie;
		this.capacite = capacite;
		this.tarif_de_base = tarif_de_base;
	}
	
	
	public String getNomCategorie() {
		return nomCategorie;
	}


	public int getCapacite() {
		return capacite;
	}


	public int getTarif_de_base() {
		return tarif_de_base;
	}


	@Override
	public String toString() {
		return "Chambre [nomCategorie=" + nomCategorie + ", capacite=" + capacite + ", tarif_de_base=" + tarif_de_base
				+ "]";
	}
	
	public void afficher() {
		System.out.println(this);
	}
}
