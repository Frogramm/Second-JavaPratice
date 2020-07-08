package com.test.second.cafe;
//클래스의 구성 요소 맴버필드와 맴버메소드
//맴버필드 : 속성 / 값 저장용
//생성자는 클라스명과 같아야한다.
public class MenuItem {
	private final String name;
	private final int price;
	//숫자를 저장할때 정수값 용이 콤마나 원 같은게 필요하면 출력문에서 수정
	
	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
		//this 안써도 되는 경우는 파라미터와 맴버필드 변수 명이 다를 경우에 가능
		//같다고하면 this.을 붙여야 가능
	}
	
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return String.format("%s : %,d원" ,name ,price);
	}
}
