package ch3;
/*
 * Pick a card
 */
public class Problem3_24 {
	public static void main(String[] args){

	double suit = Math.random() * 4;
	String suitType = "";
	if (suit < 1){
		suitType = "Clubs";
	} else if (suit > 1 && suit < 2){
		suitType = "Diamonds";
	} else if (suit > 2 && suit < 3){
		suitType = "Hearts";
	}else if (suit > 3 && suit < 4){
		suitType = "Spades";
	}

	double cardNumber = Math.random() * 13;
	String card = "";
	if (cardNumber > 0 && cardNumber < 1){
		card = "Ace";
	} else if (cardNumber > 1 && cardNumber < 2){
		card = "2";
	} else if (cardNumber > 2 && cardNumber < 3){
		card = "3";
	} else if (cardNumber > 3 && cardNumber < 4){
		card = "4";
	} else if (cardNumber > 4 && cardNumber < 5){
		card = "5";
	} else if (cardNumber > 5 && cardNumber < 6){
		card = "6";
	} else if (cardNumber > 6 && cardNumber < 7){
		card = "7";
	} else if (cardNumber > 7 && cardNumber < 8){
		card = "8";
	} else if (cardNumber > 8 && cardNumber < 9){
		card = "9";
	} else if (cardNumber > 9 && cardNumber < 10){
		card = "10";
	} else if (cardNumber > 10 && cardNumber < 11){
		card = "Jack";
	} else if (cardNumber > 11 && cardNumber < 12){
		card = "Queen";
	} else if (cardNumber > 12 && cardNumber < 13){
		card = "King";
	}
	/*
	System.out.println(suitType);
	System.out.println(cardNumber);
	*/
	System.out.println("The card you picked is " + card + " of " + suitType);
	}
}
