package com.test.blackjack;
//8개를 제외한 나머지 변수들은 모두 레퍼런스 변수이다.
//소문자로시작.
public class Game {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		for(int i = 0 ; i < 2 ; i ++) {
			dealer.receiveCard(cd.getCard());
			gamer.receiveCard(cd.getCard());
		}
		dealer.drawCards(cd);
		gamer.drawCards(cd);
		Rule.WhoIsWin(gamer, dealer);
	}
}
