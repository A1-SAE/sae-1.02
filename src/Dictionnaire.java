import java.math.BigInteger;

public class Dictionnaire {
    HTNaive htn;

    public Dictionnaire(int m){
        this.htn = new HTNaive(m);
    }

    public static BigInteger stringToBigInteger(String s){
        char[] lettres = s.toCharArray();

        BigInteger res = BigInteger.valueOf(lettres[0]);
        for(int i = 1; i < lettres.length; i++){
            res = res.multiply(BigInteger.valueOf(256)).add(BigInteger.valueOf(lettres[i]));
        }

        return res;
    }
}
