package nio2.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TesteFiles {

	public static void main(String[] args) throws IOException {

		// Sempre verificar se o arquivo EXISTE
		
		Path path = Paths.get("C:\\temp\\arquivo.txt");
		// Files permite trabalhar tanto com arquivos como com diretorios tb
		// existsFile verifica se o arquivo existe no diretorio
		boolean existsFile = Files.exists(path);
		System.out.println("existsFile : " + existsFile);

		Path pathOrigen = Paths.get("C:\\temp\\arquivo.txt");
		Path pathDestino = Paths.get("C:\\temp\\arquivo2.txt");

		//Se o arquivo já existe ele dar error
		//Files.copy(pathOrigen, pathDestino);
		
		// Para subscrever o arquivo
		//Files.copy(pathOrigen, pathDestino, StandardCopyOption.REPLACE_EXISTING);

		//Mover arquivos
		//Files.move(pathOrigen, pathDestino, StandardCopyOption.REPLACE_EXISTING);

		//Delete
		//Files.delete(pathDestino);
		
		//Esse não gera exception - nao gera erro se o arquivo nao existir
		//Files.deleteIfExists(pathDestino);

		
		//Criar Arquivo se o arquivo não existir
		//Files.createFile(pathDestino);
		
		//Criar arquivo temporario
		//Files.createTempFile(Paths.get("C:\\temp"), "temp__", ".tmp");
		
		//Criar 1 Diretorio
		//Files.createDirectory(Paths.get("C:\\temp\\createDiretorio"));
		
		//Criar 1 ou mais Diretorios
		//Files.createDirectories(Paths.get("C:\\temp\\createDiretorio\\outro\\outro"));
			
		//Criar um dirtorio temporario
		//Path pathCriado = Files.createTempDirectory(Paths.get("C:\\temp\\DiretorioTemporario"), "tet");
		//System.out.println("pathCriado : " + pathCriado);
	
		
	}
}





