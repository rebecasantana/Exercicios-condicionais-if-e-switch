package lacos_condicionais;

import java.util.Scanner;

public class exercicio_06switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float salario, SalarioLiquido;
		String nomeColaborador;
		int cargo;

		System.out.println("Digite o nome do colaborador: ");
		sc.skip("\\R?");
		nomeColaborador = sc.nextLine();

		System.out.println("Digite o número do seu cargo: ");
		cargo = sc.nextInt();

		System.out.println("Digite o seu salário: ");
		salario = sc.nextFloat();

		switch (cargo) {
		case 1:
			System.out.print("\nNome do colaborador: "  +  nomeColaborador );
			System.out.print("\nCargo:Gerente");
			SalarioLiquido = salario + (0.10f * salario);
			System.out.printf("\nSalário: R$ %.2f ", SalarioLiquido);
			break;
		case 2:
			System.out.print("\nNome do colaborador: "  +  nomeColaborador );
			System.out.print("\nCargo:Vendedor");
			SalarioLiquido = salario + (0.07f * salario);
			System.out.printf("\nSalário: R$ %.2f ", SalarioLiquido);
			break;
		case 3:
			System.out.print("\nNome do colaborador: "  +  nomeColaborador );
			System.out.print("\nCargo:Supervisor");
			SalarioLiquido = salario + (0.09f * salario);
			System.out.printf("\nSalário: R$ %.2f ", SalarioLiquido);
			break;
		case 4:
			System.out.print("\nNome do colaborador: "  +  nomeColaborador  );
			System.out.print("\nCargo:Motorista");
			SalarioLiquido = salario + (0.06f * salario);
			System.out.printf("\nSalário: R$ %.2f ", SalarioLiquido);
			break;
		case 5:
			System.out.print("\nNome do colaborador: "   +  nomeColaborador   );
			System.out.print("\nCargo:Estoquista");
			SalarioLiquido = salario + (0.05f * salario);
			System.out.printf("\nSalário: R$ %.2f ", SalarioLiquido);
			break;
		case 6:
			System.out.print("\nNome do colaborador: "  +  nomeColaborador   );
			System.out.print("\nCargo:Técnico de Ti");
			SalarioLiquido = salario + (0.08f * salario);
			System.out.printf("\nSalário: R$ %.2f ", SalarioLiquido);
			break;

		}
	}
}

