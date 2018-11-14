package master;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class User {
	
	static CreateUser textField1 = new CreateUser();
	static CreateUser textField_11 = new CreateUser();
	static CreateUser textField_21 = new CreateUser();
	static CreateUser textField_31 = new CreateUser();
	static CreateUser textField_41 = new CreateUser();
	public static void CreateNewUser() throws IOException
	{
		PrintWriter writer = new PrintWriter("UserList");
		writer.println("FirstName: " + textField1);
		writer.println("Lastname: " + textField_11);
		writer.println("Email: " + textField_21);
		writer.println("password: " + textField_31);
		writer.println("address: " + textField_41);
		writer.close();
	}
	
	

}
