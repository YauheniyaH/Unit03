package by.epam.unit03.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// Даны два числа. Определить цифры, входящие в запись как первого так и
		//второго числа.
		
		double a,b;
		String a1, b1, s="";
		char ch1,ch2;
		Scanner sc;

		sc = new Scanner(System.in);
		System.out.print("input a > ");
		while(!sc.hasNextDouble()){
			sc.nextLine();//извлекли ошибочный ввод пользователя
			System.out.println("Incorrect input. Double value is required");
			System.out.print("input a > ");
			}
		a = sc.nextDouble();
		a1=Double.toString(a);
		System.out.println("a = " + a);
		
		System.out.print("input b >");
		while(!sc.hasNextDouble()){ 
			sc.nextLine();
			System.out.println("Incorrect input. Double value is required");
			System.out.print("input b > ");
			}
		b = sc.nextDouble();
		b1=Double.toString(b);
		System.out.println("b = " + b);
		
		
		for (int i=0; i<=a1.length()-1;i++) {
			for (int j=0; j<=b1.length()-1;j++) {
				s="";
				ch1=a1.charAt(i);
				ch2=b1.charAt(j);
				if (ch1==ch2 && ch1!='.') {
					s=s+ch1;
					int temp=Integer.parseInt(s);
					switch(temp) {
					case 1:
						System.out.println("числа a и b содержат цифру 1 ");
						break;
					case 2:
						System.out.println("числа a и b содержат цифру 2 ");
						break;
					case 3:
						System.out.println("числа a и b содержат цифру 3 ");
						break;
					case 4:
						System.out.println("числа a и b содержат цифру 4 ");
						break;
					case 5:
						System.out.println("числа a и b содержат цифру 5 ");
						break;
					
					case 6:
						System.out.println("числа a и b содержат цифру 6 ");
						break;
					
					case 7:
						System.out.println("числа a и b содержат цифру 7 ");
						break;
					case 8:
						System.out.println("числа a и b содержат цифру 8 ");
						break;
					case 9:
						System.out.println("числа a и b содержат цифру 9 ");
						break;
					case 0:
						System.out.println("числа a и b содержат цифру 0 ");
						break;
					}
					
				}
				
			}
			
			
		}
		
	
		
	

	}

}
