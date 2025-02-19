package practice.studyEx;

public class ProductOrderMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductOrder[] orders = new ProductOrder[3];

		orders[0] = createOrder("두부", 2000, 2);
		orders[1] = createOrder("김치", 5000, 1);
		orders[2] = createOrder("콜라", 1500, 2);

		printOrders(orders);
		getTotalAmount(orders);
	}

	static ProductOrder createOrder(String productName, int price, int quantity) { // 객체를 생성하고 초기값을 설정
		ProductOrder productOrder = new ProductOrder(); 
		productOrder.productName = productName;
		productOrder.price = price;
		productOrder.quantity = quantity;
		return productOrder;
	}

	static void printOrders(ProductOrder[] orders) { // 배열을 받아서 배열에 들어있는 전체 상품명, 가격, 수량을 출력
		for (ProductOrder productOrder : orders) {
			System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: "
					+ productOrder.quantity);
		}
	}

	static void getTotalAmount(ProductOrder[] orders) { // 배열을 받아서 배열에 들어있는 총 결제 금액을 계산하고, 계산 결과를 반환
		int sum = 0;
		for (ProductOrder productOrder : orders) {
			sum += productOrder.price * productOrder.quantity;
		}
		System.out.println("총 결제 금액: " + sum);
	}
}
