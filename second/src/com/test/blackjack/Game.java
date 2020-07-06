package com.test.blackjack;
//8개를 제외한 나머지 변수들은 모두 레퍼런스 변수이다.
//소문자로시작.
public class Game {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		Dealer deal = new Dealer();
//		Card c = cd.getCard(); // 랜덤한 카드를 1장 리턴, and 카드덱에서 삭제
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		deal.receiveCard(cd.getCard());
		deal.receiveCard(cd.getCard());
		deal.receiveCard(cd.getCard());
		gamer.openCards();
		deal.openCards();
		}
}
