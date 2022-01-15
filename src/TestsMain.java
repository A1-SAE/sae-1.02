import java.math.BigInteger;
import java.util.Random;

public class TestsMain {
    public static void main(String[] args){
        /* Q3 */
        /*HTNaive htn1 = new HTNaive(5);
        HTNaive htn2 = new HTNaive(10);*/

        /* Q6/8 */
        /*htn1.ajout(BigInteger.valueOf(500));
        htn1.ajout(BigInteger.valueOf(502));
        htn1.ajout(BigInteger.valueOf(502));
        System.out.println(htn1);

        ListeBigI l1 = new ListeBigI();
        l1.ajoutTete(BigInteger.valueOf(503));
        l1.ajoutTete(BigInteger.valueOf(503));
        l1.ajoutTete(BigInteger.valueOf(206));
        l1.ajoutTete(BigInteger.valueOf(33));
        l1.ajoutTete(BigInteger.valueOf(64));
        l1.ajoutTete(BigInteger.valueOf(2009));
        l1.ajoutTete(BigInteger.valueOf(1565614984));

        ListeBigI l2 = new ListeBigI();

        htn1.ajoutListe(l1);
        htn1.ajoutListe(l2);
        System.out.println(htn1);
        System.out.println(htn2);*/

        /* Q7 */
        /*System.out.println(htn1.contient(BigInteger.valueOf(50)));
        System.out.println(htn1.contient(BigInteger.valueOf(500)));
        System.out.println(htn1.contient(BigInteger.valueOf(503)));
        System.out.println(htn1.contient(BigInteger.valueOf(-500)));*/

        /* Q9 */
        /*System.out.println(htn1.getElements().toString());
        System.out.println(htn2.getElements().toString());*/

        /* Q12 */
        /*System.out.println(htn1.getNbListes());
        System.out.println(htn2.getNbListes());*/

        /* Q13 */
        /*System.out.println(htn1.toStringV2());
        System.out.println(htn2.toStringV2());*/

        /* Q14 */
        /*HTNaive htn3 = new HTNaive(l1, 5);
        System.out.println(htn3);

        HTNaive htn4 = new HTNaive(l2, 5);
        System.out.println(htn4);*/

        /* Q15 */
        /*HTNaive htn5 = new HTNaive(l1, (double) 2);
        System.out.println(htn5);*/

        /* Q16 */
        /*Dictionnaire d1 = new Dictionnaire(5);*/

        /* Q19 */
        /*d1.ajout("Manger");
        d1.ajout("Bite");*/

        /* Q20 */
        /*System.out.println(d1.contient("Manger"));
        System.out.println(d1.contient("rien"));
        System.out.println(d1.contient("manger"));*/

        /* Q21 */
        /*System.out.println(d1.getCardinal());
        System.out.println(d1.getMaxSize());
        System.out.println(d1.getNbListes());
        System.out.println(d1);
        System.out.println(d1.toStringV2());*/

        /* Q23 */
        /*ListeBigI mots = Dictionnaire.calculeListeInt("randomWordsPetit.txt");
        System.out.println(mots);*/

        /* Q25/26 */

        Dictionnaire d = new Dictionnaire("randomWordsPetit.txt", (double) 1);
        System.out.println("maxSize : " + d.getMaxSize());
        System.out.println("cardinal : " + d.getCardinal());
        System.out.println("nbListes : " + d.getNbListes());
        int nbRecherches = 100000;
        long debut=System.currentTimeMillis();
        for(int i=0;i<nbRecherches;i++) {
            Random random = new Random();
            int tailleMot = random.nextInt(15) + 2; //2 <= tailleMot <= 16
            char[] mot = new char[tailleMot];
            for (int j = 0; j < mot.length; j++) {
                mot[j] = (char) ('a' + random.nextInt(26));
            }
            String motS = new String(mot);
            d.contient(motS);//on ne récupère même pas le résultat de la recherche!
        }
        long fin=System.currentTimeMillis();
        System.out.println("temps total : " + (fin-debut));



    }
}
