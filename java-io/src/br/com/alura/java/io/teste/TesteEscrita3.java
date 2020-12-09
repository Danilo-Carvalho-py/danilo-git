package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		
		// modelo mais complexo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer isw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(isw);
		
		// modelo mais enxuto
		//FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));	
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("alsha shdflhdf lçcahd fch");
				
		bw.close();
	}

}
