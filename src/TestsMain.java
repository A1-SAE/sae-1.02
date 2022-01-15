import java.math.BigInteger;

public class TestsMain {
    public static void main(String[] args){
        /* Q3 */
        HTNaive htn1 = new HTNaive(5);

        /* Q6/8 */
        htn1.ajout(BigInteger.valueOf(500));
        htn1.ajout(BigInteger.valueOf(502));
        System.out.println(htn1);

        ListeBigI l1 = new ListeBigI();
        l1.ajoutTete(BigInteger.valueOf(503));
        l1.ajoutTete(BigInteger.valueOf(206));
        l1.ajoutTete(BigInteger.valueOf(33));
        l1.ajoutTete(BigInteger.valueOf(64));
        l1.ajoutTete(BigInteger.valueOf(2009));
        l1.ajoutTete(BigInteger.valueOf(1565614984));
        htn1.ajoutListe(l1);
        System.out.println(htn1);

        /* Q7 */
        System.out.println(htn1.contient(BigInteger.valueOf(50)));
        System.out.println(htn1.contient(BigInteger.valueOf(500)));
        System.out.println(htn1.contient(BigInteger.valueOf(503)));
        System.out.println(htn1.contient(BigInteger.valueOf(-500)));
    }
}
