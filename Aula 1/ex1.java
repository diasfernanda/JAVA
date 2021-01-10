package ex1;

import java.util.Scanner;

public class classex1 {
	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		int d,m,a,t;
		System.out.println("Expresse sua idade em anos: ");
		a = ler.nextInt();
		System.out.println("Expresse sua idade em meses: ");
		m = ler.nextInt();
		System.out.println("Expresse sua idade em dias: ");
		d = ler.nextInt();
		t = d + (a*365) + (m*30);
		System.out.println("Sua idade em dias é: "+t);
	}

}
