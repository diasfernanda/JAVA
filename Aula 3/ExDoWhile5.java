package LacoRepeticao;

import java.util.Scanner;

public class ExDoWhile5 {

	public static void main(String[] args) {
		/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
		 * No final, mostre a soma dos n�meros digitados.
		 */
		Scanner ler = new Scanner (System.in);
		int teclado,soma=0;
		
		
		do
		{
		System.out.print("Aperte qualquer n�mero do teclado: ");
		teclado = ler.nextInt();
		soma = soma + teclado;
		}
		while (teclado>0);
		System.out.printf("Soma dos n�meros: %d",soma);
	}

}
