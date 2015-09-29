package creditcard.gui.concrete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import creditcard.CreditCardModule;
import framework.gui.SwingDashBoardBlock;
import framework.gui.concrete.ControllerFactory;
import framework.module.IModuleFactory;

public class CreaditCardDashBoardHeader implements SwingDashBoardBlock {
	@Override
	public void addBlock(JPanel panel, IModuleFactory factory, ControllerFactory cfactory) {
		
		CreditCardModule bfactory = CreditCardModule.getInstance();
		// assert factory == bfactory
		JButton add = new JButton();
		add.setText("Add credit card");
		panel.add(add);
		add.setBounds(24,20,192,33);
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CreditCardDialog dialog = new CreditCardDialog(bfactory);
				dialog.setBounds(450, 20, 300, 330);
				dialog.setVisible(true);
			}
		});
	}
}
