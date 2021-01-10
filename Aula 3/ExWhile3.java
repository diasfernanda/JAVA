package LacoRepeticao;

import java.util.Scanner;

public class ExWhile3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade,a=0,b=0;
		
		System.out.printf("Insira sua idade: ");
		idade=ler.nextInt();
		
		while(idade>-99)
		{
			if (idade<21)
			{
			a = a+1;
			}
			if (idade>50)
			{
			b = b+1;
			}
			System.out.printf("Insira sua idade: ");
			idade=ler.nextInt();	
		}
		if (idade==-99)
		{
			System.out.printf("Dado Inválido.\n");
		}
		System.out.println("O total de pessoas com menos de 21 anos é: "+a);
		System.out.println("O total de pessoas com mais de 50 anos é: "+b);

	}

}
