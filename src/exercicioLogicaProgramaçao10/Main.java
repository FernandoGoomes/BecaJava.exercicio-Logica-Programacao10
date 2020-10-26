package exercicioLogicaProgramaçao10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int lado1, lado2, lado3;
	    int opcao = 1;

	    while (opcao == 1) {
	        Scanner s = new Scanner(System.in);

	        System.out.println("Entre com o lado 1:");
	        lado1 = s.nextInt();

	        System.out.println("Entre com lado 2:");
	        lado2 = s.nextInt();

	        System.out.println("Entre com lado 3:");
	        lado3 = s.nextInt();

	        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
	            if (lado1 == lado2 && lado1 == lado3) {
	                System.out.println("Triangulo Equilatero");
	            } else if ((lado1 == lado2) || (lado1 == lado3)) {
	                System.out.println("Triangulo Isosceles");
	            } else
	                System.out.println("Triângulo Escaleno");
	        } else {
	            System.out.println("Não é um triangulo!");
	        }
	        System.out.println("Deseja continuar? \n1 = sim, 2 = não");
	        opcao = s.nextInt();
	        s.close();
	    }
	    System.out.println("Fechou");
	}

	}