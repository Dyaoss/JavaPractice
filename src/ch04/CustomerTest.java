package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerId(10010);
		int price = customerLee.calcPrice(1000);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerId(10020);
		price = customerKim.calcPrice(1000);
		customerKim.bonusPoint = 2000;
		
		System.out.println(customerKim.showCustomerInfo() + price);
		
	}

}
 