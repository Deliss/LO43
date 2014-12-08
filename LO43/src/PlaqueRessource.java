
public class PlaqueRessource extends Plaque{
	private int ressource;// 1:bière, 2:sommeil, 3:café, 4:cours, 5:nourriture
	private int numero;// entre 2 et 12 a regardé après un lancé de dés
	
	public PlaqueRessource(int r, int n){
		super();
		ressource=r;
		numero=n;
	}
	
	public void printP(){
		System.out.println("ceci est une plaque ressource avec comme ressource " + ressource + " et comme numéro " + numero);
	}
	
	public int getRessource() {
		return ressource;
	}

	public int getNumero() {
		return numero;
	}
}
