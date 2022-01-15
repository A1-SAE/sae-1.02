import java.math.BigInteger;
import java.util.List;

public class HTNaive{
	private ListeBigI[] t;

	public HTNaive(int m){
		this.t = new ListeBigI[m];
		for(int i = 0; i < t.length; i++){
			t[i] = new ListeBigI();
		}
	}

	public ListeBigI getListe(int i){
		return t[i];
	}

	public int h(BigInteger u){
		// h(u) = u % m
		BigInteger m = BigInteger.valueOf(this.t.length);
		return u.mod(m).intValue();
	}

	public boolean contient(BigInteger u){
		int pos = this.h(u);
		if(t[pos].estVide()) return false;

		return this.t[pos].contient(u);
	}

	public boolean ajout(BigInteger u){
		if(this.contient(u)) return false;

		int pos = this.h(u);
		this.t[pos].ajoutTete(u);
		return true;
	}

	public void ajoutListe(ListeBigI L){
		if(L.estVide()) return;

		ListeBigI recopie = new ListeBigI(L);
		while(!recopie.estVide()){
			this.ajout(recopie.supprTete());
		}
	}

	public ListeBigI getElements(){
		ListeBigI res = new ListeBigI();
		for(int i = 0; i < this.t.length; i++){
			res.ajoutListe(t[i]);
		}

		return res;
	}

	public String toString(){
		String res="";

		for(int i=0; i < t.length; i++){
			res += "t[" + i + "] : " + t[i].toString() + "\n";
		}
		//retourne la chaine sous forme :
		//t[0] : ... (éléments de la liste 0)
		//t[1] : ... (éléments de la liste 1)
		return res;
	}
}