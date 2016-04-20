import java.util.HashSet;
import java.util.Set;


public class Tocka {
	Object ime;
	Set<Tocka> sosedi;
	
	public Tocka(Object a) {
		this.ime = a;
		this.sosedi = new HashSet<Tocka>();
	}
	
	public Integer stopnja(Tocka a){
		return this.sosedi.size();
	}
	

}
