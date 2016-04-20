import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;


public class FrekvencaBesed {

	public static void main(String[] args)throws IOException {
		System.out.print(frekvenca("U:/workspace/Vaja1/test.txt"));
	}
	
	public static Map<String, Integer> frekvenca(String ime)throws IOException{
		BufferedReader vhod = new BufferedReader(new FileReader(ime));
		Map<String, Integer> slovar = new HashMap<String, Integer>();
		while(vhod.ready()){
			String vrstica = vhod.readLine();
			StringTokenizer st = new StringTokenizer(vrstica," .,()[]<>...");
			while(st.hasMoreTokens()){
				String beseda = st.nextToken();
				if (slovar.containsKey(beseda)){
					   int vrednost = slovar.get(beseda);
					   vrednost += 1;
					   slovar.replace(beseda, vrednost- 1, vrednost);
				}
				else{
					slovar.put(beseda, 1);
				}
			}
		}
		vhod.close();
		return slovar;
	}
	
	public static Vector<String> vektor(Map<String, Integer> slovar){
		Vector<String> vec = new Vector<String>();
		return vec;
		
		
	}

}
