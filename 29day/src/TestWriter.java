import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {

	public static void main(String[] args) throws IOException {
		
		File file =new File("D:/a/buf1.txt");
	     FileWriter fw=new FileWriter(file);
	     
	     fw.write("苦苦苦��");
	     fw.write("苦苦苦。");
	     fw.write("苦苦苦��");
	     fw.write("苦苦苦。");
	     
	     
	     
	     fw.flush();
	     fw.close();
	}
}
