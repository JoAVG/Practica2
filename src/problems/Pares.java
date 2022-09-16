package problems;

public class Pares {
	
	public int pares(int n) {
		int resultado = 0;      //C.E. (1)   //C.T. (1)
	    String numCadena = "";	 //C.E. (1)   //C.T. (1)
	    int maxNum =Integer.toString(n).length();   //C.E. (1)   //C.T. (1)
	    
		if(n > 0) {                               //C.T. (1)
		 for(int i=0; i < maxNum; i++) {          //C.T. (n)
			 if((n%10)%2 == 0){                   //C.T. (1)
			 resultado ++;                        //C.T. (1)
			 }
			 if(n>10) {                           //C.T. (1)
			 numCadena = Integer.toString(n);     //C.T. (1)
			 numCadena = numCadena.substring(0, numCadena.length()-1); //C.T. (1)
			 n = Integer.parseInt(numCadena);   //C.T. (1)
			 }
		 }
		}
		return resultado;      //C.T. (1)
	}
}

//Complejidad Espacial = 1+1+1 = 3 "Se declararon 3 variables extras"
//Complejidad Temporal = 1+1+1+1+(n(1+1+1+1+1+1))+1 = 5+6n = O(n) una complejidad Lineal.
