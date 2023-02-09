package lacos_condicionais;

import java.util.Scanner;

public class exercicio_01if {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a, b, c, calculoAb;

		System.out.print("Digite o numero A: ");
		a = leia.nextInt();

		System.out.print("Digite o numero B:  ");
		b = leia.nextInt();

		System.out.print("Digite o numero C: ");
		c = leia.nextInt();

		calculoAb = a + b;

		if (calculoAb > c) {
			// 4 + 2 = 6 > 5
			System.out.println(a + " + " + b + " = " + calculoAb + " > " + c);
			System.out.println(" A soma de a + b é maior do que c ");

		} else if (calculoAb < c) {

			System.out.println(a + " + " + b + " = " + calculoAb + " < " + c);
			System.out.println(" A soma de a + b é menor do que c ");

		} else {
			System.out.println(a + " + " + b + " = " + calculoAb + " = " + c);
			System.out.println("A soma de a + b é igual a c ");
		}

	}

}