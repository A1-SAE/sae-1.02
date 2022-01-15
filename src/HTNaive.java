import java.math.BigInteger;
import java.util.List;

public class HTNaive{
	private ListeBigI[] t;
	private long totalTimeh;
	private long totalTimeContient;

	public HTNaive(int m){
		this.t = new ListeBigI[m];
		for(int i = 0; i < t.length; i++){
			t[i] = new ListeBigI();
		}

		this.totalTimeh = 0;
		this.totalTimeContient = 0;
	}

	public HTNaive(ListeBigI l, int m){
		this(m);
		this.ajoutListe(l);
	}

	/*
	* prérequis : f > 0
	* */
	public HTNaive(ListeBigI l, double f){
		this(l, (int) (f* new HTNaive(l, 1000).getCardinal()));

		/*
		* défactorisé ça donne ça :
		* public HTNaive(ListeBigI l, double f){
		* 	HTNaive temp = new HTNaive(l, 1000);
		* 	int m = (int) (f*temp.getCardinal());
		* 	this(l, m);
		* }
		* */
	}

	public ListeBigI getListe(int i){
		return t[i];
	}

	public int h(BigInteger u){
		// h(u) = u % m
		double debut = System.currentTimeMillis();
		BigInteger m = BigInteger.valueOf(this.t.length);
		int res = u.mod(m).intValue();
		double fin = System.currentTimeMillis();
		this.totalTimeh += fin - debut;
		return res;
	}

	public boolean contient(BigInteger u){
		double debut = System.currentTimeMillis();
		int pos = this.h(u);
		if(t[pos].estVide()) return false;
		boolean result = this.t[pos].contient(u);

		double fin = System.currentTimeMillis();
		this.totalTimeContient += fin - debut;

		return result;
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

	public int getNbListes(){
		return this.t.length;
	}

	public int getCardinal(){
		int res = 0;
		for(ListeBigI liste: t){
			res += liste.longueur();
		}

		return res;
	}

	public int getMaxSize(){
		int res = 0;
		for(ListeBigI liste: t){
			int longueur = liste.longueur();
			if(longueur > res) res = longueur;
		}

		return res;
	}

	public String toStringV2(){
		String res="";

		for(int i=0; i < t.length; i++){
			res += "t[" + i + "] : ";
			for(int j = 0; j < t[i].longueur(); j++){
				res += "*";
			}
			res += "\n";
		}

		return res;
	}

	public String printTime(){
		return "total time h : " + this.totalTimeh + "\ntotal time contient : " + this.totalTimeContient;
	}

}