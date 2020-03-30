package cn.test.test_08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// 高效字节流一次读写一个字节数组性能最优
public class CopyMp3Demp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		methed1();
		long end = System.currentTimeMillis();
		System.out.println("共耗时：" + (end - start) + "毫秒");//共耗时：1182毫秒
		
		long start1 = System.currentTimeMillis();
		methed2();
		long end1 = System.currentTimeMillis();
		System.out.println("共耗时：" + (end1 - start1) + "毫秒");//共耗时：3毫秒
		
		long start2 = System.currentTimeMillis();
		methed3();
		long end2 = System.currentTimeMillis();
		System.out.println("共耗时：" + (end2 - start2) + "毫秒");//共耗时：2毫秒
		long start3 = System.currentTimeMillis();
		methed4();
		long end3 = System.currentTimeMillis();
		System.out.println("共耗时：" + (end3 - start3) + "毫秒");//共耗时：25毫秒
	}
	
	public static void methed1() throws IOException {
		FileInputStream fis = new FileInputStream("/Users/mac/Downloads/空(大梦一场空)-于潼.mp3");
		FileOutputStream fos = new FileOutputStream("xx.mp3");
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}
		fis.close();
		fos.close();
	}
	public static void methed2() throws IOException {
		FileInputStream fis = new FileInputStream("/Users/mac/Downloads/空(大梦一场空)-于潼.mp3");
		FileOutputStream fos = new FileOutputStream("xx.mp3");
		
		byte[] bys = new byte[1024];
		int len = 0;
		
		
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0 ,len);
		}
		fis.close();
		fos.close();
	}
	public static void methed3() throws IOException {
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream("/Users/mac/Downloads/空(大梦一场空)-于潼.mp3"));
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("xx.mp3"));
		
		byte[] bys = new byte[1024];
		int len = 0;
		
		
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0 ,len);
		}
		fis.close();
		fos.close();
	}
	
	public static void methed4() throws IOException {
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream("/Users/mac/Downloads/空(大梦一场空)-于潼.mp3"));
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("xx.mp3"));
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}
		fis.close();
		fos.close();
	}
}
