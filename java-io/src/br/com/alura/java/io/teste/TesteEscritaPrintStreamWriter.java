package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamWriter {

	public static void main(String[] args) throws IOException {
		
		// modelo mais complexo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer isw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(isw);
		
		// modelo mais enxuto
		//FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));	
		
//		PrintStream ps = new PrintStream("lorem2.txt");
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println();
		ps.println("alsha shdflhdf lçcahd fch oldhcalcsd açoedhmaoercy");
			
		ps.close();
	}

}
