import java.awt.Dimension;

import javax.swing.JFrame;

public class PokerGameGUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Texas Hold 'Em");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CardsPanel panel = new CardsPanel();
		frame.getContentPane().add(panel);	
		
		frame.pack();
		frame.setVisible(true);

	}

}
