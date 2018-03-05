import java.util.Scanner;


public class alkHasz {


	public static void main(String[] args) {
		alkalmazott Alkalmazott = new alkalmazott();
		//Alkalmazott.nev = "Kiss Jozsef";
		Alkalmazott.setNev("Kiss Jozsef");
		//Alkalmazott.fizetes = 10;
		Alkalmazott.setFizetes(20);
		
		//System.out.println(Alkalmazott.nev);
		System.out.println(Alkalmazott.toString());
		System.out.println(Alkalmazott.getNev());
		System.out.println(Alkalmazott.getFizetes());
		Alkalmazott.fizetestNovel(5);
		System.out.println(Alkalmazott);
		System.out.println(Alkalmazott.fizetesIntervallumokKozott(10, 30));
		System.out.println(Alkalmazott.fizetendoAdo());
		
		alkalmazott Alkalmazott2 = new alkalmazott();
		Alkalmazott2.setNev("Kiss Klaudia");
		Alkalmazott2.setFizetes(80);
		
		System.out.println(Alkalmazott.nagyobbfizetesuMint(Alkalmazott2));
		System.out.println(Alkalmazott2.nagyobbfizetesuMint(Alkalmazott));
		
		alkalmazott [] Alkalmazottak = new alkalmazott [5];
		
		for (int i = 0; i < Alkalmazottak.length; i++) {
			Alkalmazottak[i] = new alkalmazott ();
			Alkalmazottak[i].setNev("A");
			Alkalmazottak[i].setFizetes((long) Math.random() *50 +1 );
			System.out.println(Alkalmazottak[i]);
			
		}
	}

}
