package Projet;
import java.util.Objects;

public class Utilisateur {
	private String nom, prenom, login, mot_de_passe;

	public Utilisateur(String nom, String prenom, String login, String mot_de_passe) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mot_de_passe = mot_de_passe;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getLogin() {
		return login;
	}

	public String getMot_de_passe() {
		return mot_de_passe;
	}

	@Override
	public int hashCode() {
		return Objects.hash(login, mot_de_passe, nom, prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilisateur other = (Utilisateur) obj;
		return Objects.equals(login, other.login) && Objects.equals(mot_de_passe, other.mot_de_passe)
				&& Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom);
	}

	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ "]";
	}
	
	
	
	
}
