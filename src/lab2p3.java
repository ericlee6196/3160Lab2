import java.io.IOException;
import java.io.*;
public class lab2p3 {
	
	public static void main (String [] args) throws IOException {
	
		PrintWriter out = new PrintWriter ("lab2p3.txt");
		//pulls data from URL and sends it to output
		{
		    try (java.util.Scanner s = new java.util.Scanner(new java.net.URL("https://api.nasa.gov/planetary/apod?api_key=fKJVdhwAejsnf4DYd80uU8ftQOQvYFR4Txrfpcz0").openStream())) {
		      out.println(s.useDelimiter("\\A").next());
		    }
		  }
		out.close();
		}
}