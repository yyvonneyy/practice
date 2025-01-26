package practice;

public class Solution250126 {
	public static void main(String[] args) {

		// Solution250126 클래스의 인스턴스 생성
		Solution250126 solution = new Solution250126();

		// arrExam1 메서드 호출
		String rny_string = "masterpiece";
		solution.arrExam1(rny_string);

	}

	/*
	 * 'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 문자열 rny_string이 주어질 때,
	 * rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
	 */

	public void arrExam1(String str) {
		String answer = "";
		answer = str.replaceAll("m", "rn");
		System.out.println(answer);
	}

	/*
	 * 대상 문자열을 원하는 문자 값으로 변환하는 함수 
	 * replace(CharSequence target, CharSequence replacement) 
	 * replaceAll(String regex, String replacement)
	 * 
	 * 첫번째 매개변수는 변환하고자 하는 대상이 될 문자열 / 두번째 매개변수는 변환할 문자 값
	 */

}
