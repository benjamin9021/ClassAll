package kr.co.ca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainEx {

	public static void main(String[] args) {

		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream("C:" + File.separator + "test.png");
			out = new FileOutputStream("C:" + File.separator + "copy_test.png");

			while (true) {
				int what = in.read();
				if (what == -1) {
					break;
				}
				out.write(what);
			}

			System.out.println("copy completed");

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
	}
}
