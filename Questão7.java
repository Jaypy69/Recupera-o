package LPAlore;

import java.util.Scanner;

public class Questão7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe a sua sexualidade: F ou M");
		String s = ler.next();
		
		System.out.println(s.equals("F")? "Feminino":"Masculino");
	}
}
