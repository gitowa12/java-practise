package practise2;

public class Main {
	public static void main(String[] args ) {
		
		
		int count = 2;
		int[] numbers = new int[count];
		for(int i = 0; i<count; i++) {
			numbers[i] = GetNum.getNumber();
		};
		int sum = Cal.sum(numbers);
		System.out.println(sum);
		
		IsMul4.isMul4(sum);
		
		
//		System.out.println(num2);

	}
}
