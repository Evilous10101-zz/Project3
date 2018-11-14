package master;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class User {
	
	static CreateUser textFieldValue = new CreateUser();
	static CreateUser textFieldValue2 = new CreateUser();
	static CreateUser textFieldValue3 = new CreateUser();
	static CreateUser textFieldValue4 = new CreateUser();
	static CreateUser textFieldValue5 = new CreateUser();
	public static void CreateNewUser() throws IOException
	{
		PrintWriter writer = new PrintWriter("UserList");
		writer.println("FirstName: " + textFieldValue);
		writer.println("Lastname: " + textFieldValue2);
		writer.println("Email: " + textFieldValue3);
		writer.println("password: " + textFieldValue4);
		writer.println("address: " + textFieldValue5);
		writer.close();
	}
	
	

}
