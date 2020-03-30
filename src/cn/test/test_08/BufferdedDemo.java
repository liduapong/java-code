package cn.test.test_08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferdedDemo {

	public static void main(String[] args) throws IOException {
		// TOD	O Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		
		
		int by = 0;
		while ((by = bis.read()) != -1) {
			System.out.println((char) by);
		}
		
		bis = new BufferedInputStream(new FileInputStream("a.txt"));
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			System.out.println(new String(bys));
		}
		
		bis.close();
	}

}
