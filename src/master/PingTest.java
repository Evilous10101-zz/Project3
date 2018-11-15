package master;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class PingTest {
	public static void Test() {
		// TODO Auto-generated method stub
		
	
	{
	HttpURLConnection connection = null;
	{
		System.out.println("If the system prints out 200 then the website is up");
    try {
        URL u = new URL("http://www.google.com/");
        connection = (HttpURLConnection) u.openConnection();
        connection.setRequestMethod("HEAD");
        int code = connection.getResponseCode();
        System.out.println("" + code);
        // You can determine on HTTP return code received. 200 is success.
    } catch (MalformedURLException g) {
        // TODO Auto-generated catch block
        g.printStackTrace();
    } catch (IOException g) {
        // TODO Auto-generated catch block
        g.printStackTrace();
    } finally {
        if (connection != null) {
            connection.disconnect();
        }
    }
	}
	}

}
}
