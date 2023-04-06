package advanceBankApp;

public interface IRate {
	
	//write a method that returns a base rate
	default double getBaseRate() {
		return 2.5;
	}
}
