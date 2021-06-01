package by.epam.unit03.main;

public class Task02 {

	public static void main(String[] args) {
		// С помощью оператора while напишите программу определения суммы всех
		//нечетных чисел в диапазоне от 1 до 99 включительно.
		int i=1;
		int sum = 0;
		
		while (i<=99) {
			if(i%2==1) {
				sum+=i;
				System.out.println(i);
			}
			i=i+1;
		}
		
		System.out.println(sum);

	}

}
