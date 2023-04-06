package advanceBankApp;

import java.util.List;

public class bankAccauntApp {

	public static void main(String[] args) {
		
		String file ="C:\\Users\\dorel\\source\\NewBankAccounts .csv";
		
	// read a csv file than create new accounts base on that data 
	List<String[]> newAccountHolders= utilitys.csv.read(file);
	for(String[] AccountHolder : newAccountHolders ) {
		System.out.println(AccountHolder[0]);
		System.out.println(AccountHolder[1]);
		System.out.println(AccountHolder[2]);
		System.out.println(AccountHolder[3]);
		
	}
		

	}

}
