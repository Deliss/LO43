
public class PlaqueRessource extends Plaque{
	private int ressource;// 1:bi�re, 2:sommeil, 3:caf�, 4:cours, 5:nourriture
	private int numero;// entre 2 et 12 a regard� apr�s un lanc� de d�s
	
	public PlaqueRessource(int r, int n){
		super();
		ressource=r;
		numero=n;
	}
	
	public void printP(){
		System.out.println("ceci est une plaque ressource avec comme ressource " + ressource + " et comme num�ro " + numero);
	}
	
	public int getRessource() {
		return ressource;
	}

	public int getNumero() {
		return numero;
	}
}
