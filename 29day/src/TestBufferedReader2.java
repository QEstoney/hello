import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestBufferedReader2 {

	public static void main(String[] args) throws IOException {
		
		// ��ȡ���������ַ�������,��ȡ����̨���������
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in,"gbk"));
		
		System.out.println("������");
		
		String line=reader.readLine();
		System.out.println(line);
		
		reader.close();
		//����ʲô�����ʲô
	}
}
