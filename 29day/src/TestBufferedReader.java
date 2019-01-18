import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestBufferedReader {

	public static void main(String[] args) throws IOException{
		String path="src/TextBufferedwriter.java";
		
		File file =new File(path);
		System.out.println(file.exists());
		
		//�������л��������������
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
		
		//// �ж��Ƿ�׼���ö�ȡ��
		System.out.println(br.ready());
		
		String str = null;
		//����һ��string���� ��ֵΪ��
		// readLine()���� ��ȡһ�����ݵķ���.
		// �����ȡ���ļ���ĩβ,�򷵻�null��Ϊ���
		while (null != (str = br.readLine())) {
			System.out.println(str);//��ȡָ��java�ļ�ȫ������ 
		}

		br.close();
	}
}
