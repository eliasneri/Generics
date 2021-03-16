import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> print = new PrintService<>();
		
		System.out.print("how many values? ");
		int op = sc.nextInt();
		
			for (int i=1; i<=op; i++) {
				Integer value = sc.nextInt();
				print.addValue(value);
				
			}
		
		System.out.println();
		print.print();
		Integer x = print.first();
		
		System.out.println();
		System.out.println("First: " + x);
		
		sc.close();

	}

}
