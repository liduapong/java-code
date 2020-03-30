package cn.test.test_07;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		
		String[] colors = { "♠", "♥", "♣", "♦" };
		
		String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		
		for (String color : colors) {
			for (String number :numbers) {
				arr.add(color.concat(number));
			}
		}
		
		arr.add("dawang");
		arr.add("xiaowang");
		
		Collections.shuffle(arr);
		
		ArrayList<String> ll = new ArrayList<String>();
		ArrayList<String> lq = new ArrayList<String>();
		ArrayList<String> lw = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();
		
		for (int x = 0; x < arr.size(); x++) {
			if (x >= arr.size()-3 ) {
				dipai.add(arr.get(x));
			} else if (x % 3 == 0){
				ll.add(arr.get(x));
			} else if (x % 3 == 1){
				ll.add(arr.get(x));
			} else if (x % 3 == 2){
				ll.add(arr.get(x));
			}
		}
		lookpai("林青霞", ll);
		lookpai("风清扬", lw);
		lookpai("刘意", lq);
		lookpai("底牌", dipai);
	} 
	
	public static void lookpai(String name, ArrayList<String> arr) {
		System.out.println(name+"pai :");
		for (String s :arr) {
			System.out.println(s+" ");
		}
		System.out.println();
	}
}
