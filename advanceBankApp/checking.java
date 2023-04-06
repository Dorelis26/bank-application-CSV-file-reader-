package advanceBankApp;

//inharats from the account class


public class checking extends account {
	
	//list properties especific to checkings account
	private int debitCardNum;
	private int debitCardPin;
	
	//constructor to initialize our checkinng account properties
	
	public checking(String name,String ssn,double initDeposit) {
		//inharat name from account
		super(name,ssn,initDeposit);
		
		System.out.println("NEW CHECKING ACCOUNT ");
		setDebitCard();
	}
	
	@Override 
	public void setRate() {
		rate = getBaseRate()*.15;
	}
	
	//list any methods specific to the checkings account
	private void setDebitCard() {
		debitCardNum = (int)(Math.random()*Math.pow(10,12));
		debitCardPin= (int)(Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: CHEKINGS");
		super.showInfo();
		System.out.println("your checkings account features"+" \nPIN: "+debitCardPin + "\nCard number: "+debitCardNum);
		}
	
}
