package nio2.lerDiretorio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LerDiretorio {

	public static void main(String[] args) throws IOException {

		Path diretorio = Paths.get("C:\\temp");

		// Percorre todo o diretorio, sendo pastas e arquivos 
		// Mas nao entra nos diretorios
		/*
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(diretorio)) {
			for (Path path : stream) {
				System.out.println(path);
			}
		}
		*/
		
		//Usando o Filtro Glob - Pesquisa, retorna somente os aquivos que terminal com *.pdf
		// Seu quero que comece com a e termine com pdf  : a*.pdf
		// Tudo termina com tx e mais um caractre qualquer *.tx?
		// o Glob funciona somente para pesquisa com o nome do arquivo
		/*
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(diretorio, "*.tx?")) {
			for (Path path : stream) {
				System.out.println(path);
			}
		}
		*/
		
		
		
		// Usando Filtros
		// exemplo 1: Retorna somente os diretorios :  path -> Files.isDirectory(path) ou com referencia a method Files::isDirectory 
		// exemplo 2: Retorna somente os arquivos   :  path -> Files.isRegularFile(path)
		// exemplo 3: Retorna somente os arquivos maior que 10 bytes : path -> Files.size(path) > 10  
		/*
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(diretorio, path -> Files.size(path) > 10  )) {
			for (Path path : stream) {
				System.out.println(path);
			}
		}
		*/
		
	}
}

















