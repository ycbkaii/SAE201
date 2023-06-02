package Projet;

import java.util.ArrayList;
import java.util.Objects;

public class Gerant extends Utilisateur {
	private int id_gerant;
	private static int num_gen = 1;
	private ArrayList<CategorieChambre> listeCategories;
	public Gerant(String nom, String prenom, String login, String mot_de_passe) {
		super(nom, prenom, login, mot_de_passe);
		this.id_gerant = this.num_gen;
		this.num_gen++;
		this.listeCategories = new ArrayList<>();
	}
	
	
	public int getId_gerant() {
		return id_gerant;
	}


	public void setId_gerant(int id_gerant) {
		this.id_gerant = id_gerant;
	}


	public ArrayList<CategorieChambre> getListeCategories() {
		return listeCategories;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id_gerant);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gerant other = (Gerant) obj;
		return id_gerant == other.id_gerant;
	}
	@Override
	public String toString() {
		return "Gerant [id_gerant=" + id_gerant + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getLogin()=" + getLogin() + "]";
	}
	
	public void afficher() {
		System.out.println(this);
	}
	
	
}
