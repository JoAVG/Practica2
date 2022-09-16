package problems;

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
		
		//Problema b)
		RepiteX rx = new RepiteX();
		int i[] = {1,2,3,4,2,42,2};
		rx.numArreglo(i[], 2);
		
		//Problema d)
		
		
		
	}
}