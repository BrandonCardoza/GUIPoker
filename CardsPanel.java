import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class CardsPanel extends JPanel {
	
	JPanel buttonPane;
	JPanel yourHandButtonPane;
	JPanel enemyHandButtonPane;
	JPanel centerButtonPane;
	JPanel textAndButtonsPanel;
	PokerGame game;
	JButton dealButton;
	JButton flopButton;
	JButton riverButton;
	JButton turnButton;
	JButton revealButton;
	JButton newGameButton;
	JTextField centerCards;
	JTextArea text;
	boolean canChooseCards = false;
	CardListener cardListener;
	int cardsChosen;
	JPanel yourCardsPane;
	JPanel opponentCardsPane;
	JPanel yourHandButtonPane1;
	JPanel enemyHandButtonPane1;
	JTextField yourTotalWins;
	JTextField enemyTotalWins;
	JTextField yourRoundScore;
	JTextField enemyRoundScore;
	int totalWins;
	int totalLosses;
	boolean gameFinished = false;
	JTextField yourCards;
	JTextField opponentCards;
	boolean playAgain = true;
	FileWriter writer;
	File myObj;
	Scanner myReader;
	
	public CardsPanel() 
	{
		setUpGame();
	}
	
	public void setUpGame()
	{
		game = new PokerGame();
		this.setPreferredSize(new Dimension(1250, 630));		
		this.setLayout(new BorderLayout());
		
		JPanel playingCardsPanel = new JPanel();
		playingCardsPanel.setLayout(new BorderLayout(0,30));
		playingCardsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		add(playingCardsPanel, BorderLayout.WEST);
		
		textAndButtonsPanel = new JPanel();
		textAndButtonsPanel.setLayout(new BorderLayout(0,10));
		textAndButtonsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 30, 10));
		add(textAndButtonsPanel, BorderLayout.EAST);
		
		text = new JTextArea(12, 40);
		text.setEditable(false);
		JScrollPane scroller = new JScrollPane(text, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		text.insert("The goal of this game is to make your best five card hand."
					+ "\nAt the start of each hand, you'll recieve two cards."
					+ "\nThen you'll get the next three cards, then another one, then one last card."
					+ "\nAt this point, you'll have 7 cards in your hand. You need to get rid of 2 to make a hand of 5."
					+ "\nThe rankings of hands are as follows (Note aces can be high or low):"
					+ "\n\nRoyal Flush: 10, Jack, Queen, King, Ace of the same suit"
					+ "\nStraight Flush: A run of 5 cards all in the same suit"
					+ "\n4 of a Kind: 4 of the same card with an extra card, different suits"
					+ "\nFull House: 3 of a kind of one card, and a pair of another card"
					+ "\nFlush: Any 5 cards, all of the same suit"
					+ "\nStraight: A run of 5 cards with different suits"
					+ "\n3 of a kind: 3 of a kind of one card with two different cards"
					+ "\n2 pair: A pair of one card and a pair of another card"
					+ "\nPair: A pair of one card and three different cards"
					+ "\nHigh Card: No matching cards of different suits"
					+ "\n\nMake your best hand of 5 and then go against your opponent's hand. Good Luck!", 0);
		textAndButtonsPanel.add(scroller, BorderLayout.NORTH);
		
		cardListener = new CardListener();
		
		yourCardsPane = new JPanel();
		yourCardsPane.setLayout(new BorderLayout(0,0));
		yourHandButtonPane = new JPanel();
		yourHandButtonPane.setLayout(new BoxLayout(yourHandButtonPane, BoxLayout.X_AXIS));
		playingCardsPanel.add(yourCardsPane, BorderLayout.SOUTH);
		yourCards = new JTextField();
		yourCards.setText("Your Cards");
		yourCards.setHorizontalAlignment(JTextField.CENTER);
		yourCards.setEditable(false);
		yourCardsPane.add(yourCards, BorderLayout.NORTH);
		yourCardsPane.add(yourHandButtonPane, BorderLayout.CENTER);
		
		
		opponentCardsPane = new JPanel();
		opponentCardsPane.setLayout(new BorderLayout(0,0));
		enemyHandButtonPane = new JPanel();
		enemyHandButtonPane.setLayout(new BoxLayout(enemyHandButtonPane, BoxLayout.X_AXIS));
		playingCardsPanel.add(opponentCardsPane, BorderLayout.NORTH);
		opponentCards = new JTextField();
		opponentCards.setText("Opponent's Cards");
		opponentCards.setHorizontalAlignment(JTextField.CENTER);
		opponentCards.setEditable(false);
		opponentCardsPane.add(opponentCards, BorderLayout.NORTH);
		opponentCardsPane.add(enemyHandButtonPane, BorderLayout.CENTER);
		
		JPanel centerCardsPane = new JPanel();
		centerCardsPane.setLayout(new BorderLayout(0,0));
		centerButtonPane = new JPanel();
		centerButtonPane.setLayout(new BoxLayout(centerButtonPane, BoxLayout.X_AXIS));
		playingCardsPanel.add(centerCardsPane, BorderLayout.CENTER);
		centerCards = new JTextField(50);
		centerCards.setText("\t              Flop\t\t\tRiver\t      Turn");
		centerCards.setEditable(false);
		centerCardsPane.add(centerCards, BorderLayout.NORTH);
		centerCardsPane.add(centerButtonPane, BorderLayout.CENTER);
		
		JPanel scoresPanel = new JPanel();
		scoresPanel.setLayout(new GridLayout(4,2));
		Font font1 = new Font("SansSerif", Font.PLAIN, 30);
		Font font2 = new Font("SansSerif", Font.PLAIN, 24);
		
		JTextField yourScore = new JTextField(10);
		yourScore.setFont(font1);
		yourScore.setHorizontalAlignment(JTextField.CENTER);
		yourScore.setText("Your Score:");
		yourScore.setEditable(false);
		yourRoundScore = new JTextField(1);
		yourRoundScore.setFont(font1);
		yourRoundScore.setHorizontalAlignment(JTextField.CENTER);
		yourRoundScore.setEditable(false);
		
		JTextField enemyScore = new JTextField(10);
		enemyScore.setFont(font1);
		enemyScore.setHorizontalAlignment(JTextField.CENTER);
		enemyScore.setText("Opponent's Score:");
		enemyScore.setEditable(false);
		enemyRoundScore = new JTextField(1);
		enemyRoundScore.setFont(font1);
		enemyRoundScore.setHorizontalAlignment(JTextField.CENTER);
		enemyRoundScore.setEditable(false);
		
		JTextField yourWins = new JTextField(10);
		yourWins.setFont(font1);
		yourWins.setHorizontalAlignment(JTextField.CENTER);
		yourWins.setText("Your Total Wins:");
		yourWins.setEditable(false);
		yourTotalWins = new JTextField(1);
		yourTotalWins.setFont(font1);
		yourTotalWins.setHorizontalAlignment(JTextField.CENTER);
		yourTotalWins.setEditable(false);
		
		JTextField enemyWins = new JTextField(10);
		enemyWins.setFont(font2);
		enemyWins.setHorizontalAlignment(JTextField.CENTER);
		enemyWins.setText("Opponent's Total Wins:");
		enemyWins.setEditable(false);
		enemyTotalWins = new JTextField(1);
		enemyTotalWins.setFont(font1);
		enemyTotalWins.setHorizontalAlignment(JTextField.CENTER);
		enemyTotalWins.setEditable(false);
		
//		scoresPanel.add(yourScore);
//		scoresPanel.add(yourRoundScore);
//		scoresPanel.add(enemyScore);
//		scoresPanel.add(enemyRoundScore);
//		scoresPanel.add(yourWins);
//		scoresPanel.add(yourTotalWins);
//		scoresPanel.add(enemyWins);
//		scoresPanel.add(enemyTotalWins);
//		textAndButtonsPanel.add(scoresPanel, BorderLayout.CENTER);

		
		ButtonListener listener = new ButtonListener();
		dealButton = new JButton("Deal");
		flopButton = new JButton("Flop");
		riverButton = new JButton("River");
		turnButton = new JButton("Turn");
		revealButton = new JButton("Reveal");
		newGameButton = new JButton("New Game");
		dealButton.addActionListener(listener);
		flopButton.addActionListener(listener);
		riverButton.addActionListener(listener);
		turnButton.addActionListener(listener);
		revealButton.addActionListener(listener);
		newGameButton.addActionListener(listener);
		textAndButtonsPanel.add(dealButton, BorderLayout.SOUTH);
		
		//game.shuffleAndDeal();
//		yourHandButtonPane.add(Box.createHorizontalGlue());
//		makeYourCardButton(game.yourCard1);
//		makeYourCardButton(game.yourCard2);
//		yourHandButtonPane.add(Box.createHorizontalGlue());
//		enemyHandButtonPane.add(Box.createHorizontalGlue());
//		makeBackOfCardButton();
//		makeBackOfCardButton();
//		enemyHandButtonPane.add(Box.createHorizontalGlue());
		
		//game.dealFlop();
//		makeCenterCardButton(game.flopCard1);
//		makeCenterCardButton(game.flopCard2);
//		makeCenterCardButton(game.flopCard3);
		
		//game.dealRiver();
//		makeCenterCardButton(game.riverCard);
		
		//game.dealTurn();
//		makeCenterCardButton(game.turnCard);
		
		yourHandButtonPane.setAlignmentX(CENTER_ALIGNMENT);
		try {
			myObj = new File("Scores");
		      myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String fileWins = myReader.nextLine();
		        totalWins = Integer.parseInt(fileWins);
		        String fileLosses = myReader.nextLine();
		        totalLosses = Integer.parseInt(fileLosses);
		      }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String wins = String.valueOf(totalWins);
		yourTotalWins.setText(wins);
		String losses = String.valueOf(totalLosses);
		enemyTotalWins.setText(losses);
		
		scoresPanel.add(yourScore);
		scoresPanel.add(yourRoundScore);
		scoresPanel.add(enemyScore);
		scoresPanel.add(enemyRoundScore);
		scoresPanel.add(yourWins);
		scoresPanel.add(yourTotalWins);
		scoresPanel.add(enemyWins);
		scoresPanel.add(enemyTotalWins);
		textAndButtonsPanel.add(scoresPanel, BorderLayout.CENTER);

		
	}
	public void makeYourCardButton(Card card)
	{
		Icon icon = new ImageIcon("Card Pictures/" + card.getValue() + ".png"); 
		CardButton card1 = new CardButton(card, icon);
		card1.setSize(10, 10);
		card1.addActionListener(cardListener);
		yourHandButtonPane.add(card1);
	}
	
	public void makeYourHandCardsButton(Card card)
	{
		Icon icon = new ImageIcon("Card Pictures/" + card.getValue() + ".png"); 
		CardButton card1 = new CardButton(card, icon);
		card1.setSize(10, 10);
		card1.addActionListener(cardListener);
		yourHandButtonPane1.add(card1);
	}
	
	public void makeEnemyHandCardsButton(Card card)
	{
		Icon icon = new ImageIcon("Card Pictures/" + card.getValue() + ".png"); 
		CardButton card1 = new CardButton(card, icon);
		card1.setSize(10, 10);
		card1.addActionListener(cardListener);
		enemyHandButtonPane1.add(card1);
	}
	
	public void makeEnemyCardButton(Card card)
	{
		Icon icon = new ImageIcon("Card Pictures/" + card.getValue() + ".png"); 
		JButton card1 = new JButton(icon);
		card1.setSize(10, 10);
		enemyHandButtonPane.add(card1);
	}
	
	public void makeCenterCardButton(Card card)
	{
		Icon icon = new ImageIcon("Card Pictures/" + card.getValue() + ".png"); 
		CardButton card1 = new CardButton(card, icon);
		card1.setSize(10, 10);
		card1.addActionListener(cardListener);
		centerButtonPane.add(card1);
	}
	
	public void makeBackOfCardButton()
	{
		Icon icon = new ImageIcon("Card Pictures/Back of Card.jpg"); 
		JButton card1 = new JButton(icon);
		card1.setSize(10, 10);
		enemyHandButtonPane.add(card1);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource() == dealButton)
			{
				cardsChosen = 0;
				canChooseCards = false;
//				if(gameFinished)
//				{
//					yourHandButtonPane1.removeAll();
//					enemyHandButtonPane1.removeAll();
//					centerButtonPane.removeAll();
//					yourHandButtonPane.removeAll();
//					enemyHandButtonPane.removeAll();
//					yourCardsPane.removeAll();
//					opponentCardsPane.removeAll();
//					revalidate();
//					yourCardsPane.add(yourHandButtonPane, BorderLayout.CENTER);
//					opponentCardsPane.add(enemyHandButtonPane, BorderLayout.CENTER);
//					gameFinished = false;
//					revalidate();
//				}
				game.shuffleAndDeal();
				yourCardsPane.add(yourCards, BorderLayout.NORTH);
				opponentCardsPane.add(opponentCards, BorderLayout.NORTH);
				yourHandButtonPane.add(Box.createHorizontalGlue());
				makeYourCardButton(game.yourCard1);
				makeYourCardButton(game.yourCard2);
				yourHandButtonPane.add(Box.createHorizontalGlue());
				enemyHandButtonPane.add(Box.createHorizontalGlue());
				makeBackOfCardButton();
				makeBackOfCardButton();
				enemyHandButtonPane.add(Box.createHorizontalGlue());
				textAndButtonsPanel.remove(dealButton);
				textAndButtonsPanel.add(flopButton, BorderLayout.SOUTH);
				revalidate();
			}
			else if (e.getSource() == flopButton)
			{
				game.dealFlop();
				makeCenterCardButton(game.flopCard1);
				makeCenterCardButton(game.flopCard2);
				makeCenterCardButton(game.flopCard3);
				textAndButtonsPanel.remove(flopButton);
				textAndButtonsPanel.add(riverButton, BorderLayout.SOUTH);
				revalidate();
			}
			else if (e.getSource() == riverButton)
			{
				game.dealRiver();
				makeCenterCardButton(game.riverCard);
				textAndButtonsPanel.remove(riverButton);
				textAndButtonsPanel.add(turnButton, BorderLayout.SOUTH);
				revalidate();
			}
			else if (e.getSource() == turnButton)
			{
				game.dealTurn();
				makeCenterCardButton(game.turnCard);
				textAndButtonsPanel.remove(turnButton);
				text.replaceRange("Choose 5 cards between your 2 and the 5 in the middle"
						+ " to use as your final hand!\n", 0, text.getText().length());
				canChooseCards = true;
				revalidate();
			}
			else if (e.getSource() == revealButton)
			{
				if(game.score > game.enemyScore)
				{
					totalWins++;
					text.replaceRange("Congratulations! You won!!!!!\n"
							+ "Press the \"New Game\" button to play again!", 0, text.getText().length());
				}
				else if(game.score < game.enemyScore)
				{
					totalLosses++;
					text.replaceRange("Dang it! Better luck next time!\n"
							+ "Press the \"New Game\" button to play again!", 0, text.getText().length());
				}
				else
				{
					text.replaceRange("Drama! You guys tied!\n"
							+ "Press the \"New Game\" button to play again!", 0, text.getText().length());
				}
				
				String yourWins = String.valueOf(totalWins);
				String yourLosses = String.valueOf(totalLosses);
				yourTotalWins.setText(yourWins);
				enemyTotalWins.setText(yourLosses);
				opponentCardsPane.remove(enemyHandButtonPane);
				opponentCardsPane.add(enemyHandButtonPane1,BorderLayout.CENTER);
				String enemyScore = String.valueOf(game.enemyScore);
				enemyRoundScore.setText(enemyScore);
				revalidate();
				textAndButtonsPanel.remove(revealButton);
				textAndButtonsPanel.add(newGameButton, BorderLayout.SOUTH);
				revalidate();
				try {
					writer = new FileWriter("Scores");
					writer.write(totalWins + "\n" + totalLosses);
					writer.close();
					myReader.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				gameFinished = true;
				
			}
			else if (e.getSource() == newGameButton)
			{
				removeAll();
				setUpGame();
				revalidate();
				
			}
			
		}
	}
	
	private class CardListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(canChooseCards == true)
			{
				CardButton cardClicked;
				cardClicked = (CardButton) e.getSource();
				cardClicked.getCard().getValue();
				
				if(cardsChosen < 5)
				{
					if(cardClicked.getCard().getValue() == game.yourCard1.getValue())
					{
						game.yourHand.add(game.yourCard1);
						yourHandButtonPane.remove(cardClicked);
						text.append("You chose the " + game.yourCard1.getValue() + "\n");
						cardsChosen++;
					}
					else if(cardClicked.getCard().getValue() == game.yourCard2.getValue())
					{
						game.yourHand.add(game.yourCard2);
						yourHandButtonPane.remove(cardClicked);
						text.append("You chose the " + game.yourCard2.getValue() + "\n");
						cardsChosen++;
					}
					else if(cardClicked.getCard().getValue() == game.flopCard1.getValue())
					{
						game.yourHand.add(game.flopCard1);
						centerButtonPane.remove(cardClicked);
						text.append("You chose the " + game.flopCard1.getValue() + "\n");
						cardsChosen++;
					}
					else if(cardClicked.getCard().getValue() == game.flopCard2.getValue())
					{
						game.yourHand.add(game.flopCard2);
						centerButtonPane.remove(cardClicked);
						text.append("You chose the " + game.flopCard2.getValue() + "\n");
						cardsChosen++;
					}
					else if(cardClicked.getCard().getValue() == game.flopCard3.getValue())
					{
						game.yourHand.add(game.flopCard3);
						centerButtonPane.remove(cardClicked);
						text.append("You chose the " + game.flopCard3.getValue() + "\n");
						cardsChosen++;
					}
					else if(cardClicked.getCard().getValue() == game.riverCard.getValue())
					{
						game.yourHand.add(game.riverCard);
						centerButtonPane.remove(cardClicked);
						text.append("You chose the " + game.riverCard.getValue() + "\n");
						cardsChosen++;
					}
					else if(cardClicked.getCard().getValue() == game.turnCard.getValue())
					{
						game.yourHand.add(game.turnCard);
						centerButtonPane.remove(cardClicked);
						text.append("You chose the " + game.turnCard.getValue() + "\n");
						cardsChosen++;
					}
				}
				
				if(cardsChosen == 5)
				{
					centerButtonPane.setVisible(false);
					canChooseCards = false;
					yourCardsPane.remove(yourHandButtonPane);
					yourHandButtonPane1 = new JPanel();
					yourHandButtonPane1.setLayout(new BoxLayout(yourHandButtonPane1, BoxLayout.X_AXIS));
					
					enemyHandButtonPane1 = new JPanel();
					enemyHandButtonPane1.setLayout(new BoxLayout(enemyHandButtonPane1, BoxLayout.X_AXIS));
					for(Card c: game.yourHand)
					{
						makeYourHandCardsButton(c);
					}
					for(Card c: game.enemyHand)
					{
						makeEnemyHandCardsButton(c);
					}
					yourCardsPane.add(yourHandButtonPane1, BorderLayout.CENTER);
					
					switch(game.calculateScore())
					{
						case(10):
							text.replaceRange("NO FRAKING WAY! YOU JUST GOT A ROYAL FLUSH!", 0, text.getText().length());
							break;
						case(9):
							text.replaceRange("WOW! Nice Straight Flush!", 0, text.getText().length());
							break;
						case(8):
							text.replaceRange("Dang! That Four of a Kind looks really good!", 0, text.getText().length());
							break;
						case(7):
							text.replaceRange("Nice Job, you got a Full House!", 0, text.getText().length());
							break;
						case(6):
							text.replaceRange("Not bad, you got a Flush", 0, text.getText().length());
							break;
						case(5):
							text.replaceRange("You got a Straight, it's alright", 0, text.getText().length());
							break;
						case(4):
							text.replaceRange("Nice Trips you got there", 0, text.getText().length());
							break;
						case(3):
							text.replaceRange("Two Pair, not terrible", 0, text.getText().length());
							break;
						case(2):
							text.replaceRange("It's not a lot but a Pair is better than nothing", 0, text.getText().length());
							break;
						case(1):
							text.replaceRange("Yikes! You've got nothing!", 0, text.getText().length());
							break;
					}
					text.append("\nThis is your final hand! Let's see if it's better than your opponent's!");
					String score = String.valueOf(game.score);
					yourRoundScore.setText(score);
					textAndButtonsPanel.remove(turnButton);
					textAndButtonsPanel.add(revealButton, BorderLayout.SOUTH);
					revalidate();	
				}
			}
		}
		
	}
	

}
