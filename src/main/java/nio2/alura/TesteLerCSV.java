package nio2.alura;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLerCSV {

	public static void main(String[] args) throws IOException {

		
		ArrayList<Object> lista = new ArrayList<>();
		try ( Scanner scanner = new Scanner(new File ("arquivo.csv"), "UTF-8")){
			
			while(  scanner.hasNextLine() ) {
				String line = scanner.nextLine();
				//System.out.println("line : " + line);

				String[] split = line.split(",");
				//System.out.println("Arrays.toString :  " + Arrays.toString(split));
				//System.out.println("*********");
			    
				try( Scanner linhaScanner = new Scanner(line) ) {
					linhaScanner.useLocale(Locale.US);
					linhaScanner.useDelimiter(",");
					 
					//https://www.baeldung.com/java-printstream-printf
					while(  linhaScanner.hasNextLine() ) {
						 	//String.format("%s %s %s %s %s", linhaScanner.next());
						   
						String dado = linhaScanner.next();
						
						    System.out.println(dado);

					   }
				}
				
				
				//for(int i=0; i< split.length; i++) {
					//lista.add(split[i]);
					//System.out.println(split[i]);
				//}
				
			}
		}
		
	}
}
