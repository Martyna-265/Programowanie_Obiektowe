package pl.edu.pw.mini.po.konduktor.wagon;

public enum Stolik {
	Stolik_1(1), Stolik_2(2), Stolik_3(3), Stolik_4(4), Stolik_5(5), Stolik_6(6), Stolik_7(7), Stolik_8(8);

	private int i;
	
	Stolik(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}
	
}
