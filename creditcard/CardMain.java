package creditcard;

import java.util.logging.Level;
import java.util.logging.Logger;

import framework.bootstrap.Finco;

public class CardMain extends Finco  {
	public static void main(String args[]) {
		try {
			String propertyFile = "credit.properties";
			if(args.length != 0) {
				propertyFile = args[0];
			}
			Logger.getGlobal().log(Level.INFO, "configuration file " + propertyFile);
			(new CardMain()).load(propertyFile);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

