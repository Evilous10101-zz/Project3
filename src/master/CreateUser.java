package master;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class CreateUser {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		
		textField = new JTextField();
		textField.setBounds(105, 30, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 55, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 80, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(105, 105, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(105, 130, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnCreateUser = new JButton("Create User");
		btnCreateUser.setBounds(312, 227, 112, 23);
		frame.getContentPane().add(btnCreateUser);
		
		JCheckBox chckbxAccepotTheTerms = new JCheckBox("Accept the terms of the aggrement of using this application");
		chckbxAccepotTheTerms.setBounds(23, 173, 401, 23);
		frame.getContentPane().add(chckbxAccepotTheTerms);
	}
}
