package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
				
		// fluxo de entrada de um Arquivo para leitura de uma linha inteira.		
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis); // tranforma bytes em caracteres
		BufferedReader br = new BufferedReader(isr); // juntar varias caracteres de uma linha
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer isw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(isw);
		
		String linha = br.readLine();
		
		while (linha != null) {
			bw.write(linha);
			linha = br.readLine();
			if (linha != null) {
				bw.newLine();
			}
			
		}
				
		br.close();
		bw.close();
	}

}
