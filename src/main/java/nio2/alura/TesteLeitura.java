package nio2.alura;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		//Dica: Stream sempre da bytes
		//      Reader sempre para caracteres, texto       
		
		FileInputStream      file    = new FileInputStream("lorem.txt");
		InputStreamReader    reader  = new InputStreamReader(file);
		try( BufferedReader  dados   = new BufferedReader(reader) ) {
				String line = dados.readLine();
				while ( (line = dados.readLine()) != null) {
					System.out.println(line);
				}
		}
		
		//Codigo para Java 7
		System.out.println(" \n\n Usando o NIO2 Paths \n");	
		Path path = Paths.get("lorem.txt");
		try( BufferedReader dado = Files.newBufferedReader(path) ){
			String linhas = dado.readLine();
			while( (linhas = dado.readLine()) != null ) {
				System.out.println(linhas);
			}
		}
		
	}
}
