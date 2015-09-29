package creditcard.account.info;

import framework.account.info.ICustomer;
import framework.account.info.ICustomerFactory;

public class CreditCardHolderFactory implements ICustomerFactory {

	@Override
	public ICustomer createCustomer(String name) {
		return createCreditCardHolder(name);
	}

	public CreditCardHolder createCreditCardHolder(String name) {
		return new CreditCardHolder(name);
	}
}
