package nio2.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class TesteProperties {

	public static void main(String[] args) throws Exception {

		// Este código lê as propriedades do arquivo config.txt
		{

			/*
				    1 - Compilar com o comando javac
					fagne@Fagner MINGW64 /d/DEV/BackEnd/Exemplos/arquivos_Properties_e_Serializados
					$ javac PassandoParametrosJava.java
		
					2 - Executar sem colocar a extensão .class do arquivo 
					fagne@Fagner MINGW64 /d/DEV/BackEnd/Exemplos/arquivos_Properties_e_Serializados
					 
					Passando os parametros: param1 param2 param4 
					
					$ java PassandoParametrosJava param1 param2 param4
					Os parametros passados são: param1
					Os parametros passados são: param2
					Os parametros passados são: param4
			*/
			for (String param : args) {
				System.out.println("Listando o argumento passado como parametro : " + param);
			}

			Properties p = new Properties();
			InputStream is = new FileInputStream("config.properties.txt");

			// Carrega os Arquivos
			p.load(is);

			System.out.println(p.getProperty("nomeAplicacao"));
			System.out.println(p.getProperty("versao"));
			System.out.println(p.getProperty("templates"));

			is.close();
		}

		// Este código salva as propriedades no arquivo config2.txt
		{
			Properties p = new Properties();
			p.setProperty("nomeAplicacao", "Um nome qualquer");
			p.setProperty("versao", "1.0");
			p.setProperty("usario", "admin");

			OutputStream os = new FileOutputStream("config2.txt");
			p.store(os, "Arquivo config2.txt");

			// Criar um arquivo
			os.close();
		}
	}

}
