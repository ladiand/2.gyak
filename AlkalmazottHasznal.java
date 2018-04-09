import java.util.Random;
import java.util.Scanner;


public class AlkalmazottHasznal {

	public static void main(String[] args) {
		Scanner beolvasas = new Scanner(System.in);
	int meret;
	System.out.println("Kerem adja meg az alkalmazottak szamat!");
	System.out.println("meret=");
	meret = beolvasas.nextInt();
	
	AlkalmazottOsztaly_1 alkalmazottak[] = new AlkalmazottOsztaly_1[meret];
	
	Random veletlenszamobjektum = new Random();
	
	int nyugdijkorhatar = AlkalmazottOsztaly_1.getNyugdijkorhatar();
	
	for (int i = 0; i < alkalmazottak.length; i++) {
		alkalmazottak[i] = new AlkalmazottOsztaly_1 ("XY" + (i + 1), kor, veletlenszamobjektum.nextInt(nyugdijkorhatar));
	System.out.println(alkalmazottak[i]);
	}
	AlkalmazottOsztaly_1.setNyugdijkorhatar(70);
	
	System.out.println("korhataremeles");
	
	for (AlkalmazottOsztaly_1 alkalmazottOsztaly_1 : alkalmazottak) {
		System.out.println(alkalmazottOsztaly_1);
	}
	
	for (AlkalmazottOsztaly_1 alkalmazottOsztaly_1 : alkalmazottak) {
		if (alkalmazottOsztaly_1.hanyEvVanMegNyugdijig() < 5) {
			System.out.println("alkalmazottOsztaly_1");
		}
	}
	
		beolvasas.close();
	}
	
	
}
