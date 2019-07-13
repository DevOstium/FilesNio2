package nio2.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestePath {

	public static void main(String[] args) {

		// get crio uma instância de caminhos de arquivos
		Path p1 = Paths.get("c:\\Temp\\arquivo.txt");
		Path p2 = Paths.get("c:", "Temo", "arquivo.txt");

		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);

		Path p3 = Paths.get("myFile.txt");
		System.out.println("p3 : " + p3);

		Path p4 = Paths.get("D:", "Files");
		System.out.println("p4 : " + p4);

		// Concatenar, juntar caminhos para um arquivo
		Path p5 = p4.resolve(p3);
		System.out.println("p5 : " + p5);

		Path p6 = Paths.get("C:", "Temp", "arquivo.txt");
		System.out.println("p6 : " + p6.getFileName());
		System.out.println("Root : " + p6.getRoot());
		System.out.println("Quantidade de Diretorios : " + p6.getNameCount());
		System.out.println("Quantidade de Diretorios : " + p6.getName(0));

	}
}
