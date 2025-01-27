package practice;

public class Solution250127 {
	public static void main(String[] args) {

		// Solution250127 클래스의 인스턴스 생성
		Solution250127 solution = new Solution250127();

		// arrExam1 메서드 호출
		int number = 55;
		int n = 10;
		int m = 5;
		System.out.println(solution.arrExam1(number, n, m));

		// arrExam2 메서드 호출
		String my_string = "String";
		int k = 3;
		System.out.println(solution.arrExam2(my_string, k));

	}

	/*
	 * 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록
	 * solution 함수를 완성해주세요.
	 */

	public int arrExam1(int number, int n, int m) {
		int answer = 0;
		if (number % n == 0 && number % m == 0) {
			answer = 1;
		} else {
			answer = 0;
		}
		return answer;
	}

	/*
	 * 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성
	 */

	public String arrExam2(String my_string, int k) {
		String answer = "";
		return answer = my_string.repeat(k);
		// String.repeat(n); -> String을 n번 반복하는 메소
	}

}
