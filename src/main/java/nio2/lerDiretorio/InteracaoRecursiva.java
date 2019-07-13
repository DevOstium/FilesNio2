package nio2.lerDiretorio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InteracaoRecursiva {

	public static void main(String[] args) throws IOException {
		
		Path diretorioStart = Paths.get("C:\\temp");
		
		//SearchFile searchFile = new SearchFile("txt");
		//Files.walkFileTree(diretorioStart, searchFile);

		PesquisaArquivo pesquisaArquivo = new PesquisaArquivo("txt");
		Files.walkFileTree(diretorioStart, pesquisaArquivo );

		
		
		
		
	}
}
