package com.test.second.cafe;

public class Coffee {
	private String name;
	private int price;
	//private 조건을 줘서 get를 넣어줘야  값을 넣어줄 수 있음.
	public Coffee(MenuItem mi) {
		name = mi.getName();
		price = mi.getPrice();
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return String.format("선택하신 커피는 : %s 이며 가격은 %,d원" ,name ,price);
	}
}
