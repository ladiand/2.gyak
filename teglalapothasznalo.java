
public class teglalapothasznalo {
	public static void main(String[] args) {
		teglalap a_objektum = new teglalap(2);
		teglalap b_objektum = new teglalap(3, 4);
		teglalap c_objektum;
		c_objektum = a_objektum;
		
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		a_objektum.setOldalak(5);
		
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		a_objektum.setOldalak(3, 4);
		
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
	
		System.out.println(a_objektum == b_objektum);
		System.out.println(a_objektum == c_objektum);
		System.out.println(a_objektum.egyezikE(b_objektum));
		
	}
}
