import java.util.HashMap;
import java.util.Map;


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
	
	public void dodajTocko(Object a){
		if(!tocke.containsKey(a)){
			this.tocke.put(a, new Tocka(a));
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
	
	
	
	

}
