package ch06;

public class VIPCustomer extends Customer{

	private int agentId;
	double salesRatio;
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
	}
	
	

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		
		return price -= (int)(price * salesRatio);
		
	}



	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	
}
