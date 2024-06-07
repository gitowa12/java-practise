package practise2;

import java.util.Scanner;

public class GetNum {

	public static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int num = scanner.nextInt();
		scanner.close();
		return num;
	}
}
