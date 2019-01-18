import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {

	public static void main(String[] args) throws IOException {
		
		
		File file =new File("D:/a/d.txt") ;
			if(!file.exists() ) {
				System.out.println("文件不存在");
				System.exit(0);
			}
		
			FileInputStream fi=new FileInputStream(file);
			
			// 估计一下可以不受阻塞的读取的数据量
			System.out.println(fi.available());//89
			
			
			int read = fi.read();
			System.out.println(read);//97
			
			fi.skip(1);
			
			byte[] b = new byte[fi.available()];
			// 我们在读取数据的时候, 是把数据内容存储到这个缓存区中
			// 如果读取到了文件的末尾, 那么就返回-1
			while (-1 != (fi.read(b))) {
				// 把字节数组转变成字符串
				String str = new String(b);
				System.out.println(str);
			}

			/**
			 * 
			 */
			fi.close();
		
	}
}
