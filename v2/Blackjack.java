public class Blackjack{
	Dealer dealer;
	Player player1;
	Deck deck;

	public Blackjack(){
		dealer = new Dealer();
		player1 = new Player();
		deck = new Deck();
		deck.shuffle();
	}

	public void round(){
		dealer.takeCard(deck.draw());
		dealer.takeCard(deck.draw());
		player1.takeCard(deck.draw());
		player1.takeCard(deck.draw());

		System.out.println("Dealer's Card: ");
		dealer.showCard();
		System.out.println("Your Cards: ");
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
			System.out.println("Dealer's Card: ");
			dealer.showCard();
			System.out.println("Your Cards: ");
			player1.showCards();
			userTake = player1.getMove();
			dealerTake = dealer.getMove();
		}
		getWinner();
	}

	public void getWinner(){
		if(dealer.count == player1.count) {
			System.out.println("It's a tie!");
			return;
		}
		if(dealer.count > 21 && player1.count > 21){
			System.out.println("Both busted");
			return;
		}
		if(dealer.count > 21){
			System.out.println("Dealer Busted. Player1 WINS");
			player1.score += 1;
			return;
		}
		if(player1.count > 21){
			System.out.println("Player1 Busted. Dealer WINS");
			dealer.score += 1;
			return;
		}
		if (player1.count > dealer.count){
			System.out.println("Player1 wins");
			player1.score += 1;
			return;
		}
		System.out.println("Dealer Wins");
		dealer.score += 1;
	}

	public static void main(String[] args){
		Blackjack game = new Blackjack();
		game.round();
	}




}