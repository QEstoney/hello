import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) throws IOException {

		// ����һ��PrintWriter�Ķ���
		PrintWriter pw = new PrintWriter(new File("demo.txt"));
		pw.append("append�ķ�ʽд����");
		pw.print("��print�ķ�ʽд����");

		pw.println("��println�ķ�ʽд����");
		pw.println("��println�ķ�ʽд����");

		pw.write("��write�ķ�ʽд����");

		pw.flush();
		pw.close();
	}

}