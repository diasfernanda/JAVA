package VetoresMatrizes;

import java.util.Scanner;

public class ExMatrizes1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		int x=0;
		int[][] matriz = new int[3][3];
		System.out.println("matriz[3][3]");
		
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0; coluna <3; coluna ++) {
			System.out.printf("\nInsira o  valor do elemento matriz[%d][%d]: ",linha+1,coluna+1);
			matriz[linha][coluna]=ler.nextInt();
			
			if (matriz[linha][coluna]>10)
			{
			x = x+1;
			}
			}
			
		}
		
		System.out.println("\nA quantidade de valores maiores que 10 é: "+x);
		
	}

}
