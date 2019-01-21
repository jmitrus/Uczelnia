package Do;

import java.util.Collection;

import Data.Osoba;
import Data.Pracownik;
import Data.Student;
import Data.Uczelnia;

public class Info {


public void Pracownik(Uczelnia u) {
	
	Collection<Osoba>kol=u.getUczelnia().values();
	int pracownicy=0;
	StringBuffer bu=new StringBuffer();
	
	for(Osoba a:kol)
	{
		
		if(a instanceof Pracownik)
		{
			bu.append(a);
			pracownicy++;
		
		}
	}
	
	if(pracownicy==0)
	{
		System.out.println("Nie ma ¿adnych pracowików");
	}
	else 
	{

			System.out.println(bu);
	}
}
public void Student(Uczelnia u) {
	
	Collection<Osoba>kol=u.getUczelnia().values();
	int studenci=0;
	StringBuffer bu=new StringBuffer();
	
	for(Osoba a:kol)
	{
		
		if(a instanceof Student)
		{
			bu.append(a);
			studenci++;
		
		}
	}
	
	if(studenci==0)
	{
		System.out.println("Nie ma ¿adnych studentów");
	}
	else 
	{

			System.out.println(bu);
	}}

}
