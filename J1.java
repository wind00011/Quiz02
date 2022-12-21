package x1;

import java.util.*;

public class J1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1;
		int x2;
		int x3 = 0;
		System.out.println("密碼輸入測試");
		System.out.print("請輸入密碼:");
		x1 = sc.nextInt();
		while (true) {
			System.out.print("請再輸入一次密碼:");
			x2 = sc.nextInt();
			if (x1 == x2) {
				System.out.println("密碼正確");
				break;
			}  else if (x1 != x2) {
				System.out.println("與第一次輸入的不同 !");
				x3++;
			}
			if (x3 == 3) {
				throw  new  RuntimeException("輸入三次錯誤！程式停止！");
			}
		}
	}
}
