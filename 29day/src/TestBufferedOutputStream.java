import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestBufferedOutputStream {
		public static void main(String[] args) throws IOException{
			         // 创建文件对象
					File file = new File("D:/b/buf.txt");
					file.mkdirs();
					// 这是创建一个字节输出流对象
					OutputStream os = new FileOutputStream(file);
					// 创建一个带有缓冲区的字节输出流对象
				BufferedOutputStream bos = new BufferedOutputStream(os);
	
				String str = "千山鸟飞绝,万径人踪灭.孤舟蓑笠翁,独钓寒江雪.";
				//字符转换为字节
				
					byte[] b = str.getBytes();
					bos.write(b);
					
					bos.write(97);
	
				bos.flush();
					bos.close();
		}
	
	}
