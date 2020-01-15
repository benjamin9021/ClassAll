package kr.co.ca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MainEx8 {
	
	public static void main(String[] args) {
		
		MemberDTO dto = new MemberDTO("m001", "kim", 21);
		
		InputStream in = null;
		OutputStream out = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
	
			out = new FileOutputStream("C:"+File.separator+"obj.dat");			
			oos = new ObjectOutputStream(out);
			
			oos.writeObject(dto);
			
			in = new FileInputStream("C:"+File.separator+"obj.dat");
			ois = new ObjectInputStream(in);
			
			Object obj = ois.readObject();
			if (obj instanceof MemberDTO) { // runtime exception 막기위해서 instranceof를 써야한다(예외)
				MemberDTO re = (MemberDTO) obj;
				System.out.println(re.getId());
				System.out.println(re.getName());
				System.out.println(re.getAge());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (ois != null) {
					ois.close();
				}
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
				if (oos!= null) {
					oos.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
