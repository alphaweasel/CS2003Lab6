package stuff;

public class Account {
	private int accountID;
	private String dateCreated;
	private int numOfOrders;
	private int amountDue;
	private Order o;
	
	public Account() {
		accountID = 00000000;
		dateCreated = "1-1-2017";
		numOfOrders = 0;
		amountDue = 0;
	}
	
	public void createOrder(){
		o = new Order();
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public int getNumOfOrders() {
		return numOfOrders;
	}

	public void setNumOfOrders(int numOfOrders) {
		this.numOfOrders = numOfOrders;
	}

	public int getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(int amountDue) {
		this.amountDue = amountDue;
	}
	
}
