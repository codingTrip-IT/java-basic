package ref.ex;
/**
 * 문제: 상품 주문 시스템 개발 - 리팩토링
 * **문제 설명**
 * 앞서 만들었던 다음 클래스에 있는 "상품 주문 시스템"을 리팩토링 하자.
 * `class1.ex.ProductOrderMain`
 * 당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
 * 먼저, 상품 주문 정보를 담을 수 있는 `ProductOrder` 클래스를 만들어보자.
 * **요구 사항**
 * `ProductOrder` 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
 * 상품명 (`productName` )
 * 가격 (`price` )
 * 주문 수량 (`quantity` )
 * */
public class ProductOrder {
    String productName;
    int price;
    int quantity;
}
