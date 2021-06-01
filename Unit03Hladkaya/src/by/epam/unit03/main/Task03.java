package by.epam.unit03.main;

public class Task03 {

	public static void main(String[] args) {
		// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)
		long sum = 0, temp=1;
		
		for (int i=1;i<=10; i++) {
			temp=temp*(sum+i);
			sum=sum+i;
			System.out.println(sum);
		}
		
		System.out.println(temp);

	}

}
