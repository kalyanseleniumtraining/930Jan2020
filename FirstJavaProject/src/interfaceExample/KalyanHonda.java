package interfaceExample;

public class KalyanHonda implements Honda {

	public void color() {
		System.out.println("Black");

	}

	public void gears() {
		System.out.println("5");

	}

	public static void main(String[] args) {
		KalyanHonda kh = new KalyanHonda();
		kh.color();
		kh.gears();

	}

}
