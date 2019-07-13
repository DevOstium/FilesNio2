package nio2.lerDiretorio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PesquisaArquivo extends SimpleFileVisitor<Path> {

	private String fileName;

	public PesquisaArquivo(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("SimpleFileVisitor");
		System.out.println("Acessando o arquivo : " + file);

		if (file.getFileName().toString().contains(fileName)) {
			System.out.println("Arquivo encontrado em : " + file);

			return FileVisitResult.TERMINATE;
		}

		return FileVisitResult.CONTINUE;
	}

}
