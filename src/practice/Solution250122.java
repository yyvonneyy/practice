package practice;

import java.util.Arrays;

public class Solution250122 {
	public static void main(String[] args) {

		// Solution250122 클래스의 인스턴스 생성
		Solution250122 solution = new Solution250122();

		// arrExam1 메서드 호출
		int[] arr = { 49, 12, 100, 276, 33 }; // 배열 예시
		solution.arrExam1(arr);

		// arrExam2 메서드 호출
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 3, 3, 3, 3 };
		System.out.println(solution.arrExam2(arr1, arr2));

	}

	public void arrExam1(int[] arr) {
		/*
		 * 정수 배열 arr과 정수 n이 매개변수로 주어집니다. arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
		 * arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성
		 */

		int n = 27;
		int[] answer = {};

		if (arr.length % 2 == 1) {
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 == 0) {
					arr[i] += n;
				}
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 == 1) {
					arr[i] += n;
				}
			}
		}
		answer = Arrays.copyOfRange(arr, 0, arr.length);
		System.out.println(Arrays.toString(answer));
	}

	public int arrExam2(int[] arr1, int[] arr2) {
		/*
		 * 이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다. 두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다. 배열의
		 * 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다. 두 정수 배열 arr1과 arr2가
		 * 주어질 때, 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, arr1이 크다면 1, 두 배열이 같다면 0을 return
		 * 하는 solution 함수를 작성해 주세요.
		 */
		int sum1 = 0;
		int sum2 = 0;
		for (int i : arr1) {
			sum1 += i;
		}
		for (int i : arr2) {
			sum2 += i;
		}
		if (arr1.length == arr2.length) {
			if (sum1 > sum2) {
				return 1;
			} else if (sum1 < sum2) {
				return -1;
			} else {
				return 0;
			}
		} else if (arr1.length > arr2.length) {
			return 1;
		} else {
			return -1;
		}

	}
}
