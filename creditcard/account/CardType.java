package creditcard.account;

public enum CardType {
	GOLD("Gold",0,6,10),SILVER("Silver",1,8,12),BRONZE("Bronze",2,10,14);
	CardType(String name, int value, double monthlyInterestRate, double minimumPayment) {
		this.name = name;
		this.value = value;
		this.monthlyInterestRate = monthlyInterestRate;
		this.minimumPayment = minimumPayment;
	}
	int value = 0;
	double monthlyInterestRate = 100;
	double minimumPayment = 100;
	String name;
	public int getValue() {
		return value;
	}
	
	public double getMonthlyInterest() {
		return monthlyInterestRate;
	}
	
	public double getMimimumPayment() {
		return minimumPayment;
	}
	
	public static CardType getType(int value) {
		if(value == 0)
			return GOLD;
		if(value == 1)
			return SILVER;
		if(value == 2)
			return BRONZE;
		return GOLD;
	}

	public String getName() {
		return name;
	}
}
