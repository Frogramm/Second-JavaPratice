package com.test.blackjack;
// 생성자 특이점.
// 클래스명이랑 이름이 같다.
// 리턴타입, void 적으면 안됌
public class Card {
	private final String pattern; //클로버 다이아 하트 스페이드
	private final String denomination; //1~10, K Q J
	public final static String[] PATTERNS = {"스페이드", "하트", "클로버", "다이아"};
	private final int point;
	
	public Card(String pattern, String denomination,int point) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}
	
	public String getPattern() {
		return pattern;
	}
	public String getDenomination() {
		return denomination;
	}
	@Override
	public String toString() {
		return String.format("p : %s, d : %s point : %d" , pattern, denomination, point);
	}
}
