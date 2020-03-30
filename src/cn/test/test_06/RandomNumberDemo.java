package cn.test.test_06;

import java.util.ArrayList;

public class RandomNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array =new ArrayList<Integer>();
		
		int count = 0;
		while (count < 10) {
			int randomNumber = (int)(Math.random()*20)+1;
			
			if(!array.contains(randomNumber)) {
				array.add(randomNumber);
				count++;
			}
			
		}
		for (Integer i :array) {
			System.out.println(i);
		}
	}

}
