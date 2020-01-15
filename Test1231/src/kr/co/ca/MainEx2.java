package kr.co.ca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainEx2 {

	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream("C:" + File.separator + "test.png");
			out = new FileOutputStream("C:" + File.separator + "test2.png");

			long a = System.currentTimeMillis();
			byte[] arr = new byte[1024];

			while (true) {
				int length = in.read(arr);
				if (length == -1) {
					break;
				}
				out.write(arr, 0, length);
			}
			long b = System.currentTimeMillis();
			System.out.println(b - a);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("copy end");
	}
}
