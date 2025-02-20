package practice;

public class Solution250220 {
	public static void main(String[] args) {

		// Solution250220 클래스의 인스턴스 생성
		Solution250220 solution = new Solution250220();

		String str = "aBcDeFg";
		// exam1 메서드 호출
		System.out.println(solution.exam1(str));
		
		// exam2 메서드 호출
		System.out.println(solution.exam2(str));

	}
	/*
	 * 알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해주세요.
	 */

	public String exam1(String str) {
		str = str.toLowerCase();
		return str;
	}

	/*
	 * 알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해주세요. 
	 */
	
	public String exam2(String str) {
		str = str.toUpperCase();
		return str;
	}

}