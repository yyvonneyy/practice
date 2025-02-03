package practice;

public class Solution250203 {
	public static void main(String[] args) {

		// Solution250203 클래스의 인스턴스 생성
		Solution250203 solution = new Solution250203();

		// exam1 메서드 호출
		int a = 89;
		int b = 8;
		System.out.println(solution.exam1(a, b));

		// exam2 메서드 호출
		System.out.println(solution.exam2(91, 2));
	}

	/*
	 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중
	 * 더 큰 값을 return 하는 solution 함수를 완성해 주세요. 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return
	 * 합니다.
	 */

	public int exam1(int a, int b) {
		String sum1 = Integer.toString(a) + Integer.toString(b);
		String sum2 = Integer.toString(b) + Integer.toString(a);
		int intSum1 = Integer.parseInt(sum1);
		int intSum2 = Integer.parseInt(sum2);

		if (intSum1 >= intSum2) {
			return intSum1;
		} else {
			return intSum2;
		}
	}

	/*
	 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
	 * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
	 */

	public int exam2(int a, int b) {
		String str1 = Integer.toString(a) + Integer.toString(b);
		int sum3 = Integer.parseInt(str1);
		int sum4 = 2 * a * b;
		return Math.max(sum3, sum4);

		/*
		 * 두 개의 인자를 비교하여 큰 값(Math.max())을 리턴하거나 작은 값(Math.min())을 리턴.
		 * 오로지 숫자(정수, 실수)만 비교가 가능하며 문자열은 비교가 불가능.
		 * 두 값이 같은 경우는 동일한 값을 리턴.
		 */

//		if (sum3 >= sum4) {
//			return sum3;
//		} else {
//			return sum4;
//		}
		
	}
}