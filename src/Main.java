import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		int num1 = 0;
		int num2 = 1;
		Numbers.add(num1);
		Numbers.add(num2);
		for (int i = 0; i < 100; i++) {
			if(i == num1 || i == num2)
			{
				int newNumber = num1 + num2;
				Numbers.add(newNumber);
				num1 = num2;
				num2 = newNumber;
			}
			
		}
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.
		System.out.print(Numbers);
	}
}
