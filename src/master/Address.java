package master;

import java.io.IOException;
import java.io.PrintWriter;

public class Address {
	
	
	
	static MakeOrder textFieldValue13 = new MakeOrder();
	static MakeOrder textFieldValue14 = new MakeOrder();
	static MakeOrder textFieldValue1 = new MakeOrder();
	
	public static void CreateNewAddress() throws IOException
	{
		PrintWriter writer = new PrintWriter("UserLocation");
		//User ID is stored here to show what product when where and who bought it.
		writer.println("User ID: " + textFieldValue13);
		writer.println("Item User ordered " + textFieldValue1);
		writer.println("Shipping Address, city, state, and zip code: " + textFieldValue14);
		writer.close();
	}

}
