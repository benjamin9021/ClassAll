package kr.co.ca;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class MaInEx5 {

	public static void main(String[] args) {

		Writer out = null;
		Reader in = null;
		try {
			out = new FileWriter("C:" + File.separator + "ss.txt");
			in = new FileReader("C:" + File.separator + "ss.txt");
			out.write("hi");
			out.write("\r\n");
			out.write("there");
			out.write(System.getProperty("line.separator"));
			out.write("sucker");
			out.flush();

			char[] arr = new char[16]; // 2n승으로 증가시켜야함 byte라서..
			while (true) {
				int leng = in.read(arr, 0, arr.length);
				if (leng == -1) {
					break;
				}
				for (int i = 0; i < leng; i++) {
					System.out.print(arr[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
