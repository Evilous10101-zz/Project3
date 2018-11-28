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
        System.out.println(code);
        // 200 is success. Later will be changed to a simpler number
    } catch (MalformedURLException g) {
        
        g.printStackTrace();
    } catch (IOException g) {
        //catches what the ping test has gathered to see if it is good or not. It didn't worth without this so far
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
