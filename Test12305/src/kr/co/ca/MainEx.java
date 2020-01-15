package kr.co.ca;

import com.naver.Board;
import com.naver.Reader;
import com.naver.Writer;

public class MainEx {

	public static void main(String[] args) {
		
		Board board = new Board();
		
		Reader reader = new Reader(board);
		Writer writer = new Writer(board);
		
		reader.start();
		writer.start();
		
	}
}
