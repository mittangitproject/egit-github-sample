package testme;

public class PropertyTest {
	
	int value = 0;
	String accountDetails = "";
	
	
	public PropertyTest(int value, String accountDetails) {
		super();
		this.value = value;
		this.accountDetails = accountDetails;
	}
	
	public String getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(String accountDetails) {
		this.accountDetails = accountDetails;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	

}
