package com.test.blackjack;

public class Rule {
	public static void WhoIsWin(Gamer gamer, Dealer dealer){
		int losePoint = 21;
		int gamerPoint = gamer.getTotalPoint();
		int dealerPoint = dealer.getTotalPoint();
		if(gamerPoint <= losePoint) {
			if(gamerPoint == dealerPoint || (gamerPoint > losePoint && dealerPoint > losePoint)) {
				System.out.println("무승부");
			}
			else if((gamerPoint <= losePoint && gamerPoint > dealerPoint) || dealerPoint > losePoint) {
				System.out.println("게이머 승리");
			}
			else {
				System.out.println("딜러 승리");
			}
		}else System.out.println("딜러승리");
}
}
