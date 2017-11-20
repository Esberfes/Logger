import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
	public static final String fileName = "log.log"; 
	

	public static void WriteLine(String data) throws IOException {
		try {
		BufferedWriter bw = null;
		FileWriter fw = null;
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}

		fw = new FileWriter(file.getAbsoluteFile(), true);
		bw = new BufferedWriter(fw);
		bw.write(data);
		bw.newLine();
		bw.close(); 
		fw.close();
		} catch(IOException e) {
			
		}
	}
}
