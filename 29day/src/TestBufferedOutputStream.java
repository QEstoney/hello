import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestBufferedOutputStream {
		public static void main(String[] args) throws IOException{
			         // �����ļ�����
					File file = new File("D:/b/buf.txt");
					file.mkdirs();
					// ���Ǵ���һ���ֽ����������
					OutputStream os = new FileOutputStream(file);
					// ����һ�����л��������ֽ����������
				BufferedOutputStream bos = new BufferedOutputStream(os);
	
				String str = "ǧɽ��ɾ�,��������.����������,��������ѩ.";
				//�ַ�ת��Ϊ�ֽ�
				
					byte[] b = str.getBytes();
					bos.write(b);
					
					bos.write(97);
	
				bos.flush();
					bos.close();
		}
	
	}
