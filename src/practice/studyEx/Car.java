package practice.studyEx;

public class Car {
	public static int count;

	public Car(String name) {
		System.out.println("차량 구입, 이름: " + name);
		count++;
	}

	public static void showTotalCars() {
		System.out.println("구매한 차량 수: " + count);
	}

}
