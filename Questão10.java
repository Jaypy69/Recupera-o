package LPAlore;

import java.util.Scanner;

public class Questão10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira o primeiro número: ");
		double Num1 = ler.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		double Num2 = ler.nextDouble();
		
		System.out.println("Insira o operador que deseja utilizar (+, *, -, /): ");
		char operador = ler.next().charAt(0);
		
		double r = 0;
		
		switch (operador) {
		    case '+':
		    	r = Num1 + Num2;
		    	break;
		    case '*':
		    	r = Num1 * Num2;
		    	break;
		    case '-':
		    	r = Num1 - Num2;
		    	break;
		    case '/':
		    	if (Num2 != 0) {
		    		r = Num1 / Num2;
		    	} else {
		    		System.out.println("Erro: Não se pode dividir nenhum número por zero");
		    		return;
		    	}
		    	break;
		    default:
		    	System.out.println("Essa Operação náo é válida");
		    	return;
		}
		System.out.println("Resultado: " + r);

	}

}
