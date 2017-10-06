package stuff;

public class Order {

	private int orderNumber;
	private String processingDate;
	private String ordered;
	private String assignedTo;
	
	
	public Order() {
		orderNumber = 000000;
		processingDate = "1-1-2017";
		ordered = "clothes";
		assignedTo = "Jim";
	}
	
	public void assignOrder(String name) {
		assignedTo = name;
	}
	
	public String getAssigned() {
		return assignedTo;
	}
	
	public void setOrderNumber(int in) {
		orderNumber = in;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public void setOrder(String merchandise) {
		ordered = merchandise;
	}
	
	public String getOrdered() {
		return ordered;
	}
	
	public void setProcessingDate(String date) {
		processingDate = date;
	}
	
	public String getProcessingDate() {
		return processingDate;
	}
}
