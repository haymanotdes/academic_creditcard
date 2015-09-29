package creditcard.account.info;

import creditcard.account.CardType;
import creditcard.account.CreditAccount;
import creditcard.account.PersonalRule;
import framework.account.IAccount;
import framework.account.info.AbstractCustomer;

public class CreditCardHolder extends AbstractCustomer {
	static long autoIncrement = 5000;
	protected CreditCardHolder(String name) {
		super(name);
	}
	
	@Override
	public String getName() { // it should be getDisplayName()
		return "Card:" + super.getName();
	}

	@Override
	public IAccount createAccount(double rate, double amount, int accountType) {
		CardType ctype = CardType.getType(accountType); 
		IAccount holder = new CreditAccount(autoIncrement++, ctype, this);
		holder.addRule(new PersonalRule(this));
		return holder;
	}

}
