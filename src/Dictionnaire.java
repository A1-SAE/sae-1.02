import java.math.BigInteger;

public class Dictionnaire {
    HTNaive htn;

    public Dictionnaire(int m){
        this.htn = new HTNaive(m);
    }

    public static BigInteger stringToBigInteger(String s){
        char[] lettres = s.toCharArray();
        int[] ascii = new int[lettres.length];
        for(int i = 0; i < ascii.length; i++){ // liste des lettres en ascii inversée pour le calcul
            ascii[i] = lettres[ascii.length - 1 - i];
        }

        BigInteger res = BigInteger.valueOf(0);
        BigInteger base = BigInteger.valueOf(1);
        for(int i = 0; i < ascii.length; i++){
            res = res.add(base.multiply(BigInteger.valueOf(ascii[i]))) ;
            base = base.multiply(BigInteger.valueOf(256));
        }

        return res;
    }
}
