package practice;

public class Solution250129 {
	public static void main(String[] args) {

		// Solution250127 클래스의 인스턴스 생성
		Solution250129 solution = new Solution250129();

		// exam1 메서드 호출
		String str1 = "ABBAA";
		String str2 = "AABB";
		System.out.println(solution.exam1(str1, str2));

	}

	/*
	 * 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. myString의 "A"를 "B"로, "B"를 "A"로 바꾼
	 * 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
	 */

	public int exam1(String myString, String pat) {
		String temp = myString.replace("A", "X") // A를 임시 문자 X로 변경
				.replace("B", "A") // B를 A로 변경
				.replace("X", "B");

		if (temp.contains(pat)) {
			return 1;
		}
		return 0;
	}

}