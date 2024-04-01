package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;
import entities.Triangle;
import entities.employee;
import entities.Account;
import entities.CurrencyConverter;
import entities.Escola;
import entities.Product;
import entities.Negativos;
import entities.Pensao;
import entities.Altura;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the mensures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the mensures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.println("Enter the mensures of triangle x.a: " + x.a);
		System.out.println("Enter the mensures of triangle x.b: " + x.b);
		System.out.println("Enter the mensures of triangle x.c: " + x.c);

		System.out.println("Enter the mensures of triangle y.a: " + y.a);
		System.out.println("Enter the mensures of triangle y.b: " + y.b);
		System.out.println("Enter the mensures of triangle y.c: " + y.c);
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("areaX: " + areaX);
		System.out.println("areaY: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
			}
			else {
			System.out.println("Larger area: Y");
			}
		*/

		/*
		Retangulo x;
		x = new Retangulo();
		
		System.out.println("Enter the mensures of retangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		
		System.out.println("x.a: "+ x.a);
		System.out.println("x.b: "+ x.b);
		
		double areaX = x.area();
		System.out.printf("areaX: %.2f%n", areaX);

		double perimetroX = x.perimetro();
		System.out.printf("perimetroX: %.2f%n", perimetroX);

		double diagonalX = x.diagonal();
		System.out.printf("diagonalX: %.2f%n", diagonalX);
		*/
		/*
		employee x = new employee();

		System.out.print("Name: ");
		x.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		x.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();
		
		double liquido = x.netSalary();

		System.out.println("Employee: " + x.name + " , $" + liquido );
		System.out.print("Which percentage to increase salary? " );
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage);
		*/
		
		/*
		Escola esc = new Escola();
		
		System.out.print("Name: ");
		esc.name = sc.nextLine();
		
		System.out.print("Nota 1: ");
		esc.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		esc.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		esc.nota3 = sc.nextDouble();
		
		esc.avaliacao();	
		*/
		
		/*
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		cc.dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bougth? ");
		cc.dollarBuy = sc.nextDouble();
		
		cc.calculatorPaid();
		*/
		
		/*
		Account ac = new Account();	
		double depositValue;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		String initial = sc.next();
		
		
		
		if (initial.equals("y")) {
			
			System.out.print("Enter initial deposit value: ");
			depositValue = sc.nextDouble();
			ac = new Account(number,holder,depositValue);
			ac.setNumber(number);
			ac.setHolder(holder);
			ac.setBalance(depositValue);
		
		} else {
			ac = new Account(number,holder);
			ac.setNumber(number);
			ac.setHolder(holder);
		}
		
		System.out.println("");
		System.out.println("Account data:");
		System.out.println(ac);
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		depositValue = sc.nextDouble();
		ac.deposit(depositValue);
		
		System.out.println("Updated account data: ");
		System.out.println(ac);
		
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		depositValue = sc.nextDouble();
		ac.withdraw(depositValue);

		System.out.println("Updated account data: ");
		System.out.println(ac);
		*/
		
		/* Vetor  */
		/*
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		*/

		/* Vetor  2 */
		/*
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		*/
		
		/* Problema "negativos"  */
		/*
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		Negativos[] vect = new Negativos[n];
		
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			int value = sc.nextInt();
			vect[i] = new Negativos(value);
			
		}
		
		System.out.println("Numeros Negativos");
		
		for (int i=0; i<vect.length;i++) {
			int value = vect[i].getNegativeNumber();
			if (value < 0 ) {
				System.out.println(value);
			}
		}
		*/
		
		/* Problemas Altura */
		/*
		Altura alt = new Altura();
		double sum = 0;
		int menor = 0;
		String nameMenor = " ";
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Altura[] vect = new Altura[n];
		
		for (int i=0; i<vect.length;i++) {
			
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new Altura(nome, idade, altura);
			
			sum += vect[i].getHeight();
			int age = vect[i].getAge();
			if (age < 16) {
				menor += 1;
				String name = vect[i].getName();
				nameMenor = nameMenor + ", "+ name;
			}
		}
		
		double avg = sum/n;
		double perc = alt.percent(menor, n);
		System.out.println("");
		System.out.printf("Altura media: %.2f%n", avg);
		System.out.println("Pessoas com menos de 16 anos: "+ perc + "%");
		System.out.println(nameMenor);
		
		*/
		
		/* Exercicio Pensao */
		/*
		Pensao[] vect = new Pensao[10];
		Pensao p = new Pensao();
		
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n;i++) {
			System.out.println("");
			System.out.println("Rented #"+(i+1)+":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Pensao(name, email);
					
		}
		
		System.out.println("");
		System.out.println("Busy rooms: ");
		
		for (int i=0; i<10;i++) {
			if (vect[i] != null ) {
				//System.out.print(vect[i] + ":" + vect[i].getName() + ", " + vect[i].getEmail()  );
				System.out.println(i + ": "+ vect[i]);
			}
		}
		*/
		
		
		
		sc.close();
	}

}
