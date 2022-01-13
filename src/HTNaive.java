import java.math.BigInteger;

public class HTNaive{
	private ListeBigI[] t;

	public HTNaive(int m){
		//pas sûr...
		this.t = new ListeBigI[m];
	}

	public ListeBigI getListe(int i){
		return t[i];
	}

	public int h(BigInteger u){
		// h(u) = u % m
	}

	public boolean contient(BigInteger u){
		boolean res = false;
		for(int i = 0; i < t.length; i++){
			if(t[i] == u){
				res = true;
			}
		}
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
		return this.t;
	}

	public String toString(){
		String res="";

		for(int i=0; i < t.length; i++){
			for(int j=0; j < ; j++){
				res += "t[" + i + "] : " + t[/* faut modif ici */] + "\n";
			}
		}
		//retourne la chaine sous forme :
		//t[0] : ... (éléments de la liste 0)
		//t[1] : ... (éléments de la liste 1)
		return res;
	}
}