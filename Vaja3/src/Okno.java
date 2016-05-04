import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Okno extends JFrame {
protected Platno platno;

public Okno(){
	super();
	setTitle("Grafika");
	platno = new Platno(600,600);
	add(platno);
}

}
