package Data;

public class Pracownik extends Osoba {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	Double wynagrodzenie;
	public Double getWynagrodzenie() {
		return wynagrodzenie;
	}
	public void setWynagrodzenie(Double wynagrodzenie) {
		this.wynagrodzenie = wynagrodzenie;
	}
	public Pracownik(String imie,String nazwisko,double wynagrodzenie) {
		super(imie,nazwisko);
		setWynagrodzenie(wynagrodzenie);
	}
	
	public Pracownik() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((wynagrodzenie == null) ? 0 : wynagrodzenie.hashCode());
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
		Pracownik other = (Pracownik) obj;
		if (wynagrodzenie == null) {
			if (other.wynagrodzenie != null)
				return false;
		} else if (!wynagrodzenie.equals(other.wynagrodzenie))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pracownik [wynagrodzenie=" + wynagrodzenie + ", Imie=" + Imie + ", Nazwisko=" + Nazwisko + "]";
	}
	

}
