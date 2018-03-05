
/**
 * @author ladi
 *
 */
public class alkalmazott {
	private String nev;
	private long fizetes;
	
	public void fizetestNovel(long ertek) {
		fizetes += ertek;
	}
	//getter Nev
	public String getNev() {
		return nev;
	}

	public void setNev(String nevparameter) {
			nev = nevparameter;
	}

	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}

	@Override
	public String toString() {
		return "alkalmazott neve: " + nev + ", fizetese: " + fizetes + " Ft";
	}

	public boolean fizetesIntervallumokKozott(long alsohatar, long felsohatar) {
		return fizetes >= alsohatar &&
				fizetes <= felsohatar;
	}
	public long fizetendoAdo() {
		return (long) (fizetes * (16 / 100.0));
		
	}
	public boolean nagyobbfizetesuMint(alkalmazott masik) {
		return fizetes > masik.fizetes;
	}
	
	
	
}
