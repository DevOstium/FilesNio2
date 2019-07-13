package nio2.criarArquivo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteCriarArquivos {

	public static void main(String[] args) throws IOException {

		Path arquivoGeradoPDF = Paths.get("C:\\temp\\arquivo-gerado.pdf");
		Path arquivoGeradoTXT = Paths.get("C:\\temp\\arquivo-gerado.txt");

		try (OutputStream gerarPDF = Files.newOutputStream(arquivoGeradoPDF)) {
			gerarPDF.write(30);
		}

		try (BufferedWriter gerarTXT = Files.newBufferedWriter(arquivoGeradoTXT)) {
			gerarTXT.write("Inserindo texto dentro do arquivo");
		}

		
		
	}
}
