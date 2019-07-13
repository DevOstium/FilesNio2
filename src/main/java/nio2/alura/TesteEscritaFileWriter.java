package nio2.alura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		//OutputStream        file   = new FileOutputStream("lorem2.txt");
		//Writer              write  = new OutputStreamWriter(file);
	
		try( BufferedWriter file = new BufferedWriter(new FileWriter("lorem3.txt")) ){
				file.write("Inserindo dados no arquivo");
				file.write(System.lineSeparator());
				file.write(System.lineSeparator());
				file.write("mais texto");
				file.write(System.lineSeparator());
				file.write(System.lineSeparator());
				file.write("fim");
		}
			
	}
}
