package practice;

import java.util.Arrays;

public class Solution250121 {
	public static void main(String[] args) {
		// 정수 리스트에서 가장 작은 5개의 수들을 오름차순으로 정렬
		int[] num_list = { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10 };
		int[] answer = {};

		Arrays.sort(num_list); // 배열을 오름차순으로 정렬
		answer = Arrays.copyOfRange(num_list, 0, 5);
		// 「copyOfRange」 함수는 배열의 특정 범위를 복사하여 새로운 배열을 생성
		// Arrays.copyOfRange(복사할 원본 배열, 복사를 시작할 인덱스(포함), 복사를 끝낼 인덱스(포함하지 않음))
		
		System.out.println(Arrays.toString(answer));
	}
}
