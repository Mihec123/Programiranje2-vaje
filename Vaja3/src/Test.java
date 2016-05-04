
public class Test {

	public static void main(String[] args) {
		Graf test = Graf.poln(5);
		test.razporedi(300, 300, 250);
		Okno okno = new Okno();
		okno.pack();
		okno.setVisible(true);
		okno.platno.narisi(test);

	}

}
