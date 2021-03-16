import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintService print = new PrintService();
		
		System.out.print("how many values? ");
		int op = sc.nextInt();
		
			for (int i=1; i<=op; i++) {
				int value = sc.nextInt();
				print.addValue(value);
				
			}
		
		System.out.println();
		print.print();
		System.out.println();
		System.out.println("First: " + print.first());
		
		sc.close();

	}

}
