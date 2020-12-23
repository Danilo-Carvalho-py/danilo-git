package br.com.alura.java.io.teste;

import java.nio.charset.Charset;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) {
		
		String s = "C";
		System.out.println(s.codePointAt(0)); // Localizara posi��o da letra "C" na tabela UNICODE
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName()); // Que tipo de ENCODINGS � usado pelo ECLIPSE
		
		byte[] bytes = s.getBytes();
		System.out.println(bytes.length + ", windows-1252 ");

	}

}
