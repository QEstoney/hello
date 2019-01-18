import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TestFileReader {

	public static void main(String[] args) throws IOException {
		File file =new File("D:/a/buf1.txt");
	     FileReader fr=new FileReader(file);
	     
	     //如何恰当创建缓存区
	     char [] chs=new char[20];
	     
	     while(-1!=fr.read(chs)) {
	    	 System.out.println(new String(chs));
	     }
	}
}
