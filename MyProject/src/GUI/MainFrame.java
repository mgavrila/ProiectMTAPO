package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import Services.UtilizatoriService;

public class MainFrame {

	JFrame window = new JFrame("LOGIN");
	LoginPanel login = new LoginPanel();
	AdminPanel admin = new AdminPanel();
	RegisterPanel register = new RegisterPanel();
	
	 public MainFrame(){

		window.setLayout(new BorderLayout());
		window.add(login,BorderLayout.CENTER);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
		
		showLogin();
		btnDelogareAdmin();
		btnExit();
		btnIncarcare();
		showRegister();
		btnGenerareConturi();
		
	}
	 
	 
	 
	 public void showLogin(){
	 login.btnLogin.addActionListener(new ActionListener()
			 {
		 		public void actionPerformed(ActionEvent e)
		 		{
		 			window.setTitle("AdminPanel");
		 			window.remove(login);
		 			window.add(admin);
		 			window.setVisible(true);
		 			window.setLocationRelativeTo(null);
		 			window.pack();
		 		}
			 });
	 }
	 
	 public void btnDelogareAdmin()
	 {
		 admin.btnDelogare.addActionListener(new ActionListener()
			{
			 	public void actionPerformed(ActionEvent e)
			 	{	
			 		int selectedOption = JOptionPane.showConfirmDialog(null, 
                            "Doriti sa va delogati?", 
                            "Alegeti", 
                            JOptionPane.YES_NO_OPTION); 
			 		
			 			if (selectedOption == JOptionPane.YES_OPTION) 
			 			{
			 				window.setTitle("Login");
					 		window.remove(admin);
					 		window.add(login);
					 		window.setVisible(true);
					 		window.setLocationRelativeTo(null);
					 		window.pack();
			 			}
			 			else
			 			{
			 				window.setTitle("AdminPanel");
			 				window.remove(admin);
			 				window.add(admin);
			 				window.setVisible(true);
			 				window.setLocationRelativeTo(null);
			 				window.pack();
			 			}
			 		
			 	}
			}
				 
				 
				 );
	 }
	 
	 public void btnExit()
	 {
		 login.btnExit.addActionListener(new ActionListener()
				 {
			 		public void actionPerformed(ActionEvent e)
			 		{
			 			int selectedOption = JOptionPane.showConfirmDialog(null, 
	                            "Doriti sa inchideti aplicatia?", 
	                            "Alegeti", 
	                            JOptionPane.YES_NO_OPTION); 
				 		
				 			if (selectedOption == JOptionPane.YES_OPTION) 
				 			{
				 				System.exit(0);
				 			}
				 			else
				 			{
				 				window.setTitle("Login");
						 		window.remove(admin);
						 		window.add(login);
						 		window.setVisible(true);
						 		window.setLocationRelativeTo(null);
						 		window.pack();
				 			}
			 		}
				 }
				 );
	 }
	 
	 public void btnIncarcare()
	 {
		 admin.btn_import.addActionListener(new ActionListener()
				 {
			 		public void actionPerformed(ActionEvent e)
			 		{
			 			FileFilter filter = new FileNameExtensionFilter("XLS  file", "xls");
						FileInputStream fis = null;
						JFileChooser fc = new JFileChooser();
						fc.setCurrentDirectory(new java.io.File("C:"));
						fc.setDialogTitle("Import");			
						fc.setFileFilter(filter);	
						int result = fc.showOpenDialog(window);
						
					if(result == JFileChooser.APPROVE_OPTION){			
						try {
							fis = new FileInputStream(fc.getSelectedFile());
							Services.ImportService.doImport(fis);
							JOptionPane.showMessageDialog(null, "Import realizat cu succes!");	
						} catch (FileNotFoundException e1) {
							e1.printStackTrace();
							}			
					}else if(result == JFileChooser.CANCEL_OPTION){
						System.out.println("cancel");
					}		
				}
			 		}
				 );
	 }
	 
	 public void btnGenerareConturi()
	 {
		 admin.btn_conturiProfesori.addActionListener(new ActionListener()
				 {
			 		public void actionPerformed(ActionEvent e)
			 		{
			 			UtilizatoriService.generateProfessorAccounts();
			 			//UtilizatoriService.deleteAllFromUtilizator();
			 			System.out.println("Done");
			 		}
			 
				 }
				 );
		 
	 }
	 
	 public void showRegister()
	 {
		 login.btn_register.addActionListener(new ActionListener()
				 {
			 		public void actionPerformed(ActionEvent e)
			 		{
			 			window.setTitle("RegisterPanel");
			 			window.remove(login);
			 			window.add(register);
			 			window.setVisible(true);
			 			window.setLocationRelativeTo(null);
			 			window.pack();
			 		}
				 });
	 }
	 
}
