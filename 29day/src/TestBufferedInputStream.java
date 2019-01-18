import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) throws IOException {
		// 创建文件对象
		File file = new File("D:/a/buf.txt");
		// 创建一个带有缓冲区的字节输入流对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

		// 创建一个缓存数组
		byte[] b = new byte[bis.available()];
		while (-1 != (bis.read(b))) {
			String str = new String(b);
			System.out.println(str);
		}

		bis.close();
	}
}