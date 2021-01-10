package LacoRepeticao;

import java.util.Scanner;

public class ExDoWhile5 {

	public static void main(String[] args) {
		/*Crie um programa que leia um número do teclado até que encontre um número igual a zero.
		 * No final, mostre a soma dos números digitados.
		 */
		Scanner ler = new Scanner (System.in);
		int teclado,soma=0;
		
		
		do
		{
		System.out.print("Aperte qualquer número do teclado: ");
		teclado = ler.nextInt();
		soma = soma + teclado;
		}
		while (teclado>0);
		System.out.printf("Soma dos números: %d",soma);
	}

}
