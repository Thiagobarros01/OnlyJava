package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import utilidades.Departament;
import utilidades.Worker;
import utilidades.enums.WorkerLevel;

public class ProgramWorker {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String departamentName = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador");
		System.out.println("Nome: ");
		String workerName = sc.nextLine();
		System.out.println("Nível: ");
		String workerNivel = sc.nextLine();
		System.out.println("Salário base: ");
		double salaryBase = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerNivel), salaryBase,
				new Departament(departamentName));

		System.out.print("Quantos contratos para esse trabalhador? ");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			System.out.println("Entre com o contrato #"+i);
			System.out.println("Data (DD/MM/YYYY) ");
			Date dt = sdf.parse(sc.next());
		}

		sc.close();
	}

}
