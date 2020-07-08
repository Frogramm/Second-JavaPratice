package com.test.second.cafe;

public class Cafe {
	public static void main(String[] args) {
		MenuItem m1 = new MenuItem("아메리카노", 1500);
		MenuItem m2 = new MenuItem("카푸치노", 2000);
//		System.out.println(m1);
//		System.out.println(m2);
		Menu menu = new Menu();
		menu.showMenu();
		
		MenuItem mi = menu.choose(0);
		System.out.println(mi);
		//아메리카노 1500원 객체가 넘어와야함
	}
}
