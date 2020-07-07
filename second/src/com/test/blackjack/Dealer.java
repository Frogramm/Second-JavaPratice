package com.test.blackjack;

public class Dealer extends Gamer{
	
	@Override
	public void drawCards(CardDeck cd) {
		//딜러가 가지고 있는 카드의 합계 점수가 17점 이상이 될때까지 카드 뽑기
		int sp = 17;
		while(getTotalPoint() < sp) {
				receiveCard(cd.getCard());
		}
	}
}
