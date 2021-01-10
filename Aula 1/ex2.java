package ex2;

import java.util.Scanner;

public class ex2 {
	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		int dias,meses=12,anos=365,res;
		System.out.println("Escreva sua idade em dias: ");
		dias = ler.nextInt();
		System.out.println("Você possui: "+dias+" dia(s) de idade");
		System.out.println("\nVocê possui: "+dias/meses+" mes(es) de idade");
		System.out.println("\nVocê possui: "+dias/anos+" ano(s) de idade");
	}

}
