package creditcard;

import creditcard.account.info.CreditCardHolderFactory;
import framework.account.DefaultAccountListFactory;
import framework.account.IAccountListFactory;
import framework.account.info.ICustomerFactory;
import framework.account.transaction.DefaultTransactionFactory;
import framework.account.transaction.ITransactionFactory;
import framework.module.IModuleFactory;

public class CreditCardModule implements IModuleFactory {
	private ITransactionFactory transactionFactory = null;
	private CreditCardHolderFactory customerFactory = null;
	private IAccountListFactory accountFactory = null;
	private static CreditCardModule singleton = null;
	
	public CreditCardModule() {
		singleton = this;
	}
	
	
	@Override
	public ITransactionFactory getTransactionFactory() {
		if(transactionFactory == null) {
			transactionFactory = new DefaultTransactionFactory();
		}
		return transactionFactory;
	}
	
	@Override
	public ICustomerFactory getCustomerFactory() {
		return getCreditCardHolderFactory();
	}

	public CreditCardHolderFactory getCreditCardHolderFactory() {
		if(customerFactory == null) {
			customerFactory = new CreditCardHolderFactory();
		}
		return customerFactory;
	}

	@Override
	public IAccountListFactory getAccountListFactory() {
		if(accountFactory == null)
			accountFactory = new DefaultAccountListFactory();
		return accountFactory;
	}

	public static CreditCardModule getInstance() {
		if(singleton == null)
			singleton = new CreditCardModule();
		return singleton;
	}

	
}
