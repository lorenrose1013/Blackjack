import java.util.*;

public class Player{
	protected ArrayList<Card> hand;
	protected int count;
	protected int score;

	public Player(){
		hand = new ArrayList<Card>();
		count = 0;
	}

	// public int getCount(){
	// 	return count;
	// }
	//account for acessssss

	public int getCount(){
		count = 0;
		int aces = 0;
		for(int i = 0; i < hand.size(); i++){
			Card card = hand.get(i);
			if (card.type == 'A' ){
				aces++;
			}
			count+= card.worth;	
		}
		while(aces > 0 && count > 21){
			aces--;
			count -= 10;
		}
		return count;

	}

	public int getScore(){
		return score;
	}

	public void winGame(){
		score += 1;
	}

	public void takeCard(Card c){
		hand.add(c);
		count += c.worth;
	}

	public boolean getMove(){
		return count <= 15;
	}

	public void showCard(){
		System.out.println(hand.get(0));
	}


}