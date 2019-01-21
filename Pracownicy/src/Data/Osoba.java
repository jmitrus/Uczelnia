package Data;

import java.io.Serializable;

public class Osoba implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	String Imie;
	String Nazwisko;
	public String getImie() {
		return Imie;
	}
	public void setImie(String imie) {
		Imie = imie;
	}
	public String getNazwisko() {
		return Nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		Nazwisko = nazwisko;
	}
	public Osoba(String imie,String nazwisko) {
		setImie(imie);
		setNazwisko(nazwisko);
		
		
	}
		public Osoba () {
			
		}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Imie == null) ? 0 : Imie.hashCode());
		result = prime * result + ((Nazwisko == null) ? 0 : Nazwisko.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		if (Imie == null) {
			if (other.Imie != null)
				return false;
		} else if (!Imie.equals(other.Imie))
			return false;
		if (Nazwisko == null) {
			if (other.Nazwisko != null)
				return false;
		} else if (!Nazwisko.equals(other.Nazwisko))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Osoba [Imie=" + Imie + ", Nazwisko=" + Nazwisko + "]";
	}
	
}
