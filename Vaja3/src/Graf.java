import java.util.HashMap;
import java.util.Map;
import java.util.Vector;


public class Graf {

	public Map<Object,Tocka> tocke;

	public Graf() {
		this.tocke = new HashMap<Object,Tocka>();
	}

	public Tocka tocka(Object ime){
		return tocke.get(ime);

	}

	public Boolean povezava(Object prva, Object druga){
		Boolean jePovezava = false;
		if(tocke.get(prva).sosedi.contains(druga)){
			jePovezava = true;
		}
		return jePovezava;
	}

	public void dodajTocko(Tocka a){
		if(!tocke.containsKey(a.ime)){
			this.tocke.put(a.ime, a);
		}

	}

	public void dodajPovezavo(Tocka a,Tocka b){
		if(a != b){
			a.sosedi.add(b);
			b.sosedi.add(a);
		}
	}

	public void odstraniPovezavo(Tocka a,Tocka b){
		a.sosedi.remove(b);
		b.sosedi.remove(a);
	}

	public void odstraniTocko(Tocka a){
		for(Tocka el: a.sosedi){
			odstraniPovezavo(el,a);
		}
		this.tocke.remove(a);
	}

	public static Graf prazen(int n){
		Graf ntock = new Graf();
		for(int i = 0; i < n; i++){
			ntock.dodajTocko(new Tocka(i));
		}
		return ntock;

	}

	public static Graf cikel(int n){
		Graf ciku = Graf.prazen(n);
		for(int i = 1; i < n; i++){
			ciku.dodajPovezavo(ciku.tocka(i), ciku.tocka(i-1));
		}
		ciku.dodajPovezavo(ciku.tocka(0), ciku.tocka(n-1));

		return ciku;

	}

	public static Graf poln(int n){
		Graf poln = Graf.prazen(n);
		for(int i = 0; i < n; i++){
			for(int j = 0; j < i; j++){
				poln.dodajPovezavo(poln.tocka(i), poln.tocka(j));	
			}

		}
		return poln;
	}

	public static Graf polnDvodelen(int n, int m){
		Graf dvodelen = Graf.prazen(n+m);
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n+m; j++){
				dvodelen.dodajPovezavo(dvodelen.tocka(i), dvodelen.tocka(j));
			}
		}
		return dvodelen;
	}

	public Boolean povezan(Graf a){
		Tocka b = a.tocke.values().iterator().next();
		Vector<Tocka> povezave = new Vector<Tocka>();
		povezave.add(b);
		for (Tocka j: povezave){
		for(Tocka i : j.sosedi){
			if (! povezave.contains(i)){
				povezave.add(i);
			}
		}
		}
		return povezave.size() == a.tocke.size();

	}
	public void razporedi(double x, double y, double r){
		int n = this.tocke.size();
		int i = 0;
		for(Tocka t: this.tocke.values()){
			t.x = r*Math.cos((2*i*Math.PI)/n) + x;
			t.y = r*Math.sin((2*i*Math.PI)/n)+ y;
			i ++;
		}
		
	}



}
