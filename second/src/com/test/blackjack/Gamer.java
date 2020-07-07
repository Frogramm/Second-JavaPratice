package com.test.blackjack;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
//수정이 자주되어야하면 ArrayList
//그외 경우는 LinkedList
//주소값을 받고싶을때
public class Gamer{
	private List<Card> cArr = new LinkedList();
	
	public void receiveCard(Card c){
		cArr.add(c);
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
		for(Card i : cArr) {
			System.out.println(i);
		}
		System.out.printf("점수 : %d\n",getTotalPoint());
	}
	public void drawCards(CardDeck cd) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		openCards();
		System.out.println("카드를 더 받으시겠습니까? (y/n)");
		String yn = scan.next();
		if(yn.equals("y")) {
			receiveCard(cd.getCard());
			continue;
		}
		else if(yn.equals("n")) {
			scan.close();
			break;
		}
		else {
			System.out.println("다시 입력 해주세요.");
			continue;
		}
	}
	}
}
