public class Card {
	public String suit;
	public String symbol;
	public int order;
	public int val;
	public String line1, line2, line3, line4, line5, line6;


	public Card(String newSuit, int newOrder, int newVal){
		suit = newSuit;
		order = newOrder;
		val = newVal;
		symbolize();
		lines();

		if(order == 14)
			val = 11;

	}

	public void symbolize(){
		if (order == 11)
			symbol = "J ";
		else if (order == 12)
			symbol = "Q ";
		else if (order == 13)
			symbol = "K ";
		else if (order == 14)
			symbol = "A ";
		else if (order == 10)
			symbol = "10";
		else
			symbol = Integer.toString(order) + " ";

	}

	public void lines(){
	line1 = " _____";
	line2 = "|" + symbol + "   |";
		if (suit.equals("hearts")){
			line3 = "|(\\/) |";
			line4 = "| \\/  |";
			line5 = "|   " + symbol + "|";
			line6 = "`-----`";
		}

		if (suit.equals("clubs")){
			line3 = "| &   |";
			line4 = "|&|&  |";
			line5 = "| | " + symbol + "|";
			line6 = "`-----`";
		}

		if (suit.equals("diamonds")){
			line3 = "| /\\  |";
			line4 = "| \\/  |";
			line5 = "|   " + symbol + "|";
			line6 = "`-----`";
		}

		if (suit.equals("spades")){
			line3 = "| /\\  |";
			line4 = "|(__) |";
			line5 = "| /\\" + symbol + "|";
			line6 = "`-----`";
		}
	}

	// public String toString(){
	// 	return line1  + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n" + line6 + "\n";
	// }

	public String toString(){
		return "|" + symbol + " " + suit + "|";
	}
}