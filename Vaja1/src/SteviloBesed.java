import java.io.*;

public class SteviloBesed {
	
	public static int steviloBesed(String ime)throws IOException{
		BufferedReader vhod = new BufferedReader(new FileReader(ime));
		int stevec = 0;
		while(vhod.ready()){
			String vrstica = vhod.readLine().trim();
			String[] besede = vrstica.split(" +");
			stevec += besede.length;
		}
		vhod.close();
		return stevec;
	}

	public static void main(String[] args)throws IOException{
		System.out.print(steviloBesed("U:/workspace/Vaja1/src/test.txt"));
	}

}
