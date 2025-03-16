package practice.studyEx;

public class MathArrayUtils {
	// static int sum; // 이렇게 static으로 선언할 경우 클래스 전체에 공유되어 sum()메서드를 여러번 호출할 시 잘못된 결과가 나옴 (sum의 값이 누적되기때문에)

	private MathArrayUtils() {
		// 인스턴스 생성을 막는 역할
	}

	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static double average(int[] array) {
		double avg = (double) sum(array) / array.length;
		return avg;
	}

	public static int min(int[] values) {
		int minValue = values[0];
		for (int value : values) {
			if (value < minValue) {
				minValue = value;
			}
		}
		return minValue;
	}

	public static int max(int[] values) {
		int maxValue = values[0];
		for (int value : values) {
			if (value > maxValue) {
				maxValue = value;
			}
		}
		return maxValue;
	}

}
