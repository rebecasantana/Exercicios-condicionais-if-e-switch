package lacos_condicionais;

import java.util.Scanner;

public class exercicio_05switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int item, quantidade;
		float valorTotal;

		System.out.print("Qual o número do item:  ");
		item = sc.nextInt();

		System.out.print("Qual a quantidade do item:  ");
		quantidade = sc.nextInt();

		switch (item) {
		case 1:
			System.out.print("Produto:Cachorro Quente");
			valorTotal = 10.00f * quantidade;
			System.out.printf(" Valor total : R$ %.2f", valorTotal);
			break;
		case 2:
			System.out.print("Produto:X-Salada");
			valorTotal = 15.00f * quantidade;
			System.out.printf(" Valor total : R$ %.2f", valorTotal);
			break;
		case 3:
			System.out.print("Produto:X-Bacon");
			valorTotal = 18.00f * quantidade;
			System.out.printf(" Valor total : R$ %.2f", valorTotal);
			break;
		case 4:
			System.out.print("Produto:Bauru");
			valorTotal = 12.00f * quantidade;
			System.out.printf(" Valor total : R$ %.2f", valorTotal);
			break;
		case 5:
			System.out.print("Produto:Refrigerante");
			valorTotal = 8.00f * quantidade;
			System.out.printf(" Valor total : R$ %.2f", valorTotal);
			break;
		case 6:
			System.out.print("Produto:Suco de Laranja");
			valorTotal = 13.00f * quantidade;
			System.out.printf(" Valor total : R$ %.2f", valorTotal);
			break;
		}
	}
}
