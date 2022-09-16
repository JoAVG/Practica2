package problems;

public class RepiteX {
	public short numArreglo(int nums[], float x) {
        short rep=0;   //C.E. (1)   //C.T. (1)
        for(int i=0; i<nums.length; i++) {   //C.T. (n)
            if(nums[i]==x) rep++;            //C.T. (1)
        }
        return rep;        //C.T. (1)
    }
}
//Complejidad Espacial = 1 = 1 "Se declararon 1 variables extras"
//Complejidad Temporal = 1+(n(1))+1 = 2+n = O(n) una complejidad Lineal.