import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {

	public static void main(String[] args) throws IOException {
		
		File file =new File("D:/a/buf1.txt");
	     FileWriter fw=new FileWriter(file);
	     
	     fw.write("���죬");
	     fw.write("���졣");
	     fw.write("���죬");
	     fw.write("���졣");
	     
	     
	     
	     fw.flush();
	     fw.close();
	}
}
