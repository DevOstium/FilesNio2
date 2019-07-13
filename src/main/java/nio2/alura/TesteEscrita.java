package nio2.alura;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		OutputStream        file   = new FileOutputStream("lorem2.txt");
		Writer              write  = new OutputStreamWriter(file);
	
		try( BufferedWriter      dados  = new BufferedWriter(write) ) {
			dados.write("Inserindo dados no arquivo");
			dados.newLine();
			dados.write("mais texto");
			dados.newLine();
			dados.write("fim");
		}

	}
}
