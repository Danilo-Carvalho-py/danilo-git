package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteRede {

	public static void main(String[] args) throws IOException {
				
		// fluxo de entrada de um Arquivo para leitura de uma linha inteira.		
		
		InputStream fis = System.in; // LEITURA PELO TECLADO // new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis); // tranforma bytes em caracteres
		BufferedReader br = new BufferedReader(isr); // juntar varias caracteres de uma linha
		
		OutputStream fos = System.out;//new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while (linha != null && !linha.isEmpty()) { // isEmpty, verifica se q linha está vazia
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();						
		}
				
		br.close();
		bw.close();
	}

}
