import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {

	public static void verificação(int jogo[][]){
		
		if(jogo[0][0]==1 && jogo[0][1]==1 && jogo[0][2]==1){
			
			System.out.println("Jogador 1 venceu");
			System.exit(0);
		
			}
		if(jogo[0][0]==2 && jogo[0][1]==2 && jogo[0][2]==2){
			
			System.out.println("Jogador 2 venceu");
			System.exit(0);
			
		}
		if(jogo[1][0]==1 && jogo[1][1]==1 && jogo[1][2]==1){
			
			System.out.println("Jogador 1 venceu");
			System.exit(0);
		
			}
		if(jogo[1][0]==2 && jogo[1][1]==2 && jogo[1][2]==2){
			
			System.out.println("Jogador 2 venceu");
			System.exit(0);
			
		}
		if(jogo[2][0]==1 && jogo[2][1]==1 && jogo[2][2]==1){
			
			System.out.println("Jogador 1 venceu");
			System.exit(0);
		
			}
		if(jogo[2][0]==2 && jogo[2][1]==2 && jogo[2][2]==2){
			
			System.out.println("Jogador 2 venceu");
			System.exit(0);
			
		}
		
		
		
		
		
		if(jogo[0][0]==1 && jogo[1][0]==1 && jogo[2][0]==1){
			
			System.out.println("Jogador 1 venceu");
			System.exit(0);
		
			}
		if(jogo[0][0]==2 && jogo[1][0]==2 && jogo[2][0]==2){
			
			System.out.println("Jogador 2 venceu");
			System.exit(0);
			
		}
		if(jogo[0][1]==1 && jogo[1][1]==1 && jogo[2][1]==1){
			
			System.out.println("Jogador 1 venceu");
			System.exit(0);
		
			}
		if(jogo[0][1]==2 && jogo[1][1]==2 && jogo[2][1]==2){
			
			System.out.println("Jogador 2 venceu");
			System.exit(0);
			
		}
		if(jogo[0][2]==1 && jogo[1][2]==1 && jogo[2][2]==1){
			
			System.out.println("Jogador 1 venceu");
			System.exit(0);
		
			}
		if(jogo[0][2]==2 && jogo[1][2]==2 && jogo[2][2]==2){
			
			System.out.println("Jogador 2 venceu");
			System.exit(0);
			
		}
		
		
		if(jogo[0][0]==1 && jogo[1][1]==1 && jogo[2][2]==1){
			
			System.out.println("Jogador 1 venceu");
			System.exit(0);
			
		}
		if(jogo[0][0]==2 && jogo[1][1]==2 && jogo[2][2]==2){
			
			System.out.println("Jogador 2 venceu");
			System.exit(0);
			
		}
		if(jogo[0][2]==1 && jogo[1][1]==1 && jogo[2][0]==1){
			
			System.out.println("Jogador 1 venceu");
			System.exit(0);
			
		}
		if(jogo[0][2]==2 && jogo[1][1]==2 && jogo[2][0]==2){
			
			System.out.println("Jogador 2 venceu");
			System.exit(0);
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int cont = 0,x=0,y=0;
		int verificador = 0;
		Random rand = new Random();
		int  xb = rand.nextInt(3) + 1;
		int  yb = rand.nextInt(3) + 1;
		
		System.out.println("Jogo da velha(O jogador 1 ira usar '1' e o jogador 2 '2')");
		
		int[][] jogo = new int[3][3];
		
		while(cont!=9){
		
		while(verificador == 0){
		System.out.println("\n   1 2 3\n→1 "+jogo[0][0]+"|"+jogo[0][1]+"|"+jogo[0][2]+" \n→2 "+jogo[1][0]+"|"+jogo[1][1]+"|"+jogo[1][2]+"\n→3 "+jogo[2][0]+"|"+jogo[2][1]+"|"+jogo[2][2]+"\n");
		
		
		System.out.println("Jogador 1 escolha onde deseja colocar o 1(horizontal):");
		x = a.nextInt();
		
		System.out.println("\n  ↓ ↓ ↓  \n  1 2 3\n1 "+jogo[0][0]+"|"+jogo[0][1]+"|"+jogo[0][2]+" \n2 "+jogo[1][0]+"|"+jogo[1][1]+"|"+jogo[1][2]+"\n3 "+jogo[2][0]+"|"+jogo[2][1]+"|"+jogo[2][2]+"\n");
		
		System.out.println("Jogador 1 escolha onde deseja colocar o 1(vertical):");
		y = a.nextInt();
			
			if(jogo[x-1][y-1]!=0){
			
				System.out.println("escolha um lugar livre");
		
			}
		
		
			if(jogo[x-1][y-1]==0){
				
				jogo[x-1][y-1]=1;
				verificador = 1;
			
			}
		}
		
		
		verificador = 0;
		
		while(verificador == 0){
			
			xb = rand.nextInt(3) + 1;
			yb = rand.nextInt(3) + 1;

			if(jogo[xb-1][yb-1]==0){
				
				jogo[xb-1][yb-1]=2;
				verificador = 1;
				
			}
		}
		System.out.println("O computador colocou no "+xb+" "+yb);
		verificador = 0;
		xb=0;
		yb=0;
		x=0;
		y=0;
		cont++;
		
		verificação(jogo);
		
		}
		
		System.out.println("Empate");
		System.exit(0);
		
	}

}

}
