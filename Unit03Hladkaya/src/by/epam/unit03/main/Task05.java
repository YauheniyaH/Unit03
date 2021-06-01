package by.epam.unit03.main;
import java.util.Scanner;
import java.lang.Math;


public class Task05 {

	public static void main(String[] args) {
		double a,b,h, f,temp;
		
		Scanner sc;

		sc = new Scanner(System.in);
		System.out.print("input a > ");
		while(!sc.hasNextDouble()){
			sc.nextLine();//извлекли ошибочный ввод пользователя
			System.out.println("Incorrect input. Double value is required");
			System.out.print("input a > ");
			}
		a = sc.nextDouble();
		System.out.println("a = " + a);
		
		System.out.print("input b >");
		while(!sc.hasNextDouble()){ 
			sc.nextLine();
			System.out.println("Incorrect input. Double value is required");
			System.out.print("input b > ");
			}
		b = sc.nextDouble();
		System.out.println("b = " + b);
		
		System.out.print("input h >");
		while(!sc.hasNextDouble()){ 
			sc.nextLine();
			System.out.println("Incorrect input. Double value is required");
			System.out.print("input h > ");
			}
		h = sc.nextDouble();
		
		if(b<a) {
			temp=a;
			a=b;
			b=temp;
		}
		System.out.println("["+a+","+b+"] h="+h);
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "f(x)");
		System.out.println("---------------------------------");
		
		for(double i=a;i<=b;i=i+h) {
			f=2*Math.tan(i/2)+1;
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", i, f);
			
		}
		System.out.println("---------------------------------");
	}

}
