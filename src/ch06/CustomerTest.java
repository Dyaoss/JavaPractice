package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerM = new Customer(10010, "Mike");
		Customer customerS = new Customer(10020, "Steve");
		Customer customerK = new GoldCustomer(10030, "Kite");
		Customer customerF = new GoldCustomer(10040, "Fred");
		Customer customerB = new VIPCustomer(10050, "Bob");
		
		customerList.add(customerM);
		customerList.add(customerS);
		customerList.add(customerK);
		customerList.add(customerF);
		customerList.add(customerB);
		
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		for(Customer customer: customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스포인트는 " + customer.bonusPoint + "점 입니다.");
		}
	}

}
 