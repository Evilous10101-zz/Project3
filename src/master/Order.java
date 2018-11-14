package master;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.swing.JTextField;

public class Order {
	static MakeOrder textFieldValue1 = new MakeOrder();
	static MakeOrder textFieldValue12 = new MakeOrder();
	static MakeOrder textFieldValue13 = new MakeOrder();
	static MakeOrder textFieldValue14 = new MakeOrder();
	static MakeOrder textFieldValue15 = new MakeOrder();
	
	public static void CreateNewOrder() throws IOException
	{
		PrintWriter writer = new PrintWriter(new File("OrderFile"));
		writer.println("Item: " + textFieldValue1);
		writer.println("Amount: " + textFieldValue12);
		writer.println("User ID: " + textFieldValue13);
		writer.println("Shipping Address: " + textFieldValue14);
		writer.println("Cost: " + textFieldValue15);
		writer.close();
	}
	
	
	void saveToFile(String OrderFile, JTextField textField23) throws Exception {
		   FileOutputStream out = new FileOutputStream(OrderFile, true);
		  out.write(textField23.getText().getBytes());
		}
	void saveToFile2(String OrderFile, JTextField textField_123) throws Exception {
		   FileOutputStream out = new FileOutputStream(OrderFile, true);
		  out.write(textField_123.getText().getBytes());
		}

}
