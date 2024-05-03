package LPAlore;

import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		
Scanner ler = new Scanner (System.in);
		
		double n1,n2,n3, s;
		
		System.out.println("Digite o primeiro número: "); 
		n1 = ler.nextDouble();
		
		System.out.println("Digite o segundo número: "); 
		n2 = ler.nextDouble();
		
		System.out.println("Digite o terceiro número: "); 
		n3 = ler.nextDouble();
		
		s = n1 + n2 + n3; 
		
		if (s > 80) {
			System.out.println("O resultado da soma é: " + s); 
		}
		else
			System.out.println("O número após a soma foi menor que 80");  

	}
}