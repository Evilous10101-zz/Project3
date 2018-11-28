package master;

import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;

public class MakeOrder {

	private JFrame frame;
	private JTextField textField23;
	private JTextField textField_123;
	private JTextField textField_223;
	private JTextField textField_323;
	private JTextField textField_423;

	/**
	 * Launch the application.
	 */
	public static void MakeOrder23() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeOrder window = new MakeOrder();
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
	public MakeOrder() {
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
		
		JLabel lblMakeAnOrder = new JLabel("Make An Order");
		lblMakeAnOrder.setBounds(138, 11, 226, 14);
		frame.getContentPane().add(lblMakeAnOrder);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(25, 37, 46, 14);
		frame.getContentPane().add(lblItem);
		
		JLabel lblAmmount = new JLabel("Amount");
		lblAmmount.setBounds(25, 62, 46, 14);
		frame.getContentPane().add(lblAmmount);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setBounds(25, 87, 46, 14);
		frame.getContentPane().add(lblUserId);
		
		JLabel lblShippingAddress = new JLabel("Shipping address, Town, State, and Zipcode");
		lblShippingAddress.setBounds(25, 112, 289, 14);
		frame.getContentPane().add(lblShippingAddress);
		
		JLabel lblCost = new JLabel("Cost");
		lblCost.setBounds(25, 137, 46, 14);
		frame.getContentPane().add(lblCost);
		
		textField23 = new JTextField();
		textField23.setBounds(324, 36, 86, 20);
		frame.getContentPane().add(textField23);
		textField23.setColumns(10);
		
		textField_123 = new JTextField();
		textField_123.setBounds(324, 59, 86, 20);
		frame.getContentPane().add(textField_123);
		textField_123.setColumns(10);
		
		textField_223 = new JTextField();
		textField_223.setBounds(324, 84, 86, 20);
		frame.getContentPane().add(textField_223);
		textField_223.setColumns(10);
		
		textField_323 = new JTextField();
		textField_323.setBounds(324, 109, 86, 20);
		frame.getContentPane().add(textField_323);
		textField_323.setColumns(10);
		
		textField_423 = new JTextField();
		textField_423.setBounds(324, 134, 86, 20);
		frame.getContentPane().add(textField_423);
		textField_423.setColumns(10);
		
		JButton btnProccessTheOrder = new JButton("Proccess the order");
		btnProccessTheOrder.setForeground(Color.BLUE);
		btnProccessTheOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Please what while your Order is placed");
				
				String textFieldValue1 = textField23.getText();
				String textFieldValue12 = textField_123.getText();
				String textFieldValue13 = textField_223.getText();
				String textFieldValue14 = textField_323.getText();
				String textFieldValue15 = textField_423.getText();
				//loads text values into system so order and address class can be use
				try {
					Order.CreateNewOrder();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Address.CreateNewAddress();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Your order has been placed");
			}
		});
		btnProccessTheOrder.setBounds(234, 227, 176, 23);
		frame.getContentPane().add(btnProccessTheOrder);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Shuting down");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		btnExit.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
