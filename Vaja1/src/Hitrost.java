import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Hitrost {
	
	public static void main(String[] args)throws IOException{
		System.out.print(preberi("U:/workspace/Vaja1/hitrosti.txt","U:/workspace/Vaja1/krsitelji.txt"));
	}
	
	public static int preberi(String ime,String ime1)throws IOException{
		BufferedReader vhod = new BufferedReader(new FileReader(ime));
		PrintWriter izhod = new PrintWriter(new FileWriter(ime1));
		while(vhod.ready()){
			String vrstica = vhod.readLine().trim();
			String[] besede = vrstica.split(" +");
			String tablica = besede[2];
			double povprecna = hitrost(Double.parseDouble(besede[0]),Double.parseDouble(besede[1]),622);
			if (povprecna > 80){
				System.out.print(povprecna+" "+tablica+"\n");
				izhod.println(povprecna+" "+tablica+"\n");
				}
			}
		izhod.close();
		vhod.close();
		return 0;
	}
	
	public static double hitrost(double vhodna,double izhodna,double dolzina){
		double povprecna = dolzina/(izhodna - vhodna) * 3.6;
		System.out.print(povprecna +"\n");
		return povprecna;
	}

}
