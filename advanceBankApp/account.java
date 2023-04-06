package advanceBankApp;

//abstract means we wont be able to create objects from the account class,
//however we can create objects from classes that inharat Accounts

//implements IRate will give or child account access to the rate inteface
public abstract class account implements IRate {
	
	// list common properties for savings and chekings.
	private String name;
	private String ssn;
	double balance;
	protected String accountNum;
	protected double rate;
	private static int index = 1000;
	
	
	
	
	
	//constructor to set properties and initialize the account 
	
	public account(String name,String ssn,double initDeposit) {
		this.name=name;
		this.ssn=ssn;
		balance=initDeposit;
		
		 
		//set account number
		index++;
		this.accountNum=setAccountNum();
		System.out.println("ACCOUNT NUMBER: "+this.accountNum);
		System.out.println(getBaseRate()); 
		setRate();
	}
	
	//set account number 
	//the two last digits of the ssn + a unique 5 digit number + 3 digit random number.
	
	private String setAccountNum() {
		
		String lastTwoOfSsn = ssn.substring(ssn.length()-2,ssn.length());
		int uniqueId = index;
		int randomNumber =(int)(Math.random() * Math.pow(10, 3));
		return lastTwoOfSsn + uniqueId + randomNumber;
		
	}
	
	
	//list command methods
	
	public void compound() {
		double accrudInterest = balance * (rate/100);
		balance = balance +accrudInterest;
		System.out.println("ACCRUD INTEREST: "+ accrudInterest);
		printBalance();
	}
	
	
	
	public void showInfo() {
	System.out.println("name: "+name+ "\nAccount Number: "+ accountNum + "\nBalance: "+ balance + "\nRate: "+ rate +"%");
	}
	
	public abstract void setRate();
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $"+amount);
		printBalance();
		
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $"+amount);
		printBalance();
	}
	
	public void trasfer(String ToWare,double amount) {
		
		balance = balance - amount;
		System.out.println("Transfering $"+amount + " to "+ToWare);
		printBalance();
		
	}
	public void printBalance() {
		System.out.println("your current balance is $"+balance);
	}

}
