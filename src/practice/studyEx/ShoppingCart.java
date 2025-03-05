package practice.studyEx;

public class ShoppingCart {
	private Item[] items = new Item[10];
	private int itemCount;

	public void addItem(Item item) {
		if (itemCount >= items.length) {
			System.out.println("장바구니가 가득 찼습니다.");
			return;
		}
		// 배열에 아이템 추가
		items[itemCount] = item;
		itemCount++;
	}

	public void displayItems() {
		System.out.println("장바구니 상품 출력");
		for (int i = 0; i < itemCount; i++) {
			Item item = items[i]; // 메인에서 입력받은? 아이템의 이름과 가격을 가져오기 위함
			System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
		}
		System.out.println("총 금액: " + calculateTotalPrice());
	}

	private int calculateTotalPrice() {
		int totalPrice = 0;
		for (int i = 0; i < itemCount; i++) {
			Item item = items[i];
			totalPrice += item.getTotalPrice();
		}
		return totalPrice;
	}
}
