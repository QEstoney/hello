import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream {

	public static void main(String[] args) throws IOException {

		// System���е�out��һ�����������, �䱾����PrintStream
		PrintStream p = System.out;

		p.println("hello world");

		// ����һ��PrintStream��Ķ���, ��ָ���ļ���demo.txt
		PrintStream ps = new PrintStream(new File("demo.txt"));

		// ����ϵͳ�����������, ��ʵҲ���Ǹı���System.out�����������
		System.setOut(ps);

		System.out.println("hello world");
		System.out.println("����ѧϰIO��ʹ�ҷǳ�����.");

	}
}