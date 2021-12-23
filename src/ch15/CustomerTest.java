package ch15;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.sayHello();

        Buy buyer = customer; // 업캐스팅
        buyer.buy(); // buy에서 정의된 메서드만 사용 가능하다.

    }
}
