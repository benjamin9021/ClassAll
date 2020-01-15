package kr.co.ca;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainEx3 {

	public static void main(String[] args) {

		InputStream in = null;
		BufferedInputStream bis = null;

		OutputStream out = null;
		BufferedOutputStream bos = null;

		try {
			in = new FileInputStream("C:" + File.separator + "test.png");
			out = new FileOutputStream("C:" + File.separator + "test2.png");
			long a = System.currentTimeMillis();
			bis = new BufferedInputStream(in);
			bos = new BufferedOutputStream(out);

			while (true) {
				int what = bis.read();
				if (what == -1) {
					break;
				}
				bos.write(what);
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
				if (bis != null) {
					bis.close();
				}
				if (out != null) {
					out.close();
				}
				if (bos != null) {
					bos.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("copy end");
	}
}
