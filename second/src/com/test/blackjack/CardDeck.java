package com.test.blackjack;
import java.util.*;
//보라색 글씨는 제네릭 제약사항
public class CardDeck {
	private List<Card> arr = new ArrayList();
	public CardDeck() {
		init();
	}
	private void init() {
		for(int i = 0 ; i < Card.PATTERNS.length ; i++) {
			for(int z = 1 ; z <= 13 ; z++) {
				arr.add(new Card(Card.PATTERNS[i],getDeno(z),getPoint(z)));
//				String pattern = Card.PATTERNS[i];
//				String deno = getDeno(z);
//				Card c = new Card(pattern,deno);
//				arr.add(c);
				}
			}
		}
	private String getDeno(int num) {
		switch(num) {
		case 1 : return "A";
		case 11 : return "J";
		case 12 : return "Q";
		case 13: return "K";
		default:
			return String.valueOf(num);
	}
	}
		
	private int getPoint(int num) {
		return num > 10 ? 10 : num;
	}
	
	@Override
	public String toString() {
		for(Card card : arr) {
			System.out.println(card);
		}
		return "";
	}
	
	
	public Card getCard() {
		int rIndex = (int)(Math.random()* arr.size()); //랜덤값 호출 
		return arr.remove(rIndex);		 // rIndex번째 값 삭제와 동시에 리턴
	}
}
