package problems;

public class NumCapicua {
	public boolean numCapicua(int num) { 	
        int falta=num, numInvertido=0; //C.E. (1)   //C.T. (1)
        int resto;                     //C.E. (1)   //C.T. (1)
        while (falta>0) {							//C.T. (n)
            resto = falta % 10;						//C.T. (1)
            falta = falta / 10;                     //C.T. (1)
            numInvertido = numInvertido * 10 + resto; //C.T. (1)
        }
        return (numInvertido==num);                    //C.T. (1)
    }
}

//Complejidad Espacial = 1+1 = 2 "Se declararon 2 variables extras"
//Complejidad Temporal = 1+1+(n(1+1+1))+1 = 3 + 3n = O(n) una complejidad Lineal.

//Complejidad Espacial = 1+1 = 2 "Se declararon 2 variables extras"
//Complejidad Temporal = 1+1+(n(1+1+1))+1 = 3 + 3n = O(n) una complejidad Lineal.
