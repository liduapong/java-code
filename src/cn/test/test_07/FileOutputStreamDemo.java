package cn.test.test_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/Users/mac/lrp-projects/java-code/src/cn/test/test_07/FileOutputStreamDemo.java");

		int by = 0;
		// 读取数据，赋值，判断
		while ((by = fis.read()) != -1) {
			System.out.print((char) by);
		}

		// 释放资源
		fis.close();
	}

}
