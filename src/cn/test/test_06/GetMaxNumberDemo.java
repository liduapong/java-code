package cn.test.test_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class GetMaxNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
			} else {
				arr.add(num);
			}
		}
		
		Integer[] i = new Integer[arr.size()];
		Integer[] iArray = arr.toArray(i);
		Arrays.sort(iArray);
		System.out.println(iArray[iArray.length - 1]);
	}

}
