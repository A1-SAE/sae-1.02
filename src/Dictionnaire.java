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

    public boolean ajout(String s){
        return this.htn.ajout(Dictionnaire.stringToBigInteger(s));
    }

    public boolean contient(String s){
        return this.htn.contient(Dictionnaire.stringToBigInteger(s));
    }

    public int getCardinal(){
        return this.htn.getCardinal();
    }

    public int getMaxSize(){
        return this.htn.getMaxSize();
    }

    public int getNbListes(){
        return this.htn.getNbListes();
    }

    public String toString(){
        return this.htn.toString();
    }

    public String toStringV2(){
        return this.htn.toStringV2();
    }
}
