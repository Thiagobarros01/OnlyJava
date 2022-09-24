package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import utilidades.Funcionarios;

public class ProgramFunc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> list = new ArrayList<>();

		System.out.print("Quantos funcionários serão registrados ?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Funcionário #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			System.out.println();
			Funcionarios func = new Funcionarios(id, nome, salario);

			list.add(func);
		}
		System.out.println("Entre com o id do funcionário que terá o salário aumentado: ");
		Integer idSalario = sc.nextInt();
		Integer pos = posicao(list, idSalario);
		if (pos == null) {
			System.out.println("Id não existe!");
		} else {
			System.out.println("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			list.get(pos).aumentarSalario(porcentagem);

		}

		System.out.println();
		for (Funcionarios func : list) {
			System.out.println(func.ToString());
		}

		sc.close();
	}

	public static Integer posicao(List<Funcionarios> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;

	}
}
