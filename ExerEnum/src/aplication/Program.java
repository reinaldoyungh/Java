package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.HourContract;
import Entities.Worker;
import Entities.Departament;
import EntitiesEnum.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");


		//Department
		System.out.print("Enter department's name: ");
		String departamentName = sc.nextLine();

		//Worker
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
			String workerName = sc.nextLine();
		System.out.print("Level: ");
			String level = sc.nextLine();
		System.out.print("Base Salary: ");
			double baseSalary = sc.nextDouble();   
			
		//Constructor Worker
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, new Departament(departamentName));

		//Contracts                 
		System.out.print("How many contracts to this worker? ");
			int numContract = sc.nextInt();
		
		for (int i=0; i<numContract;i++) {
			
			System.out.println("Enter contract #"+(i+1)+" data:");
			System.out.print("Date (DD/MM/YYYY): ");
				Date contractDate = formato.parse(sc.next());
				
			System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
				int duration = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, duration);
			worker.addContract(contract);

			System.out.println("----------");
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.print("Name: "+ worker.getName());
		System.out.println();
		System.out.print("Level: "+ worker.getLevel());
		System.out.println();
		System.out.print("Department: "+ worker.getDepartment());
		System.out.println();
		System.out.print("Income for "+monthAndYear+": "+ worker.income(year,month));
		
		
		sc.close();
	}


}
