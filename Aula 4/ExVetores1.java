package VetoresMatrizes;

import java.util.Scanner;

public class ExVetores1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int[] vetorum = {1, 0, 5, -2, -5, 7} ;
		int soma=0;

		soma= vetorum[0] + vetorum[1] + vetorum [5];
		
		System.out.println("A soma dos vetores nos índices 0, 1 e 5 é: "+soma);
		
		vetorum[3] = 100;
		System.out.println("O valor do vetor no índice 4 é: "+vetorum[3]);
		
		for (int i : vetorum)
		{
			System.out.println("\n "+i);
		}
	}

}
