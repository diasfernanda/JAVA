package LacoRepeticao;

import java.util.Scanner;

public class ExFor2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner (System.in);
		int x,y,a=0,b=0;
		
		for (x=1;x<=10;x++)
		{
		System.out.printf("Adicione um valor: ");
		y = read.nextInt();
		
		if (y%2 == 0)
		{
		a = a+1;
		}
		else
		{
		b = b+1;
		}
		}
		System.out.println("A quantidade de valores pares é: "+a);
		System.out.println("A quantidade de valores ímpares é: "+b);
	}

}
