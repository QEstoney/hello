import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class TextBufferedwriter {

	
	public static void main(String[] args) throws IOException {
		
		File file=new File("D:/a/bu1f.txt");
		file.createNewFile();
		
		//创建输出流对象
		OutputStream os=new FileOutputStream(file);
		
		//创建桥梁，把字节转换为字符
		OutputStreamWriter opt=new OutputStreamWriter(os,"gbk");
		
		//把字符输出流包装为带有缓存的字符输出流
		BufferedWriter bw=new BufferedWriter(opt);
		
		System.out.println(opt.getEncoding());
		
		bw.write("eeeeeeeeeeeeeeeeeeeeeeee");
		bw.newLine();//换行符
		bw.newLine();
		bw.write("eeeeeeeeeeeeeeeeeeeeeeee");
		bw.newLine();
		bw.write("eeeeeeeeeeeeeeeeeeeeeeee");
		bw.newLine();
		bw.write("eeeeeeeeeeeeeeeeeeeeeeee");
		bw.newLine();
		bw.write("eeeeeeeeeeeeeeeeeeeeeeee");
		
		bw.flush();
		bw.close();
		
	}
}
