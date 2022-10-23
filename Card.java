/**
 * 
 * @author Brandon Cardoza
 *
 */
public class Card {

	private String value;
	private int cardValue;
	
	
	/** Creates the initial card
	 * @param value
	 * @param suit
	 */
	public Card(String value)
	{
		this.value = value;
		this.cardValue = value.charAt(0);
	}
	
	/** Shows the value of the card
	 * @return card value
	 */
	public String getValue()
	{
		return value;
	}
	
	
	/**Also shows you the value of the card
	 * @return
	 */
	public int getCardValue()
	{
		return value.charAt(0);
	}
	
	
	/** Gives the ASCII number for the character at a given point
	 * @param beginIndex
	 * @return
	 */
	public int charAt(int beginIndex)
	{
		return value.charAt(beginIndex);
	}
	
	/** Tell you how many characters are in the value of the card
	 * @return
	 */
	public int size()
	{
		return value.length() - 1;
	}
	
	/**Compares the value of one card to the value of another
	 * @param otherCard
	 * @return
	 */
	public int compareTo(Card otherCard) {
		if (this.getCardValue() < otherCard.getCardValue())
		{
			return -1;
		}
		else if (this.getCardValue() > otherCard.getCardValue()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	/**
	 *Prints out the user's card
	 */
	public String toString()
	{
		return getValue();
	}
	
}
