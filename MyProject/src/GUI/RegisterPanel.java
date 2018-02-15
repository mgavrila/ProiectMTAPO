package GUI;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class RegisterPanel extends JPanel{
	private JTextField txt_nume;
	private JTextField txt_initialaTata;
	private JTextField txt_prenume;
	private JTextField txt_username;
	private JPasswordField txt_parola;
	private JPasswordField txt_repetaParola;
	
	public JLabel lblNume = new JLabel("Nume:");
	public JLabel lblInitialaTatalui = new JLabel("Initiala tatalui:");
	public JLabel lblNewLabel = new JLabel("Prenume:");
	public JLabel lblUsername = new JLabel("Username:");
	public JLabel lblParola = new JLabel("Parola:");
	public JButton btnInregistreaza = new JButton("Inregistreaza");	
	public JButton btnInapoi = new JButton("Inapoi");
	public JLabel lblRepetaParola = new JLabel("Repeta Parola:");
	public RegisterPanel() {
		
		
		txt_nume = new JTextField();
		txt_nume.setColumns(10);
		
		txt_initialaTata = new JTextField();
		txt_initialaTata.setColumns(10);
		
		txt_prenume = new JTextField();
		txt_prenume.setColumns(10);
		
	
		txt_username = new JTextField();
		txt_username.setColumns(10);
		
		txt_parola = new JPasswordField();	
		txt_repetaParola = new JPasswordField();
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblParola)
								.addComponent(lblUsername)
								.addComponent(lblNume)
								.addComponent(lblNewLabel)
								.addComponent(lblInitialaTatalui)
								.addComponent(lblRepetaParola))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txt_repetaParola)
								.addComponent(txt_parola)
								.addComponent(txt_username)
								.addComponent(txt_prenume)
								.addComponent(txt_initialaTata)
								.addComponent(txt_nume, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnInregistreaza)
							.addGap(18)
							.addComponent(btnInapoi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNume)
						.addComponent(txt_nume, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblInitialaTatalui)
						.addComponent(txt_initialaTata, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txt_prenume, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(txt_username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblParola)
						.addComponent(txt_parola, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRepetaParola)
						.addComponent(txt_repetaParola, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnInregistreaza)
						.addComponent(btnInapoi))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
