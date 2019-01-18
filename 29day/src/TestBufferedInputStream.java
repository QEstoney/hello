import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) throws IOException {
		// �����ļ�����
		File file = new File("D:/a/buf.txt");
		// ����һ�����л��������ֽ�����������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

		// ����һ����������
		byte[] b = new byte[bis.available()];
		while (-1 != (bis.read(b))) {
			String str = new String(b);
			System.out.println(str);
		}

		bis.close();
	}
}