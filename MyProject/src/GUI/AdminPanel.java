package GUI;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JSeparator;

public class AdminPanel extends JPanel{
	
	public JButton btn_import = new JButton("Incarcare studenti si profesori");
	public JButton btnDelogare = new JButton("Delogare");
	public JButton btn_conturiProfesori = new JButton("Genereaza conturi profesori");
	public JButton btnGenereazaConturiStudenti = new JButton("Genereaza conturi studenti");
	
	public AdminPanel() {
				
		
		JLabel lblManagement = new JLabel("MANAGEMENT");
		lblManagement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JSeparator separator = new JSeparator();
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblManagement, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
							.addGap(69))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btn_import, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btn_conturiProfesori, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnGenereazaConturiStudenti, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnDelogare, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblManagement, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(btn_import)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btn_conturiProfesori)
					.addGap(7)
					.addComponent(btnGenereazaConturiStudenti)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDelogare)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
