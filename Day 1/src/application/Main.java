package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaCliente cliente;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			cliente = new ContaCliente(number, holder, initialDeposit);
		}
		else {
			cliente = new ContaCliente(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(cliente);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		cliente.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(cliente);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		cliente.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(cliente);
		
		sc.close();
	}
}