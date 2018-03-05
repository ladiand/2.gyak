import java.util.Random;


public class masodfoku {

	public static void main(String[] args) {
	
		int tomb[] = new int[10];
		Random veletlenobjektum = new Random();
		
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = veletlenobjektum.nextInt(50) + 1;
			//tomb[i] = (int) (Math.random() * 50) +1;
			System.out.println(tomb[i]);
			
			
		}
		System.out.println("Forditott sorrendben:");
		for (int i = tomb.length - 1; i >= 0; i--){
			
			System.out.println(tomb[i]);

		}
		//legnagyobb paros szamnak megkeresese
		int legnagyobbindex = -1;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				if (legnagyobbindex == -1) {
					legnagyobbindex = i;
				}else {
					if (tomb[legnagyobbindex] < tomb[i]) {
						legnagyobbindex = i;
					}
					
				}
			}
			
		}

	}
	
}
