import java.util.List;
import java.util.ArrayList;


public class RazcepNaPrafaktorje {
	public static List<Integer> pradelitelji(int stevilo){
		int n = stevilo;
		List<Integer> mnozica = new ArrayList<Integer>();
		for(int i = 2;i <= n;++i){
			while(n % i ==0){
			mnozica.add(i);
			n /= i;
			}
		}
		return mnozica;		
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.print(pradelitelji(n));
	}
}

