import java.util.*;

import java.util.*;

public class Player{
	ArrayList<Card> hand;
	int count;
	int score;

	public Player(){
		hand = new ArrayList<Card>();
		count = 0;
	}

	public boolean getMove(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to take a card?");
		System.out.println("Your current hand adds up to " + count + ".");
        System.out.println("Please enter: Yes or No :");
        System.out.print(">>");
        String input = scan.nextLine();
        boolean isValid = false;
        while (!isValid) {
            if (input.equals("Yes"))
                return true;
            if (input.equals("No"))   
            	return false;     
            System.out.print("Your input was invalid, try again.\n Remember that input is case sensitive. Please enter: Yes or No.\n>>");
            input = scan.nextLine();
        }  
        return false;

	}

	public void takeCard(Card c){
		hand.add(c);
		count += c.worth;
	}

	public void showCard(){
		System.out.println(hand.get(0));
	}

	public void showCards(){
		for (int i = 0; i < hand.size(); i++){
			System.out.println(hand.get(i));
		}
	}


}