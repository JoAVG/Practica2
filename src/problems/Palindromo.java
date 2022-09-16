package problems;

public class Palindromo {
	 public boolean palindromo(String cadena) {
		 String invertida = new StringBuilder(cadena).reverse().toString();	  //C.E. (1)   //C.T. (1)
		 return invertida.equals(cadena);	   //C.T. (1)
	 }
	}
	//Complejidad Espacial = 1 = 1 "Se declararon 1 variables extras"
	//Complejidad Temporal = 1+1 = 2 = O(1) una complejidad Constante.