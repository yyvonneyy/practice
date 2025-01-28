package practice;

import java.util.Scanner;

public class Solution250128 {
	public static void main(String[] args) {

		// Solution250127 클래스의 인스턴스 생성
		Solution250128 solution = new Solution250128();

		// exam1 메서드 호출
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(solution.exam1(a, b));

		// exam2 메서드 호출
		int num = 98;
		int n = 2;
		System.out.println(solution.exam2(num, n));
	
	}

	/*
	 * 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다. str1과 str2을 이어서 출력하는 코드를 작성하시오.
	 */

	public String exam1(String str1, String str2) {
		return str1.concat(str2);
	}

	public int exam2(int num, int n) {
		if (num % n == 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
