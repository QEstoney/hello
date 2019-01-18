import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {

	public static void main(String[] args) throws IOException {
		
		
		File file =new File("D:/a/d.txt") ;
			if(!file.exists() ) {
				System.out.println("�ļ�������");
				System.exit(0);
			}
		
			FileInputStream fi=new FileInputStream(file);
			
			// ����һ�¿��Բ��������Ķ�ȡ��������
			System.out.println(fi.available());//89
			
			
			int read = fi.read();
			System.out.println(read);//97
			
			fi.skip(1);
			
			byte[] b = new byte[fi.available()];
			// �����ڶ�ȡ���ݵ�ʱ��, �ǰ��������ݴ洢�������������
			// �����ȡ�����ļ���ĩβ, ��ô�ͷ���-1
			while (-1 != (fi.read(b))) {
				// ���ֽ�����ת����ַ���
				String str = new String(b);
				System.out.println(str);
			}

			/**
			 * 
			 */
			fi.close();
		
	}
}
