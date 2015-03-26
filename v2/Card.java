public class Card {
	int value;
	int worth;
	char type;

	public Card(int v){
		value = v;
		detType();
	}

	public String toString(){
		return "|" + type + " " + worth + "|";	
	}

	public void detType(){
		if (value < 10){
			type = (char)(value + (int)'0');
			worth = value;
			return;
		}
		if (value == 10){
			type = 'T';
			worth = 10;
			return;
		}
		if (value == 11){
			type = 'J';
			worth = 10;
			return;
		}
		if (value == 12){
			type = 'Q';
			worth = 10;
			return;
		}
		if (value == 13){
			type = 'K';
			worth = 10;
			return;
		}
		if (value == 14){
			type = 'A';
			worth = 11;
			return;
		}
	}

	public static void main(String[] args){
		Card card1 = new Card(14);
		System.out.println(card1);


	}

}