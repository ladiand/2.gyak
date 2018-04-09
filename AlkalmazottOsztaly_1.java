
public class AlkalmazottOsztaly_1 {

	private String nev;
	private int kor;
	private long fizetes;
	private static int nyugdijkorhatar = 65;
	
	public AlkalmazottOsztaly_1(String nev, int kor, long fizetes) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	
	public AlkalmazottOsztaly_1(String nev, int kor, long fizetes) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = kor * 10000;
	}
	
	public int hanyEvVanMegNyugdijig() {
		return nyugdijkorhatar - kor;
	}

	@Override
	public String toString() {
		return "AlkalmazottOsztaly_1 [nev=" + nev + ", kor=" + kor
				+ ", fizetes=" + fizetes + ", hany ev van meg hatra a nyugdijig="
				+ hanyEvVanMegNyugdijig() + "]";
	}
	//csak randomhoz
	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}

	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		AlkalmazottOsztaly_1.nyugdijkorhatar = nyugdijkorhatar;
	}
	
	public static AlkalmazottOsztaly_1 tobbEveVanHatraANyugdijig(
				AlkalmazottOsztaly_1 elsoAlkalmazott,
		AlkalmazottOsztaly_1 masodikAlkalmazott)
	{
		if (elsoAlkalmazott.hanyEvVanMegNyugdijig() > masodikAlkalmazott.hanyEvVanMegNyugdijig()) {
			return elsoAlkalmazott;
		} else {
			return masodikAlkalmazott;
		}
	}
	
	
}
