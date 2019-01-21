package Do;

import java.util.Scanner;

import Data.Uczelnia;

public class Loop {
Uczelnia u;
Creator c;
Info info;
Scanner sc;


public Loop(){
	u=new Uczelnia();
	c=new Creator();
	info=new Info();
	sc=new Scanner(System.in);
	
}

public void petla() {
	int k=-1;
	System.out.println("Witaj na uczelni!");
	
	while(k!=0) {
		
		System.out.println("Wybierz 0 ¿eby wyjœæ");
		System.out.println("Wybierz 1 ¿eby dodaæ pracownika");
		System.out.println("Wybierz 2 ¿eby dodaæ studenta");
		System.out.println("Wybierz 3 ¿eby wyswietlic studentów");
		System.out.println("Wybierz 4 ¿eby wyswietlic pracowników");
		System.out.println("Wybierz 5 ¿eby wyswietlic informacje wszystkich");
		
		
		k=sc.nextInt();
		sc.nextLine();
		switch (k) {
		case 0:
			System.out.println("papa");
			break;
		case 1:
			u.addp(c.addp());
				
			System.out.println("dodano nowego pracownika");
			break;
			
		case 2:
			u.adds(c.adds());
				
			System.out.println("dodano nowego studenta");
			break;
		case 3:
			info.Student(u);
			break;
		case 4:
			info.Pracownik(u);
			break;
		case 5:
			u.ile();
			info.Student(u);
			info.Pracownik(u);
			break;
		}
		}
		c.close();
		sc.close();
	}
}

