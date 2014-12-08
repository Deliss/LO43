import java.util.Random;


public class Plateau {
	private Plaque[] board;// 1:bière, 2:sommeil, 3:café, 4:cours, 5:nourriture
	
	public Plateau(){
		
		
		//tableau des numéros qu'on va mettre sur les plaques ressources
		int[][] num = new int[18][2]; // 18 plaques ressources et si le numéros a été posé
		for(int i=0;i<18;i++){
			num[i][1]= 0;
			if(i+2<13){ //nombre entre 2 et 12 
				if(i+2!=7){				//pas de 7
				num[i][0]= i+2;
				}else{
					num[i][0]=11;
				}
			}else{
				if(i-8!=7){// de 3 a 11 numéros doublés
				num[i][0]= i-8; //pas de 7
				}else{
					num[i][0]=10;
				}
			}
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		board = new Plaque[38];
		int b=4, s=3, ca=4, co=4, n=3, d=1, zt=9, r=9;
		int choixp,i=0,choixn = 0,v=0;
		
		//Pour mettre les 18 plaques ressources
		while(i<18){		
			Random rand = new Random();
			choixp=rand.nextInt(5);//entre 0 et 4
			
			while(v==0){
				choixn=rand.nextInt(18);//entre 0 et 17
				if(num[choixn][1]==0){
					v=1;
					num[choixn][1]=1;
				}
			}
			
			if(choixp==0){	//plaque bière
				if(b>0){
					PlaqueRessource pl = new PlaqueRessource(1,num[choixn][0]);
					board[i]=pl;
					b--;	// Pour compter le nombre de plaque bière posée 
					i++;	// Pour compter le nombre de plaque posée
					v=0;
				}
			}else if(choixp==1){//plaque sommeil
				if(s>0){
					PlaqueRessource pl = new PlaqueRessource(2,num[choixn][0]);
					board[i]=pl;
					s--;	// Pour compter le nombre de plaque sommeil posée 
					i++;	// Pour compter le nombre de plaque posée
					v=0;
				}
			}else if(choixp==2){//plaque café
				if(ca>0){
					PlaqueRessource pl = new PlaqueRessource(3,num[choixn][0]);
					board[i]=pl;
					ca--;	// Pour compter le nombre de plaque café posée 
					i++;	// Pour compter le nombre de plaque posée
					v=0;
				}
			}else if(choixp==3){//plaque cours
				if(co>0){
					PlaqueRessource pl = new PlaqueRessource(4,num[choixn][0]);
					board[i]=pl;
					co--;	// Pour compter le nombre de plaque cours posée 
					i++;	// Pour compter le nombre de plaque posée
					v=0;
				}
			}else{		//plaque nourriture
				if(n>0){
					PlaqueRessource pl = new PlaqueRessource(5,num[choixn][0]);
					board[i]=pl;
					n--;	// Pour compter le nombre de plaque nourriture posée 
					i++;	// Pour compter le nombre de plaque posée
					v=0;
				}
			}
			
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		display();
		
	}
	
	public void display(){
		
		for (int j=0;j<18;j++){
			  ((PlaqueRessource) board[j]).printP();
		}
		
	}

	
	public Plaque[] getBoard() {
		return board;
	}

	
	public void setBoard(Plaque[] board) {
		this.board = board;
	}
	

}
