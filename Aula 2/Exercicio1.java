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
		System.out.println("O maior n�mero � "+a);
	}
	
	if (b>a && b>c)
	{
		System.out.println("O maior n�mero � "+b);
	}
	
	if (c>a && c>b)
	{
		System.out.println("O maior n�mero � "+c);	
	}
	if (c==a && c==b)
	{
		System.out.println("Todos os n�meros possuem o mesmo valor.");	
	}
	}

}
