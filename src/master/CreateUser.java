package master;

import java.awt.EventQueue;
import java.awt.event.InputMethodListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateUser {
	
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField_11;
	private JTextField textField_21;
	private JTextField textField_31;
	private JTextField textField_41;
	
	
	public static User FirstName = new User();
	public static User LastName = new User();
	public static User Email = new User();
	public static User password = new User();
	public static User address = new User();
	
	
	/**
	 * Launch the application.
	 */
	public static void CreateUser56() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateUser window = new CreateUser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCreateAUser = new JLabel("Create a User");
		lblCreateAUser.setBounds(170, 11, 135, 14);
		frame.getContentPane().add(lblCreateAUser);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setBounds(23, 33, 72, 14);
		frame.getContentPane().add(lblFirstname);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setBounds(23, 58, 72, 14);
		frame.getContentPane().add(lblLastname);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(23, 83, 72, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(23, 108, 72, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(23, 133, 72, 14);
		frame.getContentPane().add(lblAddress);
		
		textField1 = new JTextField();
		textField1.setBounds(105, 30, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		//textField.addInputMethodListener((InputMethodListener) FirstName);
		
		
		textField_11 = new JTextField();
		textField_11.setBounds(105, 55, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		//textField_1.addInputMethodListener((InputMethodListener) LastName);
		
		textField_21 = new JTextField();
		textField_21.setBounds(105, 80, 86, 20);
		frame.getContentPane().add(textField_21);
		textField_21.setColumns(10);
		
		//textField_2.addInputMethodListener((InputMethodListener) Email);
		
		textField_31 = new JTextField();
		textField_31.setBounds(105, 105, 86, 20);
		frame.getContentPane().add(textField_31);
		textField_31.setColumns(10);
		
		//textField_3.addInputMethodListener((InputMethodListener) password);
		
		textField_41 = new JTextField();
		textField_41.setBounds(105, 130, 86, 20);
		frame.getContentPane().add(textField_41);
		textField_41.setColumns(10);
		
		//textField_4.addInputMethodListener((InputMethodListener) address);
		
		JButton btnCreateUser = new JButton("Create User");
		btnCreateUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textFieldValue = textField1.getText();
				String textFieldValue2 = textField_11.getText();
				String textFieldValue3 = textField_21.getText();
				String textFieldValue4 = textField_31.getText();
				String textFieldValue5 = textField_41.getText();
				
				System.out.println("We are giving you some time to write down your password");
				try {
					User.CreateNewUser();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Your user has been created, Thank you for using our trash service");
			}
		});
		btnCreateUser.setBounds(312, 227, 112, 23);
		frame.getContentPane().add(btnCreateUser);
		
		JCheckBox chckbxAccepotTheTerms = new JCheckBox("Accept the terms of the aggrement of using this application");
		chckbxAccepotTheTerms.setBounds(23, 173, 401, 23);
		frame.getContentPane().add(chckbxAccepotTheTerms);
	}
}
