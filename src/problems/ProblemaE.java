package problems;

import java.util.Arrays;

public class ProblemaE {
	
	public int[] ordenarS(int numeros[]) {
	Arrays.sort(numeros);                //C.T. (1)
	int ordenado[]=numeros; //C.E. (1)   //C.T. (1)
	
	for(int i = 2; i <numeros.length; i++) {        //C.T. (n)
		for(int j=1; j<numeros.length; j++) {       //C.T. (n)
			if(numeros[j]>=numeros[i-2] && numeros[j] != numeros[i-2]) {//C.T. (1)
				ordenado[i] = numeros[j];           //C.T. (1)
			}
		}
	}
	return ordenado;    //C.T. (1)
  }
}
//Complejidad Espacial = 1 = 1 "Se declararon 1 variables extras"
//Complejidad Temporal = 1+1(n(n(1+1))+1 = 3+n² = O(n²) una complejidad cuadratica.