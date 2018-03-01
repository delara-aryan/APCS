/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("queen", "hearts", 12);
		System.out.println(c1.rank());
		System.out.println(c1.suit());
		System.out.println(c1.pointValue());
		System.out.println(c1);
		Card c2 = new Card("ten", "spades", 10);
		System.out.println(c2.rank());
		System.out.println(c2.suit());
		System.out.println(c2.pointValue());
		System.out.println(c2);
		Card c3 = new Card("queen", "hearts", 12);
		System.out.println(c3.rank());
		System.out.println(c3.suit());
		System.out.println(c3.pointValue());
		System.out.println(c3);
		if (c3.matches(c1)) {
			System.out.println("Card 3 and Card 1 are the same");
		} else {
			System.out.println("Card 3 and Card 1 are not the same");
		}
	}
}
