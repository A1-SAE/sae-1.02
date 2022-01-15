import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Dictionnaire {
    HTNaive htn;

    public Dictionnaire(int m){
        this.htn = new HTNaive(m);
    }

    public Dictionnaire(String fileName, int m){
        this.htn = new HTNaive(Dictionnaire.calculeListeInt(fileName), m);
    }

    public Dictionnaire(String fileName, double f){
        this.htn = new HTNaive(Dictionnaire.calculeListeInt(fileName), f);
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

    public static ListeBigI calculeListeInt(String fileName){
        File f = new File(fileName);
        ListeBigI res = new ListeBigI();
        Scanner sc;
        //un scanner est un objet permettant de "scanner" (parcourir)
        //une entrée (clavier, ou une chaîne, ou un File, etc)
        try {
            sc = new Scanner(f);
            //ici on construit le scanner avec comme entrée f
            //cette construction peut échouer (si par exemple fichier.txt n’existe pas)
        }
        catch(FileNotFoundException e){
            //si la construction échoue, on passe ici
            System.out.println(("problème d’accès au fichier " + e.getMessage()));
            return new ListeBigI();
        }
        sc.useDelimiter(" |\\n|,|;|:|\\.|!|\\?|-");
        //on définit les délimiteurs comme le caractère ’\n’, le caractère ’,’ etc...
        //cela définit maintenant la notion de "morceau" comme une suite
        //de caractères entre deux délimiteurs
        ListeBigI mots = new ListeBigI();
        while (sc.hasNext()) { //sc.hasNext() renvoie vrai ssi
            //il reste encore un morceau à découvrir dans f
            String mot = sc.next(); //sc.next() renvoie le prochain morceau
            if(mot.length() > 0) mots.ajoutTete(Dictionnaire.stringToBigInteger(mot));
        }

        return mots;
    }

}
