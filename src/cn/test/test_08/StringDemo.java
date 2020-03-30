package cn.test.test_08;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class StringDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s = "nihao";
		
		byte[] bys = s.getBytes("GBK");
		System.out.println(Arrays.toString(bys));
		System.out.println(bys);
		
		String ss = new String(bys,"GBK");
		System.out.println(ss);
	}

}
