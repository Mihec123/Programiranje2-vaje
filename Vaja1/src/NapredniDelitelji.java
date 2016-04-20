import java.util.Set;
import java.util.TreeSet;

public class NapredniDelitelji {
	public static Set<Integer> delitelji(Integer n){
		TreeSet<Integer> mnozica = new TreeSet<Integer>();
		for(int i = 1 ; i <= n ; ++i){
			if(n % i == 0){
				mnozica.add(i);
			}
			}
		return mnozica;
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.print(delitelji(n));
		for(Integer x: delitelji(n)) System.out.print(x+"\n");
	}
}
