package LPAlore;

import java.util.Scanner;

public class Questão8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qual a primeira nota");
		double Num1 = ler.nextDouble();
		System.out.println("Qual a segunda nota");
		double Num2 = ler.nextDouble();
		System.out.println("Qual a terceira nota");
		double Num3 = ler.nextDouble();
		System.out.println("Qual a quarta nota");
		double Num4 = ler.nextDouble();
		System.out.println("Qual a quinta nota");
		double Num5 = ler.nextDouble();
		
		double Media = (Num1+Num2+Num3+Num4+Num5)/5;
		
		String mensagem = Media >= 6 ? "Aprovado":"Reprovado";
		System.out.println(mensagem);
	}
}