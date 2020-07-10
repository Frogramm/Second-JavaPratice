package com.test.second.cafe;
import java.util.*;

import com.test.blackjack.Card;
public class Menu {
	private List<MenuItem> mArr = new ArrayList();
	public Menu() {
		init();
	}
	public List<MenuItem> init() {
		mArr.add(new MenuItem("아메리카노",1500));//0
		mArr.add(new MenuItem("카푸치노",2000));//1
		mArr.add(new MenuItem("카라멜 마끼야또",2500));//2
		mArr.add(new MenuItem("에스프레소",2500));//3
		return mArr;
		}
	
	public void showMenu() {
		System.out.println("Menu");
		for(int i = 0 ; i < mArr.size() ; i++) {
			System.out.printf("%d. %s\n",(i+1),mArr.get(i));
		}
		
		//		int i = 1;
//		System.out.println("Menu");
//		for(MenuItem a : mArr) {
//			System.out.printf("%d. %s\n",i,a);
//			i++;
//		}
	}
	public MenuItem choose(int a) {
		return mArr.get(a);
	}
	
}
