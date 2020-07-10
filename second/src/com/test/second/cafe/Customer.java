package com.test.second.cafe;

import java.util.Scanner;

public class Customer {
	
	
	public MenuItem order(Menu menu) {
		//if문 사용
//		Scanner scan = new Scanner(System.in);
//		int max = 4, min = 1;
//		while(true) {
//		menu.showMenu();
//		System.out.println("주문하실 메뉴를 입력해 주세요.");
//		int coffee = scan.nextInt();
//		if(coffee < min || coffee > max) {
//			System.out.println("값을 잘못 입력하셨습니다. 다시 입력해주세요.");
//			continue;
//		}
//		else {
//			scan.close();
//			return menu.choose(coffee-1);
//		}
//	}
		//try catch문 사용
		Scanner scan = new Scanner(System.in);
		MenuItem mi = null;
		menu.showMenu();
		while(mi == null) {
			try {
				System.out.println("메뉴 번호를 선택하세요.");
				String menuNum = scan.nextLine();
				//nextLine은 공백을 포함한다 EX)안녕하세요 만나서 반갑습니다.
				//next 는 공백을 포합하지 않는다 EX) 안녕하세요 만나서 반갑습니다. --> 안녕하세요
				int intMenuNum = Integer.parseInt(menuNum);
				mi = menu.choose(intMenuNum-1);
			}catch(NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			}catch(Exception e) {
				System.out.println("메뉴에 없는 메뉴를 선택하셨습니다.");
			}
		}
		scan.close();
		return mi;
	}
	public void drinkCoffee(Coffee coffee) {
		System.out.printf("%s를 마신다.",coffee.getName());
	}
}
