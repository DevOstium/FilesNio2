package nio2.alura;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteEncode {

	public static void main(String[] args) throws IOException {

		String c = "C";
		System.out.println("Retorna a posicao do array da tabela de unicode : " + c.codePointAt(0));

		Charset charset = Charset.defaultCharset();
		System.out.println("charset.displayName() : " + charset.displayName());

		byte[] bytes = c.getBytes("windows-1252");
		System.out.println("bytes : " + bytes.length);

		bytes = c.getBytes("UTF-16");
		System.out.println("bytes : " + bytes.length);

		bytes = c.getBytes(StandardCharsets.US_ASCII);
		System.out.println("bytes : " + bytes.length);

		//Parse bytes em String
		bytes = c.getBytes(StandardCharsets.US_ASCII);
		String novaString = new String(bytes);
		System.out.println("novaString : " + novaString);

	
	}

}
