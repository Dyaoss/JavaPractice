package ch02;

public class VIPCustomer extends Customer{

	private int agentId;
	double salesRatio;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.01;
		customerGrade = "VIP";
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	
}
