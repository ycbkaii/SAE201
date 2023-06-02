package Projet;

import java.util.Objects;

public class Chambre {
	private int num_chambre;
	
	

	public Chambre(int num_chambre) {
		this.num_chambre = num_chambre;
	}


	public int getNum_chambre() {
		return num_chambre;
	}


	@Override
	public int hashCode() {
		return Objects.hash(num_chambre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chambre other = (Chambre) obj;
		return num_chambre == other.num_chambre;
	}

	@Override
	public String toString() {
		return "Chambre [num_chambre=" + num_chambre + "]";
	}
	
	
	
}
