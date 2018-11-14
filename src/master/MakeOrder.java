package master;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MakeOrder {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
	private void initialize() {
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
		
		JLabel lblShippingAddress = new JLabel("Shipping address");
		lblShippingAddress.setBounds(25, 112, 105, 14);
		frame.getContentPane().add(lblShippingAddress);
		
		JLabel lblCost = new JLabel("Cost");
		lblCost.setBounds(25, 137, 46, 14);
		frame.getContentPane().add(lblCost);
		
		textField = new JTextField();
		textField.setBounds(117, 36, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 59, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(117, 84, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(117, 109, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(117, 137, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnProccessTheOrder = new JButton("Proccess the order");
		btnProccessTheOrder.setBounds(234, 227, 176, 23);
		frame.getContentPane().add(btnProccessTheOrder);
	}

}
