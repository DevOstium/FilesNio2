package nio2.serializacao.model;

import java.io.Serializable;


public class Endereco implements Serializable {

	//É necessario usar o serialVersionUID para que seja possivel alterar a classe que foi serializada e salva num arquivo,
	// pq ele inseri o serialVersionUID no arquivo
	private static final long serialVersionUID = 1L;
	
	private String rua;
	private int numero;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
