package aplication;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import utilidades.Departament;
import utilidades.HourContract;
import utilidades.Worker;
import utilidades.enums.WorkerLevel;

public class ProgramWorker {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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

		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com o contrato #" + i);
			System.out.println("Data (DD/MM/YYYY) ");
			LocalDate date = LocalDate.parse(sc.next(),dt);
			System.out.println("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duração (horas): ");
			int hour = sc.nextInt();

			HourContract contract = new HourContract(date, valuePerHour, hour);
			worker.addContract(contract);
		}
		System.out.println();
		System.out.print("Entre com o mês e ano para calcular (MM/YYYY)");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartament().getName());
		System.out.println("Ganhos em: " + monthAndYear + ":" + String.format("%.2f", worker.income(year, month)));
		 
		sc.close();
	}

}
