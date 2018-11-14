package master;

import java.io.IOException;
import java.io.PrintWriter;

public class Address {
	
	
	
	static MakeOrder textField_223 = new MakeOrder();
	static MakeOrder textField_323 = new MakeOrder();
	
	
	public static void CreateNewOrder() throws IOException
	{
		PrintWriter writer = new PrintWriter("UserLocation");
		
		writer.println("User ID: " + textField_223);
		writer.println("Shipping Address: " + textField_323);
		writer.close();
	}

}
