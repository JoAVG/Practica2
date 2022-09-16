package problems;

public class Pares {
	
	public int pares(int n) {
		int resultado = 0;
	    String numCadena = "";
	    int maxNum =Integer.toString(n).length(); 
		if(n > 0) {
		 for(int i=0; i < maxNum; i++) {
			 if((n%10)%2 == 0){ 
			 resultado ++;
			 }
			 if(n>10) {
			 numCadena = Integer.toString(n);
			 numCadena = numCadena.substring(0, numCadena.length()-1);
			 n = Integer.parseInt(numCadena);
			 }
		 }
		}
		return resultado;
	}
}
