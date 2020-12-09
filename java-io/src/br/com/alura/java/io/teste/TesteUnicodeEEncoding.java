package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;



public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "s";
		System.out.println(s.codePointAt(0)); // Localizara posição da letra "C" na tabela UNICODE
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName()); // Que tipo de ENCODINGS é usado pelo ECLIPSE
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252 - ");
		
		String sNovo = new String(bytes);
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16 - ");
		sNovo = new String(bytes);
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-8");
		System.out.print(bytes.length + ", UTF-8 - ");
		sNovo = new String(bytes);
		System.out.println(sNovo);

		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US-ASCII - ");
		sNovo = new String(bytes);
		System.out.println(sNovo);
	}

}
