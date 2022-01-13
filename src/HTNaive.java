import java.math.BigInteger;

public class HTNaive{
	ListeBigI[] t;

	public HTNaive(int m){
		//pas sûr...
		this.t = new ListeBigI[m];
	}

	public ListeBigI getListe(int i){
		return t[i];
	}

	public int h(BigInteger u){
		// h(u) = u % m
		BigInteger m = BigInteger.valueOf(this.t.length);
		BigInteger res =  u.mod(m);
		return res.intValue();
	}

	public boolean contient(BigInteger u){
		boolean res = false;

		//vrai SSI u est déjà dans la table
		
		return res;
	}

	public boolean ajout(BigInteger u){
		boolean res = false;
		if(this.contient(u)){
			//rien
			res = false;
		}else{
			//ajout
			res = true;
		}
		return res;
	}

	public void ajoutListe(ListeBigI L){
		//ajoute à la table les éléments de L qui n'y sont pas déjà
		//L ne doit pas être modifée
	}

	public ListeBigI getElements(){
		//retourne la liste de tous les éléments de la table
	}

	public String toString(){
		//retourne la chaine sous forme :
		//t[0] : ... (éléments de la liste 0)
		//t[1] : ... (éléments de la liste 1)
	}
}