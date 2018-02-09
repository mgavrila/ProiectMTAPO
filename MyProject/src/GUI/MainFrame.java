package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainFrame {

	JFrame window = new JFrame("LOGIN");
	LoginPanel login = new LoginPanel();
	RegisterPanel register = new RegisterPanel();
	
	 public MainFrame(){

		window.setLayout(new BorderLayout());
		window.add(login,BorderLayout.CENTER);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
		
		showRegister();
		registerCancel();
	}
	 
	 public void showRegister(){
		 login.btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					window.setTitle("REGISTER");
					window.remove(login);
					window.add(register);
					window.setVisible(true);
					window.pack();
				}
			});
	 }
	 
	 public void registerCancel(){
			register.rCancelBt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					window.setTitle("LOGIN");
					window.remove(register);
					window.add(login);
					window.setVisible(true);
					window.pack();
				}
			});
	 }
	 
	
}