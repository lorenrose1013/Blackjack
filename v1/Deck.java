import java.util.*;

public class Deck{
	ArrayList<Card> pack = new ArrayList<Card>();

	public Deck() {
		String[] suits = {"hearts", "clubs", "diamonds", "spades"};
		for(int i = 0; i < 4; i++){
			String suit = suits[i];
			for(int j = 0; j < 13; j ++){
				int val = j + 2;
				if (val > 10)
					val = 10;
				Card temp = new Card(suit, j + 2, val);
				pack.add(temp);
			}
		}
	}

	public void shuffle(){
		Collections.shuffle(pack);

	}

	public String toString(){
		String s = "";
			for (int i = 0; i < pack.size(); i++){
				s += pack.get(i) + "\n";
			}
		return s;
	}

	// public String toString(){
	// 	String s = "";
	// 	for (int j = 0; j < 3; j++){
	// 		for (int i = 0; i < 13; i++){
	// 			s += pack.get(13 * j + i).line1;
	// 		}
	// 		for (int i = 0; i < 13; i++){
	// 			s += pack.get(13 * j + i).line2;
	// 		}
	// 		for (int i = 0; i < 13; i++){
	// 			s += pack.get(13 * j + i).line3;
	// 		}
	// 		for (int i = 0; i < 13; i++){
	// 			s += pack.get(13 * j + i).line4;
	// 		}
	// 		for (int i = 0; i < 13; i++){
	// 			s += pack.get(13 * j + i).line5;
	// 		}
	// 		for (int i = 0; i < 13; i++){
	// 			s += pack.get(13 * j + i).line6;
	// 		}
	// 		s += "\n";
	// 	}
	// 	return s;
	// }

}