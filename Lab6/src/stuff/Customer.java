package stuff;

import java.util.ArrayList;

public class Customer {
	private String name;
	private String address;
	private int phoneNum;
	private int accountNum;
	private ArrayList<Account> a= new ArrayList<Account>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void createNewAccount() {
		Account account = new Account();
		a.add(account);
	}
	
}
