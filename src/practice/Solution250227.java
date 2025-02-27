package practice;

public class Solution250227 {
	public static void main(String[] args) {

		// Solution250227 클래스의 인스턴스 생성
		Solution250227 solution = new Solution250227();

		String str1 = "AbCdEfG";
		String str2 = "aBc";
		// exam1 메서드 호출
		System.out.println(solution.exam1(str1, str2));

		// exam2 메서드 호출
		System.out.println(solution.exam2(new int[] { 3, 4, 5, 2, 1 }));

	}
	/*
	 * 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지
	 * 않으면 0을 return 하는 solution 함수를 완성해 주세요. 단, 알파벳 대문자와 소문자는 구분하지 않습니다.
	 */

	public int exam1(String myString, String pat) {
		int answer = 0;
		if (myString.toLowerCase().contains(pat.toLowerCase())) {
			answer = 1;
		}
		return answer;
	}

	/*
	 * 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록
	 * solution 함수를 완성해주세요.
	 */

	public int exam2(int[] num_list) {
		int answer = 0;
		int mul = 1;
		int sum = 0;
		for (int num : num_list) {
			mul *= num;
			sum += num;
		}
		if (mul < (sum * sum)) {
			answer = 1;
		}
		return answer;

	}
}