package Data;

public class Student extends Osoba{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	
	int rok;

	public int getRok() {
		return rok;
	}

	public void setRok(int rok) {
		this.rok = rok;
	}
	public Student(String imie,String nazwisko,int rok) {
		super(imie,nazwisko);
		setRok(rok);
	}
	
	public Student() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + rok;
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
		Student other = (Student) obj;
		if (rok != other.rok)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [rok=" + rok + ", Imie=" + Imie + ", Nazwisko=" + Nazwisko + "]";
	}

}
