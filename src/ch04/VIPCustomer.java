package ch04;

public class VIPCustomer extends Customer{

	private int agentId;
	double salesRatio;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.01;
		customerGrade = "VIP";
		
	}
	
	

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		
		return super.calcPrice(price);
	}



	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	
}
