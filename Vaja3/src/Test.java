
public class Test {

	public static void main(String[] args) {
		Graf test = Graf.cikel(4);
		for(Tocka a: test.tocke.values()){
			System.out.println(a.sosedi);
		}
		test.razporedi(300, 300, 250);
		Okno okno = new Okno();
		okno.pack();
		okno.setVisible(true);
		okno.platno.narisi(test);

	}

}
