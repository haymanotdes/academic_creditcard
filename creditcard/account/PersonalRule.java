package creditcard.account;

import creditcard.account.info.CreditCardHolder;
import framework.account.IAccount;
import framework.account.IAccountRule;

public class PersonalRule implements IAccountRule {
	CreditCardHolder person;
	public PersonalRule(CreditCardHolder person) {
		this.person = person;
	}

	@Override
	public boolean beforeWithdraw(IAccount acc, double amount) {
		return true;
	}

	@Override
	public void afterWithdraw(IAccount acc, double amount) {
		if(amount > 400 || (acc.getAmount() - amount) < 0) {
			System.out.println("Send email to " + person.getAddress().getEmail() 
					+ " because the transaction is $" + amount
					+ " and the resulting amount is $" + (acc.getAmount() - amount)
				);
		}
	}

	@Override
	public boolean beforeDeposite(IAccount acc, double amount) {
		return true;
	}

	@Override
	public void afterDeposite(IAccount acc, double amount) {
		if(amount > 400) {
			System.out.println("Send email to " + person.getAddress().getEmail() 
					+ " because the transaction is $" + amount
				);
		}
	}

}
