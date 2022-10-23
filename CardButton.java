import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CardButton extends JButton{
	
	private Card card;
	
	public CardButton(Card newCard, Icon icon)
	{
		card = newCard;
		this.setIcon(icon);
	}
	
	public Card getCard()
	{
		return card;
	}
}
