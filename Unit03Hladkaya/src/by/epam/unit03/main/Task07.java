package by.epam.unit03.main;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// Написать программу, переводящую римские цифры в арабские.

		String a;
		Scanner sc;

		sc = new Scanner(System.in);
		System.out.print("input a > ");
		a = sc.nextLine();

		switch (a) {

		case "I":
			System.out.println(a + "=1");
			break;
		case "V":
			System.out.println(a + "=5");
			break;
		case "X":
			System.out.println(a + "=10");
			break;
		case "L":
			System.out.println(a + "=50");
			break;
		case "C":
			System.out.println(a + "=100");
			break;
		case "D":
			System.out.println(a + "=500");
			break;
		case "M":
			System.out.println(a + "=1000");
			break;
		}

	}

}
