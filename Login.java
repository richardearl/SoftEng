import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.ArrayList;

public class Log extends JFrame implements ActionListener{

	JButton btnCreateUser;
	JButton btnLogin;
	JPanel panel;
	JTextField txuser;
	JPasswordField pass;
	private ArrayList<Integer> userList = new ArrayList<Integer>();
	private ArrayList<Integer> passList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Log frameTabel = new Log();
	}
		
	Log(){
		super("Login Autentification");
				
		btnCreateUser = new JButton("Create User");
		btnLogin = new JButton("Login");
		panel = new JPanel();
		txuser = new JTextField(15);
		pass = new JPasswordField(15);
				
		btnCreateUser.addActionListener(this);
		btnLogin.addActionListener(this);
		
		setSize(300,200);
		setLocation(500,280);
		panel.setLayout (null); 
		
		txuser.setBounds(70,30,150,20);
		pass.setBounds(70,65,150,20);
		btnCreateUser.setBounds(60,100,80,20);
		btnLogin.setBounds(140,100,80,20);
		
		panel.add(btnCreateUser);
		panel.add(btnLogin);
		panel.add(txuser);
		panel.add(pass);
		
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnCreateUser) {
			createUser();
		}else if (e.getSource()==btnLogin) {
			login();
		}
	}
	
	private void createUser()
	{
		if (checkValidFields())
		{
			System.out.println("NEW USER ADDED");
			System.out.println(userList.toString());
			System.out.println(passList.toString());
		} else
		{
			System.out.println("ERROR");
		}
	}
	
	private void login()
	{
		
		String username = txuser.getText();
		char[] passw = pass.getPassword();
		String password = String.valueOf(passw);
		int index = userList.indexOf(username.hashCode());
		int storedPassword = passList.get(index).hashCode();
		int hashedPassword = password.hashCode();
		if (storedPassword == hashedPassword)
		{
			HomeScreen aHomeScreen =new HomeScreen();
			HomeScreen.setVisible(true);
			dispose();
		}else {
			
			JOptionPane.showMessageDialog(null,"Wrong Password / Username");
			txuser.setText("");
			pass.setText("");
			txuser.requestFocus();
		}
	}
	
	private boolean checkValidFields()
	{
		
		String username = txuser.getText();
		char[] passw = pass.getPassword();
		String password = String.valueOf(passw);
		
		int uLength = username.length();
		if ((uLength > 3) && (uLength < 17))
		{
			int pLength = password.length();
			if ((pLength > 7) && (pLength < 17) && password.matches(".*\\d.*"))
			{
				hashingAlgorithm(username, password);
				return true;
			}else
			{
				return false;
			}
		}else
		{
			return false;
		}
	}
	   

	
	public void hashingAlgorithm(String username, String password)
	{
		int hashuser = username.hashCode();
		int hashpass = password.hashCode();
		userList.add(hashuser);
		passList.add(hashpass);
	}
	
}
	
