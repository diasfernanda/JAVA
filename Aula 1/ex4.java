package ex4;

import java.util.Scanner;

public class class4 {
	public static void main (String[] args){
	Scanner ler = new Scanner(System.in);
	/*
	 * Defina um valor para três números (A, B e C) inteiros positivos
	 * e calcule a expressão;
	 */
	float a,b,c,r,d,s;
	System.out.println("Defina um valor para A: ");
	a = ler.nextInt();
	System.out.println("Defina um valor para B: ");
	b = ler.nextInt();
	System.out.println("Defina um valor para C: ");
	c = ler.nextInt();
	
	r = (a+b)*(a+b);
	s = (b+c)*(b+c);
	
	d = (r+s)/2;
	System.out.println("Considerando que D=(R+S/2), o valor de D é: "+d);
	}
}
