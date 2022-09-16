package problems;

import noc.RepiteX;
import problems.src.problems.ProblemaE;

public class Main {

	public static void main(String[] args) {
		//Metodo a)
		Pares pr = new Pares();
		System.out.println(pr.pares(2255226)); 
		
		//Metodo b)
		Palindromo pld = new Palindromo();
		System.out.println(pld.palindromo("somos"));
		
		//Problema c)
		
		NumCapicua nm = new NumCapicua();
		nm.numCapicua(6533256);
		
		//Problema d)
		RepiteX rx = new RepiteX();
		float[] i = {1,2,3,4,2,42,2}; 
		 rx.numArreglo(i, 3);
		
		//Problema e)
		
		 ProblemaE pe = new ProblemaE();
			int[] i = {1,2,3,4,2,5,2}; 
			int[] b = pe.ordenarS(i);
			for(int j=0; j < i.length; j++) {
				System.out.println(b[j]);
			}
		
	}
}