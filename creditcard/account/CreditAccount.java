package creditcard.account;

import framework.account.DefaultAccount;
import framework.account.info.ICustomer;

public class CreditAccount extends DefaultAccount {
	CardType cardType = CardType.GOLD;
	public CreditAccount(long id, CardType accountType, ICustomer customer) {
		super(id, accountType.getMonthlyInterest(), 0, accountType.getValue(), customer);
		cardType = accountType;
	}

	@Override
	public String getName() {
		return cardType.getName() + super.getName();
	}
}
