import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream {

	public static void main(String[] args) throws IOException {

		// System类中的out是一个输出流对象, 其本类是PrintStream
		PrintStream p = System.out;

		p.println("hello world");

		// 创建一个PrintStream类的对象, 其指向文件是demo.txt
		PrintStream ps = new PrintStream(new File("demo.txt"));

		// 设置系统的输出流对象, 其实也就是改变了System.out流的输出对象
		System.setOut(ps);

		System.out.println("hello world");
		System.out.println("今天学习IO流使我非常开心.");

	}
}