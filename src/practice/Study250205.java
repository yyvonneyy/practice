package practice;

import java.util.Scanner;

public class Study250205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		int amount = 0;
		boolean toggle = true;

		while (toggle) {
			System.out.println("---------------------------------------");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택: ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("입금액을 입력하세요: ");
				amount = sc.nextInt();
				balance = deposit(balance, amount);
			} else if (menu == 2) {
				System.out.print("출금액을 입력하세요: ");
				amount = sc.nextInt();
				balance = withdraw(balance, amount);
			} else if (menu == 3) {
				System.out.println("현재 잔액: " + balance + "원");
			} else {
				toggle = false;
				System.out.println("시스템을 종료합니다.");
			}
		}
	}

	public static int deposit(int balance, int a) {
		balance += a;
		System.out.println(a + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
		return balance;
	}

	public static int withdraw(int balance, int a) {
		if (balance >= a) {
			balance -= a;
			System.out.println(a + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
		} else {
			System.out.println(a + "원을 출금하려 했으나 잔액이 부족합니다. ");
		}
		return balance;
	}
}