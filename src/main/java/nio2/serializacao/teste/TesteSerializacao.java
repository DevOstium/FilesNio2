package nio2.serializacao.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import nio2.serializacao.model.Endereco;
import nio2.serializacao.model.Usuario;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Usuario usuario = cargaDados();
		create(usuario);
		read();
	}

	private static Usuario cargaDados() {
		Endereco endereco = new Endereco();
		endereco.setNumero(33);
		endereco.setRua("Rua centro");

		Usuario usuario = new Usuario();
		usuario.setId(23);
		usuario.setNome("Fagner Lira");
		usuario.setEndereco(endereco);
		return usuario;
	}

	private static void read() throws IOException, ClassNotFoundException, FileNotFoundException {
		//  objetos serializados
		try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("usuario.qualquerExtensao")) ){
			Usuario u = (Usuario) ois.readObject();
			//ois.close();
		
			// Mostra os dados dos objetos Serializado
			System.out.println(u.getId());
			System.out.println(u.getNome());
			System.out.println(u.getEndereco().getRua());
			System.out.println(u.getEndereco().getNumero());

		}
	}

	private static void create(Usuario usuario) throws IOException, FileNotFoundException {
		// Serializa os objetos
		//try-with-resources - fechar o arquivo automaticamente
		try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("usuario.qualquerExtensao")) ){
			oos.writeObject(usuario);
			//oos.close();
		}
	}

}
