package LPAlore;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		String Lo;
		String Se;
		
		System.out.println("Coloque seu login: ");
		Lo = ler.next();
		
		System.out.println("Coloque sua senha: ");
		Se = ler.next();
		
		if (Lo.equals("Jotasesi")&& Se.equals("1234abcd")) {
			
			System.out.println("Bem-vindo ao Sistema Senai");
		}
		else
			System.out.println("Dados incorretos, informe os dados novamente");
	}
}
