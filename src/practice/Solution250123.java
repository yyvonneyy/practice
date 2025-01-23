package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution250123 {
	public static void main(String[] args) {

		// Solution250123 클래스의 인스턴스 생성
		Solution250123 solution = new Solution250123();

		// arrExam1 메서드 호출
		int[] arr = { 5, 1, 4 }; // 배열 예시
		solution.arrExam1(arr);

	}

	/*
	 * 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 양의 정수 배열 arr가 매개변수로 주어질 때, arr의 앞에서부터 차례대로 원소를
	 * 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해
	 * 주세요.
	 */

	public void arrExam1(int[] arr) {
		int[] answer = {};
		//빈 배열 X를 선언
		List<Integer> X = new ArrayList<>();

		//arr의 값을 arr의 수만큼 반복해서 num을 리스트 X에 add하는 과정
		for (int num : arr) {
			for (int i = 0; i < num; i++) {
				X.add(num);
			}
		}
		//현재 X는 리스트고, answer은 배열이기 때문에 X의 값을 배열 answer에 넣는 과
		answer = new int[X.size()]; //X의 크기만큼의 int형 배열을 생성
		for (int i = 0; i < X.size(); i++) { //X 크기만큼 반복해서 X에서의 i번째 값을 가져와서 배열 answer[i]에 대입하는 과
			answer[i] = X.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}
}
