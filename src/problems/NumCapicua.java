package problems;

public class NumCapicua {
	public boolean numCapicua(int num) {
        int falta=num, numInvertido=0;
        while (falta>0) {
            int resto = falta % 10;
            falta = falta / 10;
            numInvertido = numInvertido * 10 + resto;
        }
        return (numInvertido==num);
    }
}
