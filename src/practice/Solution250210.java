package practice;

public class Solution250210 {
	public static void main(String[] args) {

		// Solution250209 클래스의 인스턴스 생성
		Solution250210 solution = new Solution250210();

		// exam1 메서드 호출
		System.out.println(solution.exam1("PrOgRaMmErS"));

	}
	/*
	 * 문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자
	 * 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
	 */

	public String exam1(String my_string) {
//		char[] charArr = my_string.toCharArray();
//		for (int i = 0; i < charArr.length; i++) {
//			if (Character.isUpperCase(charArr[i])) {
//				charArr[i] = Character.toLowerCase(charArr[i]);
//			}
//		}
//		my_string = String.valueOf(charArr);

		my_string = my_string.toLowerCase();
		my_string = my_string.replaceAll("a", "A");
		return my_string;
	}

}