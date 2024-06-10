package practise2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GetNum {

	public static int getNumber() {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("数値を入力してください");
		int num = 0;
		boolean validInput = false;
		
		while(!validInput) {
			System.out.println("数値を入力してください");
			try {
				num = scanner.nextInt();
				validInput = true;			
			} catch (InputMismatchException e) {
				System.out.println("無効な入力です。整数を入力してください。");
				scanner.next();
			} catch (NoSuchElementException e) {
				System.out.println("入力がありません。もう一度入力してください。");
				break;
			} catch (IllegalStateException e) {
                System.out.println("スキャナーが閉じられています。");
                break; // スキャナーが閉じられている場合はループを終了
			}
		}
		
//		 scanner.close();  // 最後にScannerを閉じる
		return num;
	}
}
