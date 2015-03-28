public class Dealer extends Player {

	public Dealer(){
		super();
	}

	public void takeCard(Card c){
		hand.add(c);
		count += c.worth;
	}

	public void showCard(){
		System.out.println(hand.get(0) + "  ");
	}

}