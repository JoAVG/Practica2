package problems;

public class RepiteX {
	public short numArreglo(int nums[], float x) {
        short rep=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==x) rep++;
        }
        return rep;
    }
}
