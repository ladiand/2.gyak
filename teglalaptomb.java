
public class teglalaptomb {

	public static void main(String[] args) {
		int meret = 10;
		teglalap[] teglalaptomb = new teglalap[meret];
		
		for (int i = 0; i < teglalaptomb.length; i++) {
		teglalaptomb [i] = new teglalap ((int)(Math.random() * 9) + 2,
				(int)(Math.random() * 9) + 2);
		
		System.out.println(teglalaptomb[i]);
		}
		int min_teruletu_teglalap_indexe = 0;
		int minindex = 0;
		for (int i = 1; i < teglalaptomb.length; i++){
			if (teglalaptomb[minindex].teruletNagyobbMint(teglalaptomb[i]));
			minindex = i;
		}
		System.out.println("a legkissebb negyzet:");
	System.out.println(teglalaptomb[minindex]);
	}
	
}
