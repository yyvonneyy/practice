package practice;

import java.util.Scanner;

public class ThisisJavaCh5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ThisisJavaCh5 클래스의 인스턴스 생성
		ThisisJavaCh5 solution = new ThisisJavaCh5();

		// question7 메서드 호출
		int[] arr = { 1, 5, 3, 8, 2 };
		solution.question7(arr);

		// question8 메서드 호출
		int[][] arr2 = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		solution.question8(arr2);

		// question9 메서드 호출
		solution.question9();

	}

	private void question7(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값: " + max);
	}

	private void question8(int[][] arr) {
		int sum = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			count += arr[i].length;
		}
		double avg = (double) sum / count;

		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}

	private void question9() {
		boolean toggle = true;
		Scanner sc = new Scanner(System.in);

		int[] scores = null;
		int max = 0;
		int sum = 0;
		double avg = 0;

		while (toggle) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택>");

			int answer = sc.nextInt();
			int student = 0;

			if (answer == 1) {
				System.out.print("학생 수:");
				student = sc.nextInt();
				scores = new int[student];
			} else if (answer == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("Scores[" + i + "]:");
					scores[i] = sc.nextInt();
				}
			} else if (answer == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("Scores[" + i + "]:" + scores[i]);
				}
			} else if (answer == 4) {
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					avg = (double) sum / i;
					if (scores[i] > max) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + avg);
			} else if (answer == 5) {
				System.out.println("프로그램 종료");
				toggle = false;
			}
		}
	}

}
