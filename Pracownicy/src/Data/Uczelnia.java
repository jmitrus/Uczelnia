package Data;

import java.util.HashMap;
import java.util.Map;

public class Uczelnia {
Map<String,Osoba>uczelnia;


public Uczelnia(){
	uczelnia=new HashMap<>();
}

public Map<String, Osoba> getUczelnia() {
	return uczelnia;
}

public void setUczelnia(Map<String, Osoba> uczelnia) {
	this.uczelnia = uczelnia;
}

public void addp(Osoba o) {
	uczelnia.put(o.Nazwisko, o);
}
public void adds(Osoba o) {
	uczelnia.put(o.Nazwisko, o);

}
public void us(String s) {
	uczelnia.remove(s);
}
public void ile() {
	System.out.println("na uczelni jest "+uczelnia.size()+" osob");
}
}
