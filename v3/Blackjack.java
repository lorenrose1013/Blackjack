public class Blackjack{
	Dealer dealer;
	User player1;
	Deck deck;

	public Blackjack(){
		dealer = new Dealer();
		player1 = new User();
		deck = new Deck();
		deck.shuffle();
	}

	public void round(){
		dealer.takeCard(deck.draw());
		dealer.takeCard(deck.draw());
		player1.takeCard(deck.draw());
		player1.takeCard(deck.draw());

		System.out.print("Dealer's Card: ");
		dealer.showCard();
		System.out.print("Your Cards: ");
		player1.showCards();
		boolean userTake, dealerTake;
		userTake = player1.getMove();
		dealerTake = dealer.getMove();
		while(userTake || dealerTake) {
			if (userTake){
				player1.takeCard(deck.draw());
			}
			if (dealerTake){
				dealer.takeCard(deck.draw());
			}
			System.out.print("Dealer's Card: ");
			dealer.showCard();
			System.out.print("Your Cards: ");
			player1.showCards();
			userTake = player1.getMove();
			dealerTake = dealer.getMove();
		}
		getWinner();
	}

	public void getWinner(){
		if(dealer.getCount() == player1.getCount()) {
			System.out.println("It's a tie!");
			return;
		}
		if(dealer.getCount() > 21 && player1.getCount() > 21){
			System.out.println("Both busted");
			return;
		}
		if(dealer.getCount() > 21){
			System.out.println("Dealer Busted. Player1 WINS");
			player1.winGame();
			return;
		}
		if(player1.getCount() > 21){
			System.out.println("Player1 Busted. Dealer WINS");
			dealer.winGame();
			return;
		}
		if (player1.getCount() > dealer.getCount()){
			System.out.println("Player1 wins");
			player1.winGame();
			return;
		}
		System.out.println("Dealer Wins");
		dealer.winGame();
	}

	public static void main(String[] args){
		Blackjack game = new Blackjack();
		game.round();
	}




}