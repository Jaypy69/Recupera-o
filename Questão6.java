package LPAlore;

import java.util.Scanner;

public class Questão6 {

	public static void main(String[] args) {
		
        Scanner ler = new Scanner (System.in);
		
		int Num1, Num2, Num3;
		
		System.out.println("Informe o Número 1: "); 
		Num1 = ler.nextInt();
		
		System.out.println("Informe o Número 2: "); 
		Num2 = ler.nextInt();
		
		System.out.println("Informe o Número 3: "); 
		Num3 = ler.nextInt();
		
		if (Num1>Num2&&Num1>Num3) { 
			System.out.println("O número 1 é maior que os outros");
		}
		else if (Num2>Num1&&Num2>Num3) { 
			System.out.println("O número 2 é maior que os outros"); 
		}
		else if (Num3>Num1&&Num3>Num2) { 
			System.out.println("O número 3 é maior que os outros");
		}
	}
}