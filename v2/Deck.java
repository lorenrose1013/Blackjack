import java.util.*;

public class Deck {
	ArrayList<Card> deck = new ArrayList<Card>();

	public Deck(){
		for(int i = 0; i < 4; i++){
			for(int j = 2; j < 15; j ++){
				Card tempCard = new Card(j);
				deck.add(tempCard);
			}
		}
	}

	public Card draw(){
		return deck.remove(deck.size() - 1);
	}

	public String toString(){
		String s = "";
		for(Card c : deck){
			s += c + " ";
		}
		return s;
	}

	public void shuffle(){
		Collections.shuffle(deck);
	}

	public static void main(String[] args){
		Deck pack = new Deck();
		System.out.println(pack);
		System.out.println(pack.draw());

	}



}