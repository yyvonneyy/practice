package practice;

public class Solution250204 {
	public static void main(String[] args) {

		// Solution250203 클래스의 인스턴스 생성
		Solution250204 solution = new Solution250204();

		// exam1 메서드 호출
		System.out.println(solution.exam1(10));

		// exam2 메서드 호출
		System.out.println(solution.exam2(new int[] { 3, 4, 5, 2, 1 }));
		
		/*
		 * 자바에서 메서드를 호출할 때 배열을 인수로 전달하려면 배열을 명시적으로 생성해야 합니다. 
		 * solution 메서드가 int[] 배열을 매개변수로 받는다고 가정하면, 배열을 생성하여 메서드에 전달해야함
		 */

	}

	/*
	 * 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의
	 * 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
	 */

	public int exam1(int n) {
		int sum = 0;
		if (n % 2 == 0) {
			for (int i = 2; i <= n; i += 2) {
				sum += Math.pow(i, 2);
			}
		} else {
			for (int i = 1; i <= n; i += 2) {
				sum += i;
			}
		}
		return sum;
	}

	/*
	 * 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을
	 * return하도록 solution 함수를 완성해주세요.
	 */

	public int exam2(int[] num_list) {
		StringBuilder oddNums = new StringBuilder();
		StringBuilder evenNums = new StringBuilder();

		for (int num : num_list) {
			if (num % 2 == 0) {
				evenNums.append(num);
			} else {
				oddNums.append(num);
			}
		}

		int oddSum = Integer.parseInt(oddNums.toString());
		int evenSum = Integer.parseInt(evenNums.toString());

		return oddSum + evenSum;
	}

}