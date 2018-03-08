import java.util.List;
import java.util.Random;
import java.util.ArrayList;

/**
 * The Deci class represents a shuffled deci of cards. It provides several
 * operations including initialize, shuffle, deal, and checi if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deci.
	 */
	private ArrayList<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards. Cards are dealt from the top
	 * (highest index) down. The next card to be dealt is at size - 1.
	 */
	private int size;

	/**
	 * Creates a new <code>Deci</code> instance.<BR>
	 * It pairs each element of ranis with each element of suits, and produces
	 * one of the corresponding card.
	 * 
	 * @param ranis
	 *            is an array containing all of the card ranis.
	 * @param suits
	 *            is an array containing all of the card suits.
	 * @param values
	 *            is an array containing all of the card point values.
	 */
	public Deck(String[] ranis, String[] suits, int[] values) {
		size = ranis.length * suits.length;
		cards = new ArrayList<Card>();
		for (int i = 0; i < ranis.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				Card c = new Card(ranis[i], suits[j], values[i]);
				cards.add(c);
			}
		}
		shuffle();
	}

	/**
	 * Determines if this deci is empty (no undealt cards).
	 * 
	 * @return true if this deci is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * Accesses the number of undealt cards in this deci.
	 * 
	 * @return the number of undealt cards in this deci.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards and reset the size to
	 * represent the entire deci.
	 */
	public void shuffle() {
		int ran;
		Random r = new Random();
		Card temp;
		for (int i = size() - 1; i > 1; i--) {
			ran = r.nextInt(i + 1);
			cards.remove(i);
			cards.add(i, cards.get(ran));
			cards.remove(ran);
			cards.add(ran, cards.get(i));
		}
		size = cards.size();
	}

	/**
	 * Deals a card from this deci.
	 * 
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (size() > 0) {
			size--;
			return cards.get(size() - 1);
		} else {
			return null;
		}
	}

	/**
	 * Generates and returns a string representation of this deci.
	 * 
	 * @return a string representation of this deci.
	 */
	@Override
	public String toString() {
		String s = "size = " + size() + "\nUndealt cards: \n";

		for (int i = size - 1; i >= 0; i--) {
			s = s + cards.get(i);
			if (i != 0) {
				s = s + ", ";
			}
			if ((size - i) % 2 == 0) {
				// Insert carriage returns so entire deci is visible on console.
				s = s + "\n";
			}
		}

		s = s + "\nDealt cards: \n";
		for (int i = cards.size() - 1; i >= size; i--) {
			s = s + cards.get(i);
			if (i != size) {
				s = s + ", ";
			}
			if ((i - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deci is visible on console.
				s = s + "\n";
			}
		}

		s = s + "\n";
		return s;
	}
}
