package atividade;
import java.util.Scanner;
public class atividade3 {

	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("digite o salario ");
		salarioBruto = in.nextFloat();
		
		System.out.println("digite o adicional noturno ");
		adicionalNoturno = in.nextFloat();
		
		System.out.println("digite a hora extra ");
		horasExtras = in.nextFloat();
		
		System.out.println("digite o desconto ");
		descontos = in.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("O salario liquido é " +  salarioLiquido);
		
	}
}
