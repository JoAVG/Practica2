package problems;

public class Palindromo {
 public boolean palindromo(String cadena) {
	 String invertida = new StringBuilder(cadena).reverse().toString();	 
	 return invertida.equals(cadena);	  
 }
}
