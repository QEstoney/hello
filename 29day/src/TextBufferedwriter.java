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
		
		//�������������
		OutputStream os=new FileOutputStream(file);
		
		//�������������ֽ�ת��Ϊ�ַ�
		OutputStreamWriter opt=new OutputStreamWriter(os,"gbk");
		
		//���ַ��������װΪ���л�����ַ������
		BufferedWriter bw=new BufferedWriter(opt);
		
		System.out.println(opt.getEncoding());
		
		bw.write("eeeeeeeeeeeeeeeeeeeeeeee");
		bw.newLine();//���з�
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
