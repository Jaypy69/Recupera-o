package LPAlore;

import java.util.Scanner;

public class Questão9 {

	public static void main(String[] args) {
		
        Scanner ler = new Scanner (System.in);
        
		System.out.print("Tamanho do primeiro lado "); 
        double Ld1 = ler.nextDouble();
        System.out.print("Tamanho do segundo lado: "); 
        double Ld2 = ler.nextDouble();
        System.out.print("Tamanho do terceiro lado: "); 
        double Ld3 = ler.nextDouble();
        
        if (Ld1 == Ld2 && Ld2 == Ld3) { 
            System.out.println("Equilátero");
        } 
        else if (Ld1 == Ld2 | Ld2 == Ld3 | Ld1 == Ld3) { 
            System.out.println("Isósceles");
        } 
        else {
            System.out.println("Escaleno");
		    }
	  }
}