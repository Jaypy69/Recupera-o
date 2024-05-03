package LPAlore;

import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {
		
        Scanner ler = new Scanner (System.in);
		
		String t;
		
		System.out.println("Em que turno você estuda? (M - Matutino, V - Vespertino, N - Noturno) "); 
		t = ler.next();
		
		if (t.equals("M")) {                       
			System.out.println("Bom Dia!"); 
		}
		else if (t.equals("V")) {                 
			System.out.println("Boa Tarde!");
		}
		else if (t.equals("N")) {                  
			System.out.println("Boa Noite!");
		}
		else {
			System.out.println("Valor Inválido");  
		}
	}
}