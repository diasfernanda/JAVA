package LacoCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {	
	Scanner ler = new Scanner (System.in);
	int a,b,c;
	
	System.out.println("Insira o primeiro valor: ");
	a = ler.nextInt();
	System.out.println("Insira o segundo valor: ");
	b = ler.nextInt();
	System.out.println("Insira o terceiro valor: ");
	c = ler.nextInt();
	
	if (a>b && a>c)
	{
		System.out.println("O maior número é "+a);
	}
	
	if (b>a && b>c)
	{
		System.out.println("O maior número é "+b);
	}
	
	if (c>a && c>b)
	{
		System.out.println("O maior número é "+c);	
	}
	if (c==a && c==b)
	{
		System.out.println("Todos os números possuem o mesmo valor.");	
	}
	}

}
