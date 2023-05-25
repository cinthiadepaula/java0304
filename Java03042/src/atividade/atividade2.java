package atividade;

import java.util.Scanner;

public class atividade2 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
			float nota1, nota2, nota3, nota4, mediafinal;
			
			System.out.println("digite a primeira nota ");
			nota1 = in.nextFloat();
			
			System.out.println("digite a segunda nota ");
			nota2 = in.nextFloat();
			
			System.out.println("digite a terceira nota ");
			nota3 = in.nextFloat();
			
			System.out.println("digite a quarta nota ");
			nota4 = in.nextFloat();
			
			mediafinal = (nota1 + nota2 + nota3 + nota4)/4;
			
			System.out.printf("A media final é: " +"%.1f", mediafinal);
			
		}
		


}
