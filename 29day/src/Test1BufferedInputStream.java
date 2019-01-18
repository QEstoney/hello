import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test1BufferedInputStream {
public static void main(String[] args) throws IOException {
	
	
	File file =new File("D:/a/bu1f.txt");
	file.createNewFile();
	
	BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
	
	//创建一个缓存数组
	byte[] a=new byte[bis.available()];
	
	//字节类型，最后一位为-1
	while(-1!=(bis.read(a))){
		String str=new String(a); 
		System.out.println(str);
		
	}
	
	
	
}
}
