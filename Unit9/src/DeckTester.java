/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"two","three","four","five","six","seven",
							"eight","nine","ten","jack","queen","king","ace"};		
		String[] suits1 = {"hearts", "diamonds", "clubs", "spades"};		
		int[] pointValues1 = {2,3,4,5,6,7,8,9,10,11,12,13,14};		
		Deck d1 = new Deck(ranks1, suits1, pointValues1);	
		System.out.println(d1);
		d1.deal();
		System.out.println(d1);
		
		String[] ranks2 = {"A", "B", "C"};
		String[] suits2 = {"Giraffes", "Lions"};
		int[] pointValues2 = {2, 1, 6};
		Deck d2 = new Deck(ranks2, suits2, pointValues2);
		System.out.println(d2);
		d2.deal();
		System.out.println(d2);
		
		String[] ranks3 = {"Michigan", "USC", "Berkeley", "MIT", "Stanford"};
		String suits3[] = {"engineering", "biology", "economics"};
		int pointValues3[] = {2, 4, 6, 8, 10};
		Deck d3 = new Deck(ranks3, suits3, pointValues3);
		System.out.println(d3);
		d3.deal();
		System.out.println(d3);
	}
}
