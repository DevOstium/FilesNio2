package nio2.alura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		//OutputStream        file   = new FileOutputStream("lorem2.txt");
		//Writer              write  = new OutputStreamWriter(file);
	
		
		//try( PrintStream print = new PrintStream("lorem4.txt")) {
		//try( PrintStream print = new PrintStream(new File("lorem5.txt") )) {
		
		try( PrintWriter print = new PrintWriter("lorem7.txt") ) {
					
				print.println("Inserindo dados no arquivo");
				print.println(System.lineSeparator());
				print.println(System.lineSeparator());
				print.println("mais texto");
				print.println(System.lineSeparator());
				print.println(System.lineSeparator());
				print.println("fim");
		}
			
	}
}
