package GUI;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterPanel extends JPanel {
	private JTextField rUsernameTF;
	private JTextField rPasswordTF;
	private JTextField rcPasswordTF;
	private JTextField rEmailTF;
	private JTextField rCnpTF;
	public JButton rCancelBt = new JButton("CANCEL");

	/**
	 * Create the panel.
	 */
	    RegisterPanel() {
		
		JLabel lblUsername = new JLabel("username:");	
		JLabel lblPassword = new JLabel("password:");
		
		rUsernameTF = new JTextField();
		rUsernameTF.setColumns(10);
		
		rPasswordTF = new JTextField();
		rPasswordTF.setColumns(10);
		
		JLabel lblConfirmPassword = new JLabel("confirm password: ");
		
		rcPasswordTF = new JTextField();
		rcPasswordTF.setColumns(10);
		
		JLabel lblEmail = new JLabel("e-mail:");
		
		rEmailTF = new JTextField();
		rEmailTF.setColumns(10);
		
		JLabel lblCnp = new JLabel("CNP:");
		
		rCnpTF = new JTextField();
		rCnpTF.setColumns(10);
		
		JButton rRegisterBt = new JButton("REGISTER");
		

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblConfirmPassword)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblPassword, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblUsername, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
								.addComponent(lblEmail)
								.addComponent(lblCnp)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(rRegisterBt)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(rCnpTF)
						.addComponent(rEmailTF)
						.addComponent(rPasswordTF)
						.addComponent(rcPasswordTF)
						.addComponent(rUsernameTF)
						.addComponent(rCancelBt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(rUsernameTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(rPasswordTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblConfirmPassword)
						.addComponent(rcPasswordTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(rEmailTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCnp)
						.addComponent(rCnpTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(rRegisterBt)
						.addComponent(rCancelBt))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
