import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestBufferedReader2 {

	public static void main(String[] args) throws IOException {
		
		// 获取缓冲区的字符输入流,读取控制台输入的内容
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in,"gbk"));
		
		System.out.println("请输入");
		
		String line=reader.readLine();
		System.out.println(line);
		
		reader.close();
		//输入什么，输出什么
	}
}
