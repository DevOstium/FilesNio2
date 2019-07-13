package nio2.alura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class DadosTeclado {

	public static void main(String[] args) throws IOException {

		//Leitura
		InputStream          in      =  System.in;  // new FileInputStream("lorem.txt");
        InputStreamReader    reader  =  new InputStreamReader(in);
		
        //Escrita
		OutputStream         out     =  System.out; // new FileOutputStream("dadosTeclado.txt");
		OutputStreamWriter   write   =  new OutputStreamWriter(out);
		
			try(BufferedReader     dados   = new BufferedReader(reader)){
				try( BufferedWriter  arquivoSaida  =  new BufferedWriter(write) ) {
						String    line = dados.readLine();
						while(  (line = dados.readLine()) != null && !line.isEmpty() ) {
							arquivoSaida.write(line);
							arquivoSaida.newLine();
							arquivoSaida.flush();
						}
					} // try 2
			}//try 1
		
	}
}
