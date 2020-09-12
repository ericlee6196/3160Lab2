import java.util.Arrays;
import java.io.*;
public class lab2p2 {

		public static void main (String [] args) throws IOException {
			
			PrintWriter out = new PrintWriter ("lab2p2.txt");
			//temperature for the next 7 days
			double [] far = {67, 77, 80, 69, 76, 79, 75};
			double [] cel = new double [7];
			double [] far2 = new double [7];
			//converting all farenheit to celsius and placing in celsius array
			for (int x = 0; x < 7; x++)
				cel[x] = (far[x] - 32) * 5/9;
			//converting all celsius array values back into farenheit into new farenheit array
			for (int x = 0; x < 7; x++)
				far2[x] = (cel[x] * 9/5) + 32;
			//printing values as before and after each conversion
			out.println("Original Farenheit:");
			out.println(Arrays.toString(far));
			out.println("Celsius:");
			out.println(Arrays.toString(cel));
			out.println("Back to Farenheit:");
			out.println(Arrays.toString(far2));
			out.close();
		}
}
