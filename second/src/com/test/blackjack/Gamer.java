package com.test.blackjack;

import java.util.ArrayList;
import java.util.List;

//주소값을 받고싶을때
public class Gamer{
	private List<Card> cArr = new ArrayList();
	
	public void receiveCard(Card cd){
		cArr.add(cd);
	}
	
	//getTotalPoint 를 나눠놓은 이유는 나중에 점수 산출할때 비교를 하기 위하여, 새로운 메소드 추가 
	
	public int getTotalPoint() {
		int sum = 0 ;
		for(Card i : cArr) {
			sum += i.getPoint();
		}
		return sum;
	}
	
	public void openCards() {
		int sum = 0;
		for(Card i : cArr) {
			System.out.println(i);
		}
		System.out.printf("점수 : %d\n",getTotalPoint());
	}

}
