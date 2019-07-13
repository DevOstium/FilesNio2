package nio2.lerArquivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TesteLerArquivo {

	public static void main(String[] args) throws IOException {

		Path arquivoPDF = Paths.get("C:\\temp\\CV_Fagner_Lira.pdf");
		Path arquivoTXT = Paths.get("C:\\temp\\arquivo.txt");

		// newInputStream indica para usar com araquivos binarios, por exemplo: PDF
		// Carrega a informacao na forma de bytes e nao na forma de texto
		InputStream pdf = Files.newInputStream(arquivoPDF);
		System.out.println(pdf);

		System.out.println("");
		System.out.println("Lendo arquivo de TXT");
		try (BufferedReader txt = Files.newBufferedReader(arquivoTXT)) {
			String line;
			while ((line = txt.readLine()) != null) {
				System.out.println(line);
			}
		}

		byte[] bytes = Files.readAllBytes(arquivoPDF);
		for(int i=0; i< bytes.length; i++) {
			System.out.println("bytes  : " + bytes[i]);
		}

		List<String> listStrings = Files.readAllLines(arquivoTXT);
		for (String line : listStrings) {
			System.out.println("********************");
			System.out.println("List : " + line);
		}

	}
}
