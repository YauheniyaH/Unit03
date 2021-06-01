package by.epam.unit03.main;

public class Task04 {

	public static void main(String[] args) {
		// Составить таблицу значений функции y = 5 - x2/2 
		//на отрезке [-5; 5] с шагом 0.5.
		
		double y;
		for (double i=-5;i<=5; i=i+0.5) {
			y=5-i*i/2;
			System.out.println("y("+i+")="+y);
		}

	}

}
