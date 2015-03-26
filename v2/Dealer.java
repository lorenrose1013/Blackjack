import java.util.*;

public class Dealer{
	ArrayList<Card> hand;
	int count;
	int score;

	public Dealer(){
		hand = new ArrayList<Card>();
		count = 0;
	}

	public boolean getMove(){
		return count <= 15;
	}

	public void takeCard(Card c){
		hand.add(c);
		count += c.worth;
	}

	public void showCard(){
		System.out.print(hand.get(0) + "\n");
	}

}