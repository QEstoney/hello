import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) throws IOException {

		// 创建一个PrintWriter的对象
		PrintWriter pw = new PrintWriter(new File("demo.txt"));
		pw.append("append的方式写内容");
		pw.print("以print的方式写内容");

		pw.println("以println的方式写内容");
		pw.println("以println的方式写内容");

		pw.write("以write的方式写内容");

		pw.flush();
		pw.close();
	}

}