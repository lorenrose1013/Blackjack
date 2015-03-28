import java.util.*;

public class User extends Player {
	
	public User(){
		super();
	}

	public boolean getMove(){
		Scanner scan = new Scanner(System.in);
		System.out.print("\nYour current hand adds up to " + getCount() + ". ");
        System.out.println("Would you like to take a card?");
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

	public void showCards(){
		for (int i = 0; i < hand.size(); i++){
			System.out.print(hand.get(i) + "  ");
		}
	}

}