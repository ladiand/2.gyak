
public class teglalap<Teglalap> {
	
	private int a_oldal;
	private int b_oldal;
	
	//konstruktor
	public teglalap(int a_oldal, int b_oldal) {
		setOldalak(a_oldal, b_oldal);
	}
	
	public teglalap(int oldalhossz) {
		setOldalak(oldalhossz);
	}

	public int terulet() {
		return a_oldal * b_oldal;
	}

	@Override
	public String toString() {
		return  + a_oldal + ", " + b_oldal
				+ ": " + terulet();
	}

	public void setOldalak(int a_oldal, int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	public void setOldalak(int oldalhossz) {
		//this.a_oldal = this.b_oldal = oldalhossz;
		this.a_oldal = oldalhossz;
		this.b_oldal = oldalhossz;
	}
	public boolean teruletNagyobbMint(teglalap masikTeglalap) {
		return terulet() > masikTeglalap.terulet();
	}
	public boolean egyezikE(teglalap masikteglalap) {
		return a_oldal == masikteglalap.a_oldal
				&& b_oldal == masikteglalap.b_oldal;
	}
}