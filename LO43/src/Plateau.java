import java.util.Random;


public class Plateau {
	private Plaque[] board;// 1:bière, 2:sommeil, 3:café, 4:cours, 5:nourriture
	
	public Plateau(){
		board = new Plaque[37];
		int b=4, s=3, ca=4, co=4, n=3, d=1, zt=9, r=9;
		int choix,i=0;
		while(i<18){		//Pour mettre les 18 plaques ressource
			Random rand = new Random();
			choix=rand.nextInt(5);
			
			if(choix==0){	//plaque bière
				if(b>0){
					PlaqueRessource pl = new PlaqueRessource(1);
					board[i]=pl;
				}
			}else if(choix==1){//plaque sommeil
				
			}else if(choix==2){//plaque café
				
			}else if(choix==3){//plaque cours
				
			}else{		//plaque nourriture
				
			}
		}
		
	}
}
