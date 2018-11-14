package master;

import java.io.IOException;
import java.io.PrintWriter;

public class Address {
	
	
	
	static MakeOrder textFieldValue13 = new MakeOrder();
	static MakeOrder textFieldValue14 = new MakeOrder();
	
	
	public static void CreateNewAddress() throws IOException
	{
		PrintWriter writer = new PrintWriter("UserLocation");
		
		writer.println("User ID: " + textFieldValue13);
		writer.println("Shipping Address: " + textFieldValue14);
		writer.close();
	}

}
