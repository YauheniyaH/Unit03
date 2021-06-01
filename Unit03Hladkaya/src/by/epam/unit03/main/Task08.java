package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y, z = 0;
		boolean checkOperator;
		String operator = "", terminator = "";
		Scanner sc;

		while (!terminator.equals("#")) {
			checkOperator=false;
			sc = new Scanner(System.in);

			System.out.print("input x >");
			x = sc.nextDouble();

			System.out.print("input y >");
			y = sc.nextDouble();

			sc = new Scanner(System.in);
			System.out.println("input operator");
			System.out.print(">");
			while (!checkOperator) {
				operator = sc.nextLine();
				if (operator.equals("+") | operator.equals("-") | operator.equals("*") | operator.equals("/")) {
					checkOperator = true;
				} else {
					// sc.nextLine();//извлекли ошибочный ввод пользователя
					System.out.println("Incorrect input. +, –, / or * is required");
					System.out.print(">");
					checkOperator = false;
				}

			}

			switch (operator) {
			case "+":
				z = x + y;
				System.out.println("z=" + z);
				break;
			case "-":
				z = x - y;
				System.out.println("z=" + z);
				break;
			case "*":
				z = x * y;
				System.out.println("z=" + z);
				break;
			case "/": {
				if (y == 0) {
					System.out.println("Error: division by zero");
				} else {
					z = x / y;
					System.out.println("z=" + z);
					break;
				}
			}

			}
			
			System.out.println("input # to termonate session >");
			terminator = sc.nextLine();

		}
	}

}
