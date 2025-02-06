package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution250206 {
	public static void main(String[] args) {

		// Solution250203 클래스의 인스턴스 생성
		Solution250206 solution = new Solution250206();

		// exam1 메서드 호출
		String[] strArr = new String[] { "and", "notad", "abcd" };
		System.out.println(Arrays.toString(solution.exam1(strArr)));
		
		// System.out.println(solution.exam1(strArr).toString()); -> toString()을 호출하면 배열의 메모리 주소값(해시코드)이 출력

	}

	/*
	 * 문자열 배열 strArr가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을
	 * 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
	 */

	public String[] exam1(String[] strArr) {
		// 새로운 리스트 생성 (크기 변경 가능하게)
		List<String> strList = new ArrayList<>();

		// "ad"를 포함하지 않는 문자열만 리스트에 추가
		for (String str : strArr) {
			if (!str.contains("ad")) {
				strList.add(str);
			}
		}
		return strList.toArray(new String[0]);
		/*
		 * toArray(T[] a): 지정된 타입의 배열 반환 new String[0]은 배열 크기가 0인 빈 배열을 의미 자바는 자동으로
		 * strList의 크기에 맞게 새로운 배열을 생성해 줌
		 */

	}
}