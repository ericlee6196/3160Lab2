import java.io.*;
public class lab2p1 {

	public static void main(String[] args) throws IOException {
		//Opens the csvFile that we will be pulling our data from
		File csvFile = new File("csvFile.txt");
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		PrintWriter out = new PrintWriter ("lab2p1.txt");
		
		String line;
		out.println("Artist\t\t\t  Listens\t\tSong Title");
		//splits .txt file into different columns wherever there is a ','
		while ((line = br.readLine()) != null) {
		String[] cols = line.split(",");
		//prints out certain columns
		out.printf("%-25s%7.10s%20s%n", cols[2],cols[3],cols[1]);
		
		}
		br.close();
		out.close();
	}

}
