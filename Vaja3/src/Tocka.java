import java.util.HashSet;
import java.util.Set;


public class Tocka {
	Object ime;
	Set<Tocka> sosedi;
	double x;
	double y;
	public Tocka(Object a) {
		this.ime = a;
		this.x = 0;
		this.y = 0;
		this.sosedi = new HashSet<Tocka>();
	}
	
	public Integer stopnja(Tocka a){
		return this.sosedi.size();
	}
	

}
