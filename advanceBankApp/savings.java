package advanceBankApp;


//inharats from the account class
public class savings extends account {
	
	//list properties specific to the savings account 
	private int saftyDepositBoxId;
	private int saftyDepositBoxKey;
	
	// constructor to initialize settings for the savings property
	
	public savings(String name,String ssn,double initDeposit) {
		//inharat name from account
		super(name,ssn,initDeposit);
		System.out.println("NEW SAVINGS ACCOUNT ");
		setSaftyDepositBox();
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate()-.25;
	}
	
	
	//list methods specific to the savings account
	public void setSaftyDepositBox(){
		saftyDepositBoxId = (int)(Math.random() * Math.pow(10, 3));
		saftyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: SAVINGS");
		super.showInfo();
		System.out.println("your savings account features"+" \nSAFTY DEPOSIT BOX ID: "+saftyDepositBoxId+ " \nSAFTY DEPOSIT BOX KEY: "+saftyDepositBoxKey);
		}
}
