package practice;

public class Solution250209 {
	public static void main(String[] args) {

		// Solution250209 클래스의 인스턴스 생성
		Solution250209 solution = new Solution250209();

		// exam1 메서드 호출
		System.out.println(solution.exam1("lowercase", "x"));
		
		// exam2 메서드 호출
		System.out.println(solution.exam1("lowercase", "x"));

	}
	/*
	 * 영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때, my_string에서
	 * alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
	 */

	public String exam1(String my_string, String alp) {
		if (my_string.contains(alp)) { 
			my_string = my_string.replaceAll(alp, alp.toUpperCase());
		}
		return my_string;
	}
	
	/*코드 리팩토*/
	
	public String exam2(String my_string, String alp) {
		String str = alp.toUpperCase();
		return my_string.replaceAll(alp, str);
		
	}

}