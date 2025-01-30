package practice;

import java.util.Arrays;

public class Solution250130 {
	public static void main(String[] args) {

		// Solution250127 클래스의 인스턴스 생성
		Solution250130 solution = new Solution250130();

		// exam1 메서드 호출
		String str1 = " i    love  you";
		solution.exam1(str1);
	}

	/*
	 * 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터
	 * 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
	 */

	public void exam1(String my_string) {
		// "\\s+"를 사용하여 연속된 공백을 하나의 구분자로 처리
		String str = my_string.trim(); // 앞 뒤 공백제거
		String[] strArr = str.split("\\s+"); // 공백 기준으로 단어 분

		// 각 요소를 따로 출력하여 공백이 포함되는지 확인
		for (String s : strArr) {
			System.out.println("[" + s + "]");
		}

		/*
		 * 최종 배열 출력 -> Arrays.toString(strArr)는 배열을 문자열로 변환할 때, 쉼표(,)와 공백( )을 포함하여 출력 이때
		 * 쉼표 뒤에 자동으로 공백이 추가되기 때문에, "love" 앞에 원래 공백이 없었음에도 마치 공백이 있는 것처럼 보일 수 있음
		 *  [i, love, you]
		 */
		System.out.println(Arrays.toString(strArr));
	}

}