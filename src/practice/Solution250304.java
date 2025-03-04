package practice;

public class Solution250304 {
	public static void main(String[] args) {

		// Solution250304 클래스의 인스턴스 생성
		Solution250304 solution = new Solution250304();

		// exam1 메서드 호출
		System.out.println(solution.exam1(-4,7,true));
		System.out.println(solution.exam1(-4,7,false));

	}
	/*
	 * 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를
	 * return 하는 solution 함수를 작성해 주세요.
	 */

	public int exam1(int a, int b, boolean flag) {
		if (flag) {
			return a + b;
		} else {
			return a - b;
		}

	}
}