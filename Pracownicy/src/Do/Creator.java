package Do;

import java.util.Scanner;

import Data.Pracownik;
import Data.Student;

public class Creator {
Pracownik p;
Student s;
Scanner sc;

Creator(){
	p=new Pracownik();
	s=new Student();
	sc=new Scanner(System.in);
	
}
public void close() {
	sc.close();
}

public Pracownik addp(){
		
	System.out.println("Podaj imie nowego pracownika");
	String a=sc.nextLine();
	System.out.println("Podaj nazwisko nowego pracownika");
	String b=sc.nextLine();
	System.out.println("Podaj wynagrodzenie nowego pracownika");
	double c=sc.nextDouble();
	return new Pracownik(a,b,c);
	}
	
public Student adds(){
	
	System.out.println("Podaj imie nowego studenta");
	String a=sc.nextLine();
	System.out.println("Podaj nazwisko nowego studenta");
	String b=sc.nextLine();
	System.out.println("Podaj rok nowego studenta");
	int c=sc.nextInt();
	sc.nextLine();
	return new Student(a,b,c);
	
}

}
