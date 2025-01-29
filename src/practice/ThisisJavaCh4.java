package practice;

import java.util.Scanner;

public class ThisisJavaCh4 {
	public static void main(String[] args) {

		// ThisisJavaCh4 클래스의 인스턴스 생성
		ThisisJavaCh4 solution = new ThisisJavaCh4();

		// question3 메서드 호출
		System.out.println(solution.question3());

		// question4 메서드 호출
		solution.question4();

		// question5 메서드 호출
		solution.question5();

		// question6 메서드 호출
		solution.question6();

		// question7 메서드 호출
		solution.question7();
	}

	/*
	 * for문을 이용해 1~100까지 정수 중 3의 배수의 총합 구하
	 */

	public int question3() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		return sum;
	}

	/*
	 * while문과 Math.random()을 이용해 주사위 두 개를 던져 나오는 눈의 합이 5가 나올 때 까지 반복
	 */

	public static void question4() {
		int a = 0;
		int b = 0;
		int sum = 0;
		while (true) {
			a = (int) (Math.random() * 6); // 주사위 숫자는 6개니까 *6
			b = (int) (Math.random() * 6);
			sum = a + b;
			if (sum == 5) {
				break;
			}
		}
		System.out.println("a: " + a + ", b: " + b + ", 합: " + sum);
	}

	/*
	 * 중첩 for문을 사용해 4x+5y=60의 모든 해를 구하시오 (x,y는 10이하의 자연수)
	 */

	public static void question5() {
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println("x: " + x + ", y: " + y);
				}
			}
		}
	}

	/* for문을 이용해 * 찍기 */

	public static void question6() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/* while문과 scanner의 nextLine() 메소드를 이용해 예금,출금,조회,종료 기능을 제공하는 코드를 작성하시오 */

	public static void question7() {
		boolean run = true;
		int balance = 0;
		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");

			Scanner sc = new Scanner(System.in);
			int answer = Integer.parseInt(sc.nextLine());

			switch (answer) {
			case 1:
				System.out.print("예금액 > ");
				balance += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.print("출금액 > ");
				balance -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.print("잔고 > " + balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
