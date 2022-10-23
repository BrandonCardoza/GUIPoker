import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class PokerGame {
	
	public Card card, yourCard1, yourCard2, enemyCard1, enemyCard2, flopCard1, flopCard2, flopCard3, riverCard, turnCard;
	public static Scanner scan = new Scanner(System.in);
	public static String play = "y";
	public static ArrayList<Card> deckOfCards = new ArrayList<Card>();
	public ArrayList<Card> yourHand = new ArrayList<Card>();
	public ArrayList<Card> enemyHand = new ArrayList<Card>();
	public static ArrayList<Card> aces = new ArrayList<Card>();
	public static ArrayList<Card> twos = new ArrayList<Card>();
	public static ArrayList<Card> threes = new ArrayList<Card>();
	public static ArrayList<Card> fours = new ArrayList<Card>();
	public static ArrayList<Card> fives = new ArrayList<Card>();
	public static ArrayList<Card> sixes = new ArrayList<Card>();
	public static ArrayList<Card> sevens = new ArrayList<Card>();
	public static ArrayList<Card> eights = new ArrayList<Card>();
	public static ArrayList<Card> nines = new ArrayList<Card>();
	public static ArrayList<Card> tens = new ArrayList<Card>();
	public static ArrayList<Card> jacks = new ArrayList<Card>();
	public static ArrayList<Card> queens = new ArrayList<Card>();
	public static ArrayList<Card> kings = new ArrayList<Card>();
	public static ArrayList<Card> hearts = new ArrayList<Card>();
	public static ArrayList<Card> diamonds = new ArrayList<Card>();
	public static ArrayList<Card> clubs = new ArrayList<Card>();
	public static ArrayList<Card> spades = new ArrayList<Card>();
	public static ArrayList<ArrayList<Card>> allNumbers = new ArrayList<ArrayList<Card>>();
	public static ArrayList<ArrayList<Card>> pair = new ArrayList<ArrayList<Card>>();
	public static ArrayList<ArrayList<Card>> trips = new ArrayList<ArrayList<Card>>();
	public static ArrayList<ArrayList<Card>> quads = new ArrayList<ArrayList<Card>>();
	public static ArrayList<Card> enemyAces = new ArrayList<Card>();
	public static ArrayList<Card> enemyTwos = new ArrayList<Card>();
	public static ArrayList<Card> enemyThrees = new ArrayList<Card>();
	public static ArrayList<Card> enemyFours = new ArrayList<Card>();
	public static ArrayList<Card> enemyFives = new ArrayList<Card>();
	public static ArrayList<Card> enemySixes = new ArrayList<Card>();
	public static ArrayList<Card> enemySevens = new ArrayList<Card>();
	public static ArrayList<Card> enemyEights = new ArrayList<Card>();
	public static ArrayList<Card> enemyNines = new ArrayList<Card>();
	public static ArrayList<Card> enemyTens = new ArrayList<Card>();
	public static ArrayList<Card> enemyJacks = new ArrayList<Card>();
	public static ArrayList<Card> enemyQueens = new ArrayList<Card>();
	public static ArrayList<Card> enemyKings = new ArrayList<Card>();
	public static ArrayList<Card> enemyHearts = new ArrayList<Card>();
	public static ArrayList<Card> enemyDiamonds = new ArrayList<Card>();
	public static ArrayList<Card> enemyClubs = new ArrayList<Card>();
	public static ArrayList<Card> enemySpades = new ArrayList<Card>();
	public static ArrayList<ArrayList<Card>> enemyAllNumbers = new ArrayList<ArrayList<Card>>();
	public static ArrayList<ArrayList<Card>> enemyPair = new ArrayList<ArrayList<Card>>();
	public static ArrayList<ArrayList<Card>> enemyTrips = new ArrayList<ArrayList<Card>>();
	public static ArrayList<ArrayList<Card>> enemyQuads = new ArrayList<ArrayList<Card>>();
	public static String newCard, remove2;
	//Card card, yourCard1, yourCard2, enemyCard1, enemyCard2, flopCard1, flopCard2, flopCard3, riverCard, turnCard;
	public static Random rand = new Random();
	public int cardRemove1 = 0, cardRemove2 = 0, score = 0, enemyScore = 0;
	public static boolean straight = false, enemyStraight = false;

//	public PokerGame() {
//
////		Scanner scan = new Scanner(System.in);
////		String play = "y";
////		ArrayList<Card> deckOfCards = new ArrayList<Card>();
////		ArrayList<Card> yourHand = new ArrayList<Card>();
////		ArrayList<Card> enemyHand = new ArrayList<Card>();
////		ArrayList<Card> aces = new ArrayList<Card>();
////		ArrayList<Card> twos = new ArrayList<Card>();
////		ArrayList<Card> threes = new ArrayList<Card>();
////		ArrayList<Card> fours = new ArrayList<Card>();
////		ArrayList<Card> fives = new ArrayList<Card>();
////		ArrayList<Card> sixes = new ArrayList<Card>();
////		ArrayList<Card> sevens = new ArrayList<Card>();
////		ArrayList<Card> eights = new ArrayList<Card>();
////		ArrayList<Card> nines = new ArrayList<Card>();
////		ArrayList<Card> tens = new ArrayList<Card>();
////		ArrayList<Card> jacks = new ArrayList<Card>();
////		ArrayList<Card> queens = new ArrayList<Card>();
////		ArrayList<Card> kings = new ArrayList<Card>();
////		ArrayList<Card> hearts = new ArrayList<Card>();
////		ArrayList<Card> diamonds = new ArrayList<Card>();
////		ArrayList<Card> clubs = new ArrayList<Card>();
////		ArrayList<Card> spades = new ArrayList<Card>();
////		ArrayList<ArrayList<Card>> allNumbers = new ArrayList<ArrayList<Card>>();
////		ArrayList<ArrayList<Card>> pair = new ArrayList<ArrayList<Card>>();
////		ArrayList<ArrayList<Card>> trips = new ArrayList<ArrayList<Card>>();
////		ArrayList<ArrayList<Card>> quads = new ArrayList<ArrayList<Card>>();
////		ArrayList<Card> enemyAces = new ArrayList<Card>();
////		ArrayList<Card> enemyTwos = new ArrayList<Card>();
////		ArrayList<Card> enemyThrees = new ArrayList<Card>();
////		ArrayList<Card> enemyFours = new ArrayList<Card>();
////		ArrayList<Card> enemyFives = new ArrayList<Card>();
////		ArrayList<Card> enemySixes = new ArrayList<Card>();
////		ArrayList<Card> enemySevens = new ArrayList<Card>();
////		ArrayList<Card> enemyEights = new ArrayList<Card>();
////		ArrayList<Card> enemyNines = new ArrayList<Card>();
////		ArrayList<Card> enemyTens = new ArrayList<Card>();
////		ArrayList<Card> enemyJacks = new ArrayList<Card>();
////		ArrayList<Card> enemyQueens = new ArrayList<Card>();
////		ArrayList<Card> enemyKings = new ArrayList<Card>();
////		ArrayList<Card> enemyHearts = new ArrayList<Card>();
////		ArrayList<Card> enemyDiamonds = new ArrayList<Card>();
////		ArrayList<Card> enemyClubs = new ArrayList<Card>();
////		ArrayList<Card> enemySpades = new ArrayList<Card>();
////		ArrayList<ArrayList<Card>> enemyAllNumbers = new ArrayList<ArrayList<Card>>();
////		ArrayList<ArrayList<Card>> enemyPair = new ArrayList<ArrayList<Card>>();
////		ArrayList<ArrayList<Card>> enemyTrips = new ArrayList<ArrayList<Card>>();
////		ArrayList<ArrayList<Card>> enemyQuads = new ArrayList<ArrayList<Card>>();
////		String newCard, remove2;
////		//Card card, yourCard1, yourCard2, enemyCard1, enemyCard2, flopCard1, flopCard2, flopCard3, riverCard, turnCard;
////		Random rand = new Random();
////		int cardRemove1 = 0, cardRemove2 = 0, score = 0, enemyScore = 0;
////		boolean straight = false, enemyStraight = false;
//		
//		
//		System.out.println("Welcome to Poker!!!");
//		System.out.print("Would you like to hear the rules of the game? (y or n): ");
//		String rules = scan.nextLine();
//		while (!(rules.equalsIgnoreCase("y") || rules.equalsIgnoreCase("n")))
//		{
//			System.out.print("Please press y or n: ");
//			rules = scan.nextLine();
//		}
//		if (rules.equalsIgnoreCase("y"))
//		{
//			System.out.println("\nThe goal of this game is to make your best five card hand."
//					+ "\nAt the start of each hand, you'll recieve two cards."
//					+ "\nThen you'll get the next three cards, then another one, then one last card."
//					+ "\nAt this point, you'll have 7 cards in your hand. You need to get rid of 2 to make a hand of 5."
//					+ "\nThe rankings of hands are as follows (Note aces can be high or low):"
//					+ "\n\nRoyal Flush: 10, Jack, Queen, King, Ace of the same suit"
//					+ "\nStraight Flush: A run of 5 cards all in the same suit"
//					+ "\n4 of a Kind: 4 of the same card with an extra card, different suits"
//					+ "\nFull House: 3 of a kind of one card, and a pair of another card"
//					+ "\nFlush: Any 5 cards, all of the same suit"
//					+ "\nStraight: A run of 5 cards with different suits"
//					+ "\n3 of a kind: 3 of a kind of one card with two different cards"
//					+ "\n2 pair: A pair of one card and a pair of another card"
//					+ "\nPair: A pair of one card and three different cards"
//					+ "\nHigh Card: No matching cards of different suits"
//					+ "\n\nMake your best hand of 5 and then go against your opponent's hand. Good Luck!\n");
//		}
//		System.out.print("Press D to start a new game: ");
//		String deal = scan.nextLine();
//		deal.toLowerCase();
//		
//		while(play.equalsIgnoreCase("y")) 
//		{
//			switch(deal)
//			{
//			case "d":
//			case "D":
//				yourHand.clear();
//				enemyHand.clear();
//				deckOfCards.clear();
//				score = 0;
//				enemyScore = 0;
//				aces.clear();
//				enemyAces.clear();
//				twos.clear();
//				enemyTwos.clear();
//				threes.clear();
//				enemyThrees.clear();
//				fours.clear();
//				enemyFours.clear();
//				fives.clear();
//				enemyFives.clear();
//				sixes.clear();
//				enemySixes.clear();
//				sevens.clear();
//				enemySevens.clear();
//				eights.clear();
//				enemyEights.clear();
//				nines.clear();
//				enemyNines.clear();
//				tens.clear();
//				enemyTens.clear();
//				jacks.clear();
//				enemyJacks.clear();
//				queens.clear();
//				enemyQueens.clear();
//				kings.clear();
//				enemyKings.clear();
//				hearts.clear();
//				enemyHearts.clear();
//				diamonds.clear();
//				enemyDiamonds.clear();
//				clubs.clear();
//				enemyClubs.clear();
//				spades.clear();
//				enemySpades.clear();
//				allNumbers.clear();
//				enemyAllNumbers.clear();
//				pair.clear();
//				enemyPair.clear();
//				trips.clear();
//				enemyTrips.clear();
//				quads.clear();
//				enemyQuads.clear();
//				File deck = new File("cards");
//				if(deck.isFile() && deck.exists())
//				{
//					try
//					{
//						Scanner deckScan = new Scanner(deck);
//						while(deckScan.hasNextLine())
//						{
//							String line = deckScan.nextLine();
//							Scanner cardScan = new Scanner(line);
//							cardScan.useDelimiter(",");
//							while (cardScan.hasNext())
//							{
//								newCard = cardScan.next();
//								
//								card = new Card(newCard);
//								deckOfCards.add(card);
//								
//							}
//							cardScan.close();
//						}
//						deckScan.close();
//					}
//					catch (FileNotFoundException e)
//					{
//					}
//					System.out.println();
//					System.out.println("Deck is shuffled!");
//				}
//				System.out.println();
//				System.out.println("Here is your Hand: ");
//				System.out.println();
//				
//				yourCard1 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
//				deckOfCards.remove(yourCard1);
//				enemyCard1 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
//				deckOfCards.remove(enemyCard1);
//				
//				yourCard2 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
//				deckOfCards.remove(yourCard2);
//				enemyCard2 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
//				deckOfCards.remove(enemyCard2);
//				
//				yourHand.add(yourCard1);
//				yourHand.add(yourCard2);
//				enemyHand.add(enemyCard1);
//				enemyHand.add(enemyCard2);
//				
//				System.out.println("Your first card is: " + yourCard1);
//				System.out.println("Your second card is: " + yourCard2);
//				System.out.println();
//			
//				if(yourCard1.charAt(0) == yourCard2.charAt(0))
//				{
//					System.out.println("Nice Pocket Pair!");
//					System.out.println();
//				}
//				
//				System.out.print("Ready for the Flop? (f to proceed): ");
//				String flop = scan.next();
//				flop.toLowerCase();
//				
//				while(!flop.equalsIgnoreCase("f"))
//				{
//					System.out.print("Press f to deal the Flop: ");
//					flop = scan.next();
//					flop.toLowerCase();
//				}
//				flopCard1 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
//				deckOfCards.remove(flopCard1);
//				flopCard2 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
//				deckOfCards.remove(flopCard2);
//				flopCard3 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
//				deckOfCards.remove(flopCard3);
//				
//				yourHand.add(flopCard1);
//				yourHand.add(flopCard2);
//				yourHand.add(flopCard3);
//				enemyHand.add(flopCard1);
//				enemyHand.add(flopCard2);
//				enemyHand.add(flopCard3);
//				
//				System.out.println();
//				System.out.println("Flop card #1 is: " + flopCard1.toString());
//				System.out.println("Flop card #2 is: " + flopCard2.toString());
//				System.out.println("Flop card #3 is: " + flopCard3.toString());
//				System.out.println();
//					
//				System.out.print("Ready for the River? (r to troceed): ");
//				String river = scan.next();
//				river.toLowerCase();
//				
//				while(!river.equalsIgnoreCase("r"))
//				{
//					System.out.print("Press r to deal the River: ");
//					river = scan.next();
//					river.toLowerCase();
//				}
//				riverCard = deckOfCards.get(rand.nextInt(deckOfCards.size()));
//				deckOfCards.remove(riverCard);
//				
//				yourHand.add(riverCard);
//				enemyHand.add(riverCard);
//				
//				System.out.println();
//				System.out.println("River card is: " + riverCard.toString());
//				System.out.println();
//				
//				System.out.print("Ready for the Turn? (t to proceed): ");
//				String turn = scan.next();
//				turn.toLowerCase();
//				
//				while(!turn.equalsIgnoreCase("t"))
//				{
//					System.out.print("Press t to deal the Turn: ");
//					turn = scan.next();
//					turn.toLowerCase();
//				}
//				turnCard = deckOfCards.get(rand.nextInt(deckOfCards.size()));
//				deckOfCards.remove(turnCard);
//				
//				yourHand.add(turnCard);
//				enemyHand.add(turnCard);
//				
//				System.out.println();
//				System.out.println("Turn card is: " + turnCard.toString());
//				System.out.println();
//				
//				System.out.println("Make your best hand!");
//				System.out.println("(type \"yourCard1\", \"yourCard2\", \"flopCard1\", \"flopCard2\", \n\"flopCard3\", \"riverCard\", \"turnCard\" to get rid of two cards (case sensitive))");
//				System.out.println();
//				System.out.println("yourCard1: " + yourCard1);
//				System.out.println("yourCard2: " + yourCard2);
//				System.out.println("flopCard1: " + flopCard1);
//				System.out.println("flopCard2: " + flopCard2);
//				System.out.println("flopCard3: " + flopCard3);
//				System.out.println("riverCard: " + riverCard);
//				System.out.println("turnCard: " + turnCard);
//				System.out.println();
//				
//				System.out.print("First card to get rid of: ");
//				String remove1 = scan.next();
//					
//				
//				while(!(remove1.equals("yourCard1") || remove1.equals("yourCard2") || remove1.equals("flopCard1") 
//						|| remove1.equals("flopCard2") || remove1.equals("flopCard3") || remove1.equals("riverCard") || remove1.equals("turnCard")))
//				{
//					System.out.print("That card is not in your hand, choose a card in your hand: ");
//					remove1 = scan.next();
//				}
//				switch(remove1)
//				{
//				case("yourCard1"):
//					cardRemove1 = 0;
//				
//					yourHand.remove(cardRemove1);
//				
//					System.out.print("Second card to get rid of: ");
//					remove2 = scan.next();
//					System.out.println();
//				
//					while(!(remove2.equals("yourCard1") || remove2.equals("yourCard2") || remove2.equals("flopCard1") 
//							|| remove2.equals("flopCard2") || remove2.equals("flopCard3") || remove2.equals("riverCard") || remove2.equals("turnCard")))
//					{
//						System.out.print("That card is not in your hand, choose a card in your hand: ");
//						remove2 = scan.next();
//					}
//					switch(remove2)
//					{
//					case("yourCard2"):
//						cardRemove2 = 0;
//					break;
//					
//					case("flopCard1"):
//						cardRemove2 = 1;
//					break;
//					
//					case("flopCard2"):
//						cardRemove2 = 2;
//					break;
//					
//					case("flopCard3"):
//						cardRemove2 = 3;
//					break;
//					
//					case("riverCard"):
//						cardRemove2 = 4;
//					break;
//					
//					case("turnCard"):
//						cardRemove2 = 5;
//					break;
//					}
//					
//				break;
//				
//				case("yourCard2"):
//					cardRemove1 = 1;
//				
//				yourHand.remove(cardRemove1);
//				
//				System.out.print("Second card to get rid of: ");
//				remove2 = scan.next();
//				System.out.println();
//			
//				while(!(remove2.equals("yourCard1") || remove2.equals("yourCard2") || remove2.equals("flopCard1") 
//						|| remove2.equals("flopCard2") || remove2.equals("flopCard3") || remove2.equals("riverCard") || remove2.equals("turnCard")))
//				{
//					System.out.print("That card is not in your hand, choose a card in your hand: ");
//					remove2 = scan.next();
//				}
//				switch(remove2)
//				{
//				case("yourCard1"):
//					cardRemove2 = 0;
//				break;
//				
//				case("flopCard1"):
//					cardRemove2 = 1;
//				break;
//				
//				case("flopCard2"):
//					cardRemove2 = 2;
//				break;
//				
//				case("flopCard3"):
//					cardRemove2 = 3;
//				break;
//				
//				case("riverCard"):
//					cardRemove2 = 4;
//				break;
//				
//				case("turnCard"):
//					cardRemove2 = 5;
//				break;
//				}
//				
//				break;
//				
//				case("flopCard1"):
//					cardRemove1 = 2;
//				
//				yourHand.remove(cardRemove1);
//				
//				System.out.print("Second card to get rid of: ");
//				remove2 = scan.next();
//				System.out.println();
//			
//				while(!(remove2.equals("yourCard1") || remove2.equals("yourCard2") || remove2.equals("flopCard1") 
//						|| remove2.equals("flopCard2") || remove2.equals("flopCard3") || remove2.equals("riverCard") || remove2.equals("turnCard")))
//				{
//					System.out.print("That card is not in your hand, choose a card in your hand: ");
//					remove2 = scan.next();
//				}
//				switch(remove2)
//				{
//				case("yourCard1"):
//					cardRemove2 = 0;
//				break;
//				
//				case("yourCard2"):
//					cardRemove2 = 1;
//				break;
//				
//				case("flopCard2"):
//					cardRemove2 = 2;
//				break;
//				
//				case("flopCard3"):
//					cardRemove2 = 3;
//				break;
//				
//				case("riverCard"):
//					cardRemove2 = 4;
//				break;
//				
//				case("turnCard"):
//					cardRemove2 = 5;
//				break;
//				}
//				
//				break;
//				
//				case("flopCard2"):
//					cardRemove1 = 3;
//				
//				yourHand.remove(cardRemove1);
//				
//				System.out.print("Second card to get rid of: ");
//				remove2 = scan.next();
//				System.out.println();
//			
//				while(!(remove2.equals("yourCard1") || remove2.equals("yourCard2") || remove2.equals("flopCard1") 
//						|| remove2.equals("flopCard2") || remove2.equals("flopCard3") || remove2.equals("riverCard") || remove2.equals("turnCard")))
//				{
//					System.out.print("That card is not in your hand, choose a card in your hand: ");
//					remove2 = scan.next();
//				}
//				switch(remove2)
//				{
//				case("yourCard1"):
//					cardRemove2 = 0;
//				break;
//				
//				case("yourCard2"):
//					cardRemove2 = 1;
//				break;
//				
//				case("flopCard1"):
//					cardRemove2 = 2;
//				break;
//				
//				case("flopCard3"):
//					cardRemove2 = 3;
//				break;
//				
//				case("riverCard"):
//					cardRemove2 = 4;
//				break;
//				
//				case("turnCard"):
//					cardRemove2 = 5;
//				break;
//				}
//				
//				break;
//				
//				case("flopCard3"):
//					cardRemove1 = 4;
//				
//				yourHand.remove(cardRemove1);
//				
//				System.out.print("Second card to get rid of: ");
//				remove2 = scan.next();
//				System.out.println();
//			
//				while(!(remove2.equals("yourCard1") || remove2.equals("yourCard2") || remove2.equals("flopCard1") 
//						|| remove2.equals("flopCard2") || remove2.equals("flopCard3") || remove2.equals("riverCard") || remove2.equals("turnCard")))
//				{
//					System.out.print("That card is not in your hand, choose a card in your hand: ");
//					remove2 = scan.next();
//				}
//				switch(remove2)
//				{
//				case("yourCard1"):
//					cardRemove2 = 0;
//				break;
//				
//				case("yourCard2"):
//					cardRemove2 = 1;
//				break;
//				
//				case("flopCard1"):
//					cardRemove2 = 2;
//				break;
//				
//				case("flopCard2"):
//					cardRemove2 = 3;
//				break;
//				
//				case("riverCard"):
//					cardRemove2 = 4;
//				break;
//				
//				case("turnCard"):
//					cardRemove2 = 5;
//				break;
//				}
//				
//				break;
//				
//				case("riverCard"):
//					cardRemove1 = 5;
//				
//				yourHand.remove(cardRemove1);
//				
//				System.out.print("Second card to get rid of: ");
//				remove2 = scan.next();
//				System.out.println();
//			
//				while(!(remove2.equals("yourCard1") || remove2.equals("yourCard2") || remove2.equals("flopCard1") 
//						|| remove2.equals("flopCard2") || remove2.equals("flopCard3") || remove2.equals("riverCard") || remove2.equals("turnCard")))
//				{
//					System.out.print("That card is not in your hand, choose a card in your hand: ");
//					remove2 = scan.next();
//				}
//				switch(remove2)
//				{
//				case("yourCard1"):
//					cardRemove2 = 0;
//				break;
//				
//				case("yourCard2"):
//					cardRemove2 = 1;
//				break;
//				
//				case("flopCard1"):
//					cardRemove2 = 2;
//				break;
//				
//				case("flopCard2"):
//					cardRemove2 = 3;
//				break;
//				
//				case("flopCard3"):
//					cardRemove2 = 4;
//				break;
//				
//				case("turnCard"):
//					cardRemove2 = 5;
//				break;
//				}
//				
//				break;
//				
//				case("turnCard"):
//					cardRemove1 = 6;
//				
//				yourHand.remove(cardRemove1);
//				
//				System.out.print("Second card to get rid of: ");
//				remove2 = scan.next();
//				System.out.println();
//			
//				while(!(remove2.equals("yourCard1") || remove2.equals("yourCard2") || remove2.equals("flopCard1") 
//						|| remove2.equals("flopCard2") || remove2.equals("flopCard3") || remove2.equals("riverCard") || remove2.equals("turnCard")))
//				{
//					System.out.print("That card is not in your hand, choose a card in your hand: ");
//					remove2 = scan.next();
//				}
//				switch(remove2)
//				{
//				case("yourCard1"):
//					cardRemove2 = 0;
//				break;
//				
//				case("yourCard2"):
//					cardRemove2 = 1;
//				break;
//				
//				case("flopCard1"):
//					cardRemove2 = 2;
//				break;
//				
//				case("flopCard2"):
//					cardRemove2 = 3;
//				break;
//				
//				case("flopCard3"):
//					cardRemove2 = 4;
//				break;
//				
//				case("riveCard"):
//					cardRemove2 = 5;
//				break;
//				}
//				
//				break;
//				
//				}
//				yourHand.remove(cardRemove2);
//				
//				System.out.println("Here's your final hand: ");
//				for(Card c: yourHand)
//				{
//					System.out.println(c);
//				}
//				System.out.println();
//				
//				for(int i = 0; i < 2; i++)
//				{
//					enemyHand.remove(rand.nextInt(enemyHand.size()));
//				}
//				
//				//Collections.sort(yourHand, null);
//				//System.out.println(yourHand);
//				
//				
//				Card first = yourHand.get(0);
//				int yourSuit1 = first.charAt(first.size() - 1);
//				Card enemyFirst = enemyHand.get(0);
//				int enemySuit1 = enemyFirst.charAt(enemyFirst.size() - 1);
//				
//				Card second = yourHand.get(1);
//				int yourSuit2 = second.charAt(second.size()-1);
//				Card enemySecond = enemyHand.get(1);
//				int enemySuit2 = enemySecond.charAt(enemySecond.size() - 1);
//				
//				Card third = yourHand.get(2);
//				int yourSuit3 = third.charAt(third.size()-1);
//				Card enemyThird = enemyHand.get(2);
//				int enemySuit3 = enemyThird.charAt(enemyThird.size() - 1);
//				
//				Card fourth = yourHand.get(3);
//				int yourSuit4 = fourth.charAt(fourth.size()-1);
//				Card enemyFourth = enemyHand.get(3);
//				int enemySuit4 = enemyFourth.charAt(enemyFourth.size() - 1);
//				
//				Card fifth = yourHand.get(4);
//				int yourSuit5 = fifth.charAt(fifth.size()-1);
//				Card enemyFifth = enemyHand.get(4);
//				int enemySuit5 = enemyFifth.charAt(enemyFifth.size() - 1);
//				
//				for(Card c: yourHand)
//				{
//					if(c.getCardValue() == 65)
//					{
//						aces.add(c);
//					}
//					if(c.getCardValue() == 50)
//					{
//						twos.add(c);
//					}
//					if(c.getCardValue() == 51)
//					{
//						threes.add(c);
//					}
//					if(c.getCardValue() == 52)
//					{
//						fours.add(c);
//					}
//					if(c.getCardValue() == 53)
//					{
//						fives.add(c);
//					}
//					if(c.getCardValue() == 54)
//					{
//						sixes.add(c);
//					}
//					if(c.getCardValue() == 55)
//					{
//						sevens.add(c);
//					}
//					if(c.getCardValue() == 56)
//					{
//						eights.add(c);
//					}
//					if(c.getCardValue() == 57)
//					{
//						nines.add(c);
//					}
//					if(c.getCardValue() == 49)
//					{
//						tens.add(c);
//					}
//					if(c.getCardValue() == 74)
//					{
//						jacks.add(c);
//					}
//					if(c.getCardValue() == 81)
//					{
//						queens.add(c);
//					}
//					if(c.getCardValue() == 75)
//					{
//						kings.add(c);
//					}
//					
//					if(c.charAt(c.size() - 1) == 116)
//					{
//						hearts.add(c);
//					}
//					if(c.charAt(c.size() - 1) == 101)
//					{
//						spades.add(c);
//					}
//					if(c.charAt(c.size() - 1) == 100)
//					{
//						diamonds.add(c);
//					}
//					if(c.charAt(c.size() - 1) == 98)
//					{
//						clubs.add(c);
//					}
//				}
//				
//					allNumbers.add(aces);
//					allNumbers.add(twos);
//					allNumbers.add(threes);
//					allNumbers.add(fours);
//					allNumbers.add(fives);
//					allNumbers.add(sixes);
//					allNumbers.add(sevens);
//					allNumbers.add(eights);
//					allNumbers.add(nines);
//					allNumbers.add(tens);
//					allNumbers.add(jacks);
//					allNumbers.add(queens);
//					allNumbers.add(kings);
//					
//				
//				for(ArrayList<Card> a: allNumbers)
//				{
//					if(a.size() == 2)
//					{
//						pair.add(a);
//					}
//					if(a.size() == 3)
//					{
//						trips.add(a);
//					}
//					if(a.size() == 4) 
//					{
//						quads.add(a);
//					}
//				}
//				
//				for(Card c: enemyHand)
//				{
//					if(c.getCardValue() == 65)
//					{
//						enemyAces.add(c);
//					}
//					if(c.getCardValue() == 50)
//					{
//						enemyTwos.add(c);
//					}
//					if(c.getCardValue() == 51)
//					{
//						enemyThrees.add(c);
//					}
//					if(c.getCardValue() == 52)
//					{
//						enemyFours.add(c);
//					}
//					if(c.getCardValue() == 53)
//					{
//						enemyFives.add(c);
//					}
//					if(c.getCardValue() == 54)
//					{
//						enemySixes.add(c);
//					}
//					if(c.getCardValue() == 55)
//					{
//						enemySevens.add(c);
//					}
//					if(c.getCardValue() == 56)
//					{
//						enemyEights.add(c);
//					}
//					if(c.getCardValue() == 57)
//					{
//						enemyNines.add(c);
//					}
//					if(c.getCardValue() == 49)
//					{
//						enemyTens.add(c);
//					}
//					if(c.getCardValue() == 74)
//					{
//						enemyJacks.add(c);
//					}
//					if(c.getCardValue() == 81)
//					{
//						enemyQueens.add(c);
//					}
//					if(c.getCardValue() == 75)
//					{
//						enemyKings.add(c);
//					}
//					
//					if(c.charAt(c.size() - 1) == 116)
//					{
//						enemyHearts.add(c);
//					}
//					if(c.charAt(c.size() - 1) == 101)
//					{
//						enemySpades.add(c);
//					}
//					if(c.charAt(c.size() - 1) == 100)
//					{
//						enemyDiamonds.add(c);
//					}
//					if(c.charAt(c.size() - 1) == 98)
//					{
//						enemyClubs.add(c);
//					}
//				}
//				
//					enemyAllNumbers.add(enemyAces);
//					enemyAllNumbers.add(enemyTwos);
//					enemyAllNumbers.add(enemyThrees);
//					enemyAllNumbers.add(enemyFours);
//					enemyAllNumbers.add(enemyFives);
//					enemyAllNumbers.add(enemySixes);
//					enemyAllNumbers.add(enemySevens);
//					enemyAllNumbers.add(enemyEights);
//					enemyAllNumbers.add(enemyNines);
//					enemyAllNumbers.add(enemyTens);
//					enemyAllNumbers.add(enemyJacks);
//					enemyAllNumbers.add(enemyQueens);
//					enemyAllNumbers.add(enemyKings);
//					
//				
//				for(ArrayList<Card> a: enemyAllNumbers)
//				{
//					if(a.size() == 2)
//					{
//						enemyPair.add(a);
//					}
//					if(a.size() == 3)
//					{
//						enemyTrips.add(a);
//					}
//					if(a.size() == 4) 
//					{
//						enemyQuads.add(a);
//					}
//				}
//
//				
//				//Your Hands
//				
//				//Royal Flush Done
//				if(yourSuit1 == yourSuit2 && yourSuit1 == yourSuit3 && yourSuit1 == yourSuit4 && yourSuit1 == yourSuit5)
//				{
//					if(tens.size() == 1 && jacks.size() == 1 && queens.size() == 1 &&kings.size() == 1 && aces.size() == 1)
//					{
//						System.out.println("NO FRAKING WAY! YOU JUST GOT A ROYAL FLUSH!");
//						score = 10;
//						straight = true;
//					}
//				}
//				
//				
//				//Straight Flush Done
//				if(yourSuit1 == yourSuit2 && yourSuit1 == yourSuit3 && yourSuit1 == yourSuit4 && yourSuit1 == yourSuit5)
//				{
//					if(aces.size() == 1 && twos.size() == 1 && threes.size() == 1 &&fours.size() == 1 && fives.size() == 1)
//					{
//						System.out.println("WOW! Nice Straight Flush!");
//						score = 9;
//						straight = true;
//					}
//					if(twos.size() == 1 && threes.size() == 1 && fours.size() == 1 && fives.size() == 1 && sixes.size() == 1)
//					{
//						System.out.println("WOW! Nice Straight Flush!");
//						score = 9;
//						straight = true;
//					}
//					if(threes.size() == 1 && fours.size() == 1 && fives.size() == 1 && sixes.size() == 1 && sevens.size() == 1)
//					{
//						System.out.println("WOW! Nice Straight Flush!");
//						score = 9;
//						straight = true;
//					}
//					if(fours.size() == 1 && fives.size() == 1 && sixes.size() == 1 && sevens.size() == 1 && eights.size() == 1)
//					{
//						System.out.println("WOW! Nice Straight Flush!");
//						score = 9;
//						straight = true;
//					}
//					if(fives.size() == 1 && sixes.size() == 1 && sevens.size() == 1 && eights.size() == 1 && nines.size() == 1)
//					{
//						System.out.println("WOW! Nice Straight Flush!");
//						score = 9;
//						straight = true;
//					}
//					if(sixes.size() == 1 && sevens.size() == 1 && eights.size() == 1 && nines.size() == 1 && tens.size() == 1)
//					{
//						System.out.println("WOW! Nice Straight Flush!");
//						score = 9;
//						straight = true;
//					}
//					if(sevens.size() == 1 && eights.size() == 1 && nines.size() == 1 && tens.size() == 1 && jacks.size() == 1)
//					{
//						System.out.println("WOW! Nice Straight Flush!");
//						score = 9;
//						straight = true;
//					}
//					if(eights.size() == 1 && nines.size() == 1 && tens.size() == 1 && jacks.size() == 1 && queens.size() == 1)
//					{
//						System.out.println("WOW! Nice Straight Flush!");
//						score = 9;
//						straight = true;
//					}
//					if(nines.size() == 1 && tens.size() == 1 && jacks.size() == 1 && queens.size() == 1 && kings.size() == 1)
//					{
//						System.out.println("WOW! Nice Straight Flush!");
//						score = 9;
//						straight = true;
//					}
//				}
//				
//				
//				//Four of a Kind Done
//				if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
//				{
//					if(quads.size() == 1)
//					{
//						System.out.println("Dang! That Four of a Kind looks really good!");
//						score = 8;
//					}
//
//				}
//				
//				
//				//Full House Done
//				if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
//				{
//					if(trips.size() == 1 && pair.size() == 1)
//					{
//						System.out.println("Nice Job, you got a Full House!");
//						score = 7;
//					}
//
//				}
//				
//				
//				//Flush Done
//				if(yourSuit1 == yourSuit2 && yourSuit1 == yourSuit3 && yourSuit1 == yourSuit4 && yourSuit1 == yourSuit5)
//				{
//					System.out.println("Not bad, you got a Flush");
//					score = 6;
//				}
//				
//				
//				//Straight Done
//				if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
//				{
//					if(aces.size() == 1 && twos.size() == 1 && threes.size() == 1 &&fours.size() == 1 && fives.size() == 1)
//					{
//						System.out.println("You got a Straight, it's alright");
//						score = 5;
//						straight = true;
//					}
//					if(twos.size() == 1 && threes.size() == 1 && fours.size() == 1 && fives.size() == 1 && sixes.size() == 1)
//					{
//						System.out.println("You got a Straight, it's alright");
//						score = 5;
//						straight = true;
//					}
//					if(threes.size() == 1 && fours.size() == 1 && fives.size() == 1 && sixes.size() == 1 && sevens.size() == 1)
//					{
//						System.out.println("You got a Straight, it's alright");
//						score = 5;
//						straight = true;
//					}
//					if(fours.size() == 1 && fives.size() == 1 && sixes.size() == 1 && sevens.size() == 1 && eights.size() == 1)
//					{
//						System.out.println("You got a Straight, it's alright");
//						score = 5;
//						straight = true;
//					}
//					if(fives.size() == 1 && sixes.size() == 1 && sevens.size() == 1 && eights.size() == 1 && nines.size() == 1)
//					{
//						System.out.println("You got a Straight, it's alright");
//						score = 5;
//						straight = true;
//					}
//					if(sixes.size() == 1 && sevens.size() == 1 && eights.size() == 1 && nines.size() == 1 && tens.size() == 1)
//					{
//						System.out.println("You got a Straight, it's alright");
//						score = 5;
//						straight = true;
//					}
//					if(sevens.size() == 1 && eights.size() == 1 && nines.size() == 1 && tens.size() == 1 && jacks.size() == 1)
//					{
//						System.out.println("You got a Straight, it's alright");
//						score = 5;
//						straight = true;
//					}
//					if(eights.size() == 1 && nines.size() == 1 && tens.size() == 1 && jacks.size() == 1 && queens.size() == 1)
//					{
//						System.out.println("You got a Straight, it's alright");
//						score = 5;
//						straight = true;
//					}
//					if(nines.size() == 1 && tens.size() == 1 && jacks.size() == 1 && queens.size() == 1 && kings.size() == 1)
//					{
//						System.out.println("You got a Straight, it's alright");
//						score = 5;
//						straight = true;
//					}
//					if(tens.size() == 1 && jacks.size() == 1 && queens.size() == 1 && kings.size() == 1 && aces.size() == 1)
//					{
//						System.out.println("You got a Straight, it's alright");
//						score = 5;
//						straight = true;
//					}
//				}		
//				
//				//Three of a Kind Done
//				if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
//				{
//					if(trips.size() == 1 && pair.size() != 1)
//					{
//						System.out.println("Nice Trips you got there");
//						score = 4;
//					}
//
//				}
//				
//				
//				//Two Pair Done
//				if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
//				{
//					if(pair.size() == 2)
//					{
//						System.out.println("Two Pair, not terrible");
//						score = 3;
//					}
//
//				}
//				
//				
//				//Pair Done
//				if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
//				{
//					if(pair.size() == 1 && trips.size() != 1)
//					{
//						System.out.println("It's not a lot but a Pair is better than nothing");
//						score = 2;
//					}
//
//				}
//				
//				
//				//High Card Done
//				if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
//				{
//					if(aces.size() <= 1 && twos.size() <= 1 && threes.size() <= 1 && fours.size() <= 1 && fives.size() <= 1 && sixes.size() <= 1 && 
//							sevens.size() <= 1 && eights.size() <= 1 && nines.size() <= 1 && tens.size() <= 1 && jacks.size() <= 1 && queens.size() <= 1 && kings.size() <= 1)
//					{
//						if(straight == false)
//						{
//							System.out.println("Yikes! You've got nothing!");
//							score = 1;
//						}
//					}
//				}
//				
//				//Enemy Hands
//				
//				//Royal Flush Done
//				if(enemySuit1 == enemySuit2 && enemySuit1 == enemySuit3 && enemySuit1 == enemySuit4 && enemySuit1 == enemySuit5)
//				{
//					if(enemyTens.size() == 1 && enemyJacks.size() == 1 && enemyQueens.size() == 1 && enemyKings.size() == 1 && enemyAces.size() == 1)
//					{
//						enemyScore = 10;
//						enemyStraight = true;
//					}
//				}
//				
//				
//				//Straight Flush Done
//				if(enemySuit1 == enemySuit2 && enemySuit1 == enemySuit3 && enemySuit1 == enemySuit4 && enemySuit1 == enemySuit5)
//				{
//					if(enemyAces.size() == 1 && enemyTwos.size() == 1 && enemyThrees.size() == 1 && enemyFours.size() == 1 && enemyFives.size() == 1)
//					{
//						enemyScore = 9;
//						enemyStraight = true;
//					}
//					if(enemyTwos.size() == 1 && enemyThrees.size() == 1 && enemyFours.size() == 1 && enemyFives.size() == 1 && enemySixes.size() == 1)
//					{
//						enemyScore = 9;
//						enemyStraight = true;
//					}
//					if(enemyThrees.size() == 1 && enemyFours.size() == 1 && enemyFives.size() == 1 && enemySixes.size() == 1 && enemySevens.size() == 1)
//					{
//						enemyScore = 9;
//						enemyStraight = true;
//					}
//					if(enemyFours.size() == 1 && enemyFives.size() == 1 && enemySixes.size() == 1 && enemySevens.size() == 1 && enemyEights.size() == 1)
//					{
//						enemyScore = 9;
//						enemyStraight = true;
//					}
//					if(enemyFives.size() == 1 && enemySixes.size() == 1 && enemySevens.size() == 1 && enemyEights.size() == 1 && enemyNines.size() == 1)
//					{
//						enemyScore = 9;
//						enemyStraight = true;
//					}
//					if(enemySixes.size() == 1 && enemySevens.size() == 1 && enemyEights.size() == 1 && enemyNines.size() == 1 && enemyTens.size() == 1)
//					{
//						enemyScore = 9;
//						enemyStraight = true;
//					}
//					if(enemySevens.size() == 1 && enemyEights.size() == 1 && enemyNines.size() == 1 && enemyTens.size() == 1 && enemyJacks.size() == 1)
//					{
//						enemyScore = 9;
//						enemyStraight = true;
//					}
//					if(enemyEights.size() == 1 && enemyNines.size() == 1 && enemyTens.size() == 1 && enemyJacks.size() == 1 && enemyQueens.size() == 1)
//					{
//						enemyScore = 9;
//						enemyStraight = true;
//					}
//					if(enemyNines.size() == 1 && enemyTens.size() == 1 && enemyJacks.size() == 1 && enemyQueens.size() == 1 && enemyKings.size() == 1)
//					{
//						enemyScore = 9;
//						enemyStraight = true;
//					}
//				}
//				
//				
//				//Four of a Kind Done
//				if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
//				{
//					if(enemyQuads.size() == 1)
//					{
//						enemyScore = 8;
//					}
//
//				}
//				
//				
//				//Full House Done
//				if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
//				{
//					if(enemyTrips.size() == 1 && enemyPair.size() == 1)
//					{
//						enemyScore = 7;
//					}
//
//				}
//				
//				
//				//Flush Done
//				if(enemySuit1 == enemySuit2 && enemySuit1 == enemySuit3 && enemySuit1 == enemySuit4 && enemySuit1 == enemySuit5)
//				{
//					enemyScore = 6;
//				}
//				
//				
//				//Straight Done
//				if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
//				{
//					if(enemyAces.size() == 1 && enemyTwos.size() == 1 && enemyThrees.size() == 1 && enemyFours.size() == 1 && enemyFives.size() == 1)
//					{
//						enemyScore = 5;
//						enemyStraight = true;
//					}
//					if(enemyTwos.size() == 1 && enemyThrees.size() == 1 && enemyFours.size() == 1 && enemyFives.size() == 1 && enemySixes.size() == 1)
//					{
//						enemyScore = 5;
//						enemyStraight = true;
//					}
//					if(enemyThrees.size() == 1 && enemyFours.size() == 1 && enemyFives.size() == 1 && enemySixes.size() == 1 && enemySevens.size() == 1)
//					{
//						enemyScore = 5;
//						enemyStraight = true;
//					}
//					if(enemyFours.size() == 1 && enemyFives.size() == 1 && enemySixes.size() == 1 && enemySevens.size() == 1 && enemyEights.size() == 1)
//					{
//						enemyScore = 5;
//						enemyStraight = true;
//					}
//					if(enemyFives.size() == 1 && enemySixes.size() == 1 && enemySevens.size() == 1 && enemyEights.size() == 1 && enemyNines.size() == 1)
//					{
//						enemyScore = 5;
//						enemyStraight = true;
//					}
//					if(enemySixes.size() == 1 && enemySevens.size() == 1 && enemyEights.size() == 1 && enemyNines.size() == 1 && enemyTens.size() == 1)
//					{
//						enemyScore = 5;
//						enemyStraight = true;
//					}
//					if(enemySevens.size() == 1 && enemyEights.size() == 1 && enemyNines.size() == 1 && enemyTens.size() == 1 && enemyJacks.size() == 1)
//					{
//						enemyScore = 5;
//						enemyStraight = true;
//					}
//					if(enemyEights.size() == 1 && enemyNines.size() == 1 && enemyTens.size() == 1 && enemyJacks.size() == 1 && enemyQueens.size() == 1)
//					{
//						enemyScore = 5;
//						enemyStraight = true;
//					}
//					if(enemyNines.size() == 1 && enemyTens.size() == 1 && enemyJacks.size() == 1 && enemyQueens.size() == 1 && enemyKings.size() == 1)
//					{
//						enemyScore = 5;
//						enemyStraight = true;
//					}
//					if(enemyTens.size() == 1 && enemyJacks.size() == 1 && enemyQueens.size() == 1 && enemyKings.size() == 1 && enemyAces.size() == 1)
//					{
//						enemyScore = 5;
//						enemyStraight = true;
//					}
//				}		
//				
//				//Three of a Kind Done
//				if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
//				{
//					if(enemyTrips.size() == 1 && enemyPair.size() != 1)
//					{
//						enemyScore = 4;
//					}
//
//				}
//				
//				
//				//Two Pair Done
//				if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
//				{
//					if(enemyPair.size() == 2)
//					{
//						enemyScore = 3;
//					}
//
//				}
//				
//				
//				//Pair Done
//				if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
//				{
//					if(enemyPair.size() == 1 && enemyTrips.size() != 1)
//					{
//						enemyScore = 2;
//					}
//
//				}
//				
//				
//				//High Card Done
//				if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
//				{
//					if(enemyAces.size() <= 1 && enemyTwos.size() <= 1 && enemyThrees.size() <= 1 && enemyFours.size() <= 1 && enemyFives.size() <= 1 && enemySixes.size() <= 1 && 
//							enemySevens.size() <= 1 && enemyEights.size() <= 1 && enemyNines.size() <= 1 && enemyTens.size() <= 1 && enemyJacks.size() <= 1 && enemyQueens.size() <= 1 && enemyKings.size() <= 1)
//					{
//						if(enemyStraight == false)
//						{
//							enemyScore = 1;
//						}
//					}
//				}
//				
//				System.out.println();
//				System.out.print("Time to face your opponent! (press s to show your hand): ");
//				String show = scan.next();
//				
//				while(!show.equalsIgnoreCase("s"))
//				{
//					System.out.print("Press s to Show your hand: ");
//					show = scan.next();
//				}
//				
//				System.out.println();
//				System.out.println("Your Hand: " + yourHand);
//				System.out.println("Your Score: " + score);
//				System.out.println();
//				System.out.println("Opponent's Hand: " + enemyHand);
//				System.out.println("Opponents Score: " + enemyScore);
//				System.out.println();
//				
//				if(score > enemyScore)
//				{
//					System.out.println("Congratulations! You won this hand!");
//				}
//				else if(score < enemyScore)
//				{
//					System.out.println("I'm sure you'll win the next one...");
//				}
//				else
//				{
//					System.out.println("I'm not paid enough to deal with tiebreakers. You should play another hand to settle this.");
//				}
//				
//				System.out.print("Would you like to play another hand? (y or n): ");
//				play = scan.next();
//				play.toLowerCase();
//				while(!(play.equalsIgnoreCase("y") || play.equalsIgnoreCase("n")))
//				{
//					System.out.print("Press y or n: ");
//					play = scan.next();
//					play.toLowerCase();
//				}
//				
//				break;
//				
//				default:
//					System.out.print("Press d to deal: ");
//					deal = scan.next();
//					deal.toLowerCase();
//					break;
//			}
//		}
//		scan.close();
//		System.out.println("Thanks for playing! See you next time!");
//		
//		
//	}
	
	public void shuffleAndDeal()
	{
		yourHand.clear();
		enemyHand.clear();
		deckOfCards.clear();
		score = 0;
		enemyScore = 0;
		aces.clear();
		enemyAces.clear();
		twos.clear();
		enemyTwos.clear();
		threes.clear();
		enemyThrees.clear();
		fours.clear();
		enemyFours.clear();
		fives.clear();
		enemyFives.clear();
		sixes.clear();
		enemySixes.clear();
		sevens.clear();
		enemySevens.clear();
		eights.clear();
		enemyEights.clear();
		nines.clear();
		enemyNines.clear();
		tens.clear();
		enemyTens.clear();
		jacks.clear();
		enemyJacks.clear();
		queens.clear();
		enemyQueens.clear();
		kings.clear();
		enemyKings.clear();
		hearts.clear();
		enemyHearts.clear();
		diamonds.clear();
		enemyDiamonds.clear();
		clubs.clear();
		enemyClubs.clear();
		spades.clear();
		enemySpades.clear();
		allNumbers.clear();
		enemyAllNumbers.clear();
		pair.clear();
		enemyPair.clear();
		trips.clear();
		enemyTrips.clear();
		quads.clear();
		enemyQuads.clear();
		File deck = new File("cards");
		if(deck.isFile() && deck.exists())
		{
			try
			{
				Scanner deckScan = new Scanner(deck);
				while(deckScan.hasNextLine())
				{
					String line = deckScan.nextLine();
					Scanner cardScan = new Scanner(line);
					cardScan.useDelimiter(",");
					while (cardScan.hasNext())
					{
						newCard = cardScan.next();
						
						card = new Card(newCard);
						deckOfCards.add(card);
						
					}
					cardScan.close();
				}
				deckScan.close();
			}
			catch (FileNotFoundException e)
			{
			}
			System.out.println();
			System.out.println("Deck is shuffled!");
		}
		System.out.println();
		System.out.println("Here is your Hand: ");
		System.out.println();
		
		yourCard1 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
		deckOfCards.remove(yourCard1);
		enemyCard1 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
		deckOfCards.remove(enemyCard1);
		
		yourCard2 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
		deckOfCards.remove(yourCard2);
		enemyCard2 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
		deckOfCards.remove(enemyCard2);
		
		enemyHand.add(enemyCard1);
		enemyHand.add(enemyCard2);
	}
	
	public void dealFlop()
	{
		flopCard1 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
		deckOfCards.remove(flopCard1);
		flopCard2 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
		deckOfCards.remove(flopCard2);
		flopCard3 = deckOfCards.get(rand.nextInt(deckOfCards.size()));
		deckOfCards.remove(flopCard3);
		
		enemyHand.add(flopCard1);
		enemyHand.add(flopCard2);
		enemyHand.add(flopCard3);
	}
	
	public void dealRiver()
	{
		riverCard = deckOfCards.get(rand.nextInt(deckOfCards.size()));
		deckOfCards.remove(riverCard);
		
		enemyHand.add(riverCard);
	}
	
	public void dealTurn()
	{
		turnCard = deckOfCards.get(rand.nextInt(deckOfCards.size()));
		deckOfCards.remove(turnCard);
		
		enemyHand.add(turnCard);
		
		for(int i = 0; i < 2; i++)
		{
			enemyHand.remove(rand.nextInt(enemyHand.size()));
		}	
	}
	
	public int calculateScore()
	{	
		
		Card first = yourHand.get(0);
		int yourSuit1 = first.charAt(first.size() - 1);
		Card enemyFirst = enemyHand.get(0);
		int enemySuit1 = enemyFirst.charAt(enemyFirst.size() - 1);
		
		Card second = yourHand.get(1);
		int yourSuit2 = second.charAt(second.size()-1);
		Card enemySecond = enemyHand.get(1);
		int enemySuit2 = enemySecond.charAt(enemySecond.size() - 1);
		
		Card third = yourHand.get(2);
		int yourSuit3 = third.charAt(third.size()-1);
		Card enemyThird = enemyHand.get(2);
		int enemySuit3 = enemyThird.charAt(enemyThird.size() - 1);
		
		Card fourth = yourHand.get(3);
		int yourSuit4 = fourth.charAt(fourth.size()-1);
		Card enemyFourth = enemyHand.get(3);
		int enemySuit4 = enemyFourth.charAt(enemyFourth.size() - 1);
		
		Card fifth = yourHand.get(4);
		int yourSuit5 = fifth.charAt(fifth.size()-1);
		Card enemyFifth = enemyHand.get(4);
		int enemySuit5 = enemyFifth.charAt(enemyFifth.size() - 1);
		
		for(Card c: yourHand)
		{
			if(c.getCardValue() == 65)
			{
				aces.add(c);
			}
			if(c.getCardValue() == 50)
			{
				twos.add(c);
			}
			if(c.getCardValue() == 51)
			{
				threes.add(c);
			}
			if(c.getCardValue() == 52)
			{
				fours.add(c);
			}
			if(c.getCardValue() == 53)
			{
				fives.add(c);
			}
			if(c.getCardValue() == 54)
			{
				sixes.add(c);
			}
			if(c.getCardValue() == 55)
			{
				sevens.add(c);
			}
			if(c.getCardValue() == 56)
			{
				eights.add(c);
			}
			if(c.getCardValue() == 57)
			{
				nines.add(c);
			}
			if(c.getCardValue() == 49)
			{
				tens.add(c);
			}
			if(c.getCardValue() == 74)
			{
				jacks.add(c);
			}
			if(c.getCardValue() == 81)
			{
				queens.add(c);
			}
			if(c.getCardValue() == 75)
			{
				kings.add(c);
			}
			
			if(c.charAt(c.size() - 1) == 116)
			{
				hearts.add(c);
			}
			if(c.charAt(c.size() - 1) == 101)
			{
				spades.add(c);
			}
			if(c.charAt(c.size() - 1) == 100)
			{
				diamonds.add(c);
			}
			if(c.charAt(c.size() - 1) == 98)
			{
				clubs.add(c);
			}
		}
		
			allNumbers.add(aces);
			allNumbers.add(twos);
			allNumbers.add(threes);
			allNumbers.add(fours);
			allNumbers.add(fives);
			allNumbers.add(sixes);
			allNumbers.add(sevens);
			allNumbers.add(eights);
			allNumbers.add(nines);
			allNumbers.add(tens);
			allNumbers.add(jacks);
			allNumbers.add(queens);
			allNumbers.add(kings);
			
		
		for(ArrayList<Card> a: allNumbers)
		{
			if(a.size() == 2)
			{
				pair.add(a);
			}
			if(a.size() == 3)
			{
				trips.add(a);
			}
			if(a.size() == 4) 
			{
				quads.add(a);
			}
		}
		
		for(Card c: enemyHand)
		{
			if(c.getCardValue() == 65)
			{
				enemyAces.add(c);
			}
			if(c.getCardValue() == 50)
			{
				enemyTwos.add(c);
			}
			if(c.getCardValue() == 51)
			{
				enemyThrees.add(c);
			}
			if(c.getCardValue() == 52)
			{
				enemyFours.add(c);
			}
			if(c.getCardValue() == 53)
			{
				enemyFives.add(c);
			}
			if(c.getCardValue() == 54)
			{
				enemySixes.add(c);
			}
			if(c.getCardValue() == 55)
			{
				enemySevens.add(c);
			}
			if(c.getCardValue() == 56)
			{
				enemyEights.add(c);
			}
			if(c.getCardValue() == 57)
			{
				enemyNines.add(c);
			}
			if(c.getCardValue() == 49)
			{
				enemyTens.add(c);
			}
			if(c.getCardValue() == 74)
			{
				enemyJacks.add(c);
			}
			if(c.getCardValue() == 81)
			{
				enemyQueens.add(c);
			}
			if(c.getCardValue() == 75)
			{
				enemyKings.add(c);
			}
			
			if(c.charAt(c.size() - 1) == 116)
			{
				enemyHearts.add(c);
			}
			if(c.charAt(c.size() - 1) == 101)
			{
				enemySpades.add(c);
			}
			if(c.charAt(c.size() - 1) == 100)
			{
				enemyDiamonds.add(c);
			}
			if(c.charAt(c.size() - 1) == 98)
			{
				enemyClubs.add(c);
			}
		}
		
			enemyAllNumbers.add(enemyAces);
			enemyAllNumbers.add(enemyTwos);
			enemyAllNumbers.add(enemyThrees);
			enemyAllNumbers.add(enemyFours);
			enemyAllNumbers.add(enemyFives);
			enemyAllNumbers.add(enemySixes);
			enemyAllNumbers.add(enemySevens);
			enemyAllNumbers.add(enemyEights);
			enemyAllNumbers.add(enemyNines);
			enemyAllNumbers.add(enemyTens);
			enemyAllNumbers.add(enemyJacks);
			enemyAllNumbers.add(enemyQueens);
			enemyAllNumbers.add(enemyKings);
			
		
		for(ArrayList<Card> a: enemyAllNumbers)
		{
			if(a.size() == 2)
			{
				enemyPair.add(a);
			}
			if(a.size() == 3)
			{
				enemyTrips.add(a);
			}
			if(a.size() == 4) 
			{
				enemyQuads.add(a);
			}
		}

		
		//Your Hands
		
		//Royal Flush Done
		if(yourSuit1 == yourSuit2 && yourSuit1 == yourSuit3 && yourSuit1 == yourSuit4 && yourSuit1 == yourSuit5)
		{
			if(tens.size() == 1 && jacks.size() == 1 && queens.size() == 1 &&kings.size() == 1 && aces.size() == 1)
			{
				System.out.println("NO FRAKING WAY! YOU JUST GOT A ROYAL FLUSH!");
				score = 10;
				straight = true;
			}
		}
		
		
		//Straight Flush Done
		if(yourSuit1 == yourSuit2 && yourSuit1 == yourSuit3 && yourSuit1 == yourSuit4 && yourSuit1 == yourSuit5)
		{
			if(aces.size() == 1 && twos.size() == 1 && threes.size() == 1 &&fours.size() == 1 && fives.size() == 1)
			{
				System.out.println("WOW! Nice Straight Flush!");
				score = 9;
				straight = true;
			}
			if(twos.size() == 1 && threes.size() == 1 && fours.size() == 1 && fives.size() == 1 && sixes.size() == 1)
			{
				System.out.println("WOW! Nice Straight Flush!");
				score = 9;
				straight = true;
			}
			if(threes.size() == 1 && fours.size() == 1 && fives.size() == 1 && sixes.size() == 1 && sevens.size() == 1)
			{
				System.out.println("WOW! Nice Straight Flush!");
				score = 9;
				straight = true;
			}
			if(fours.size() == 1 && fives.size() == 1 && sixes.size() == 1 && sevens.size() == 1 && eights.size() == 1)
			{
				System.out.println("WOW! Nice Straight Flush!");
				score = 9;
				straight = true;
			}
			if(fives.size() == 1 && sixes.size() == 1 && sevens.size() == 1 && eights.size() == 1 && nines.size() == 1)
			{
				System.out.println("WOW! Nice Straight Flush!");
				score = 9;
				straight = true;
			}
			if(sixes.size() == 1 && sevens.size() == 1 && eights.size() == 1 && nines.size() == 1 && tens.size() == 1)
			{
				System.out.println("WOW! Nice Straight Flush!");
				score = 9;
				straight = true;
			}
			if(sevens.size() == 1 && eights.size() == 1 && nines.size() == 1 && tens.size() == 1 && jacks.size() == 1)
			{
				System.out.println("WOW! Nice Straight Flush!");
				score = 9;
				straight = true;
			}
			if(eights.size() == 1 && nines.size() == 1 && tens.size() == 1 && jacks.size() == 1 && queens.size() == 1)
			{
				System.out.println("WOW! Nice Straight Flush!");
				score = 9;
				straight = true;
			}
			if(nines.size() == 1 && tens.size() == 1 && jacks.size() == 1 && queens.size() == 1 && kings.size() == 1)
			{
				System.out.println("WOW! Nice Straight Flush!");
				score = 9;
				straight = true;
			}
		}
		
		
		//Four of a Kind Done
		if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
		{
			if(quads.size() == 1)
			{
				System.out.println("Dang! That Four of a Kind looks really good!");
				score = 8;
			}

		}
		
		
		//Full House Done
		if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
		{
			if(trips.size() == 1 && pair.size() == 1)
			{
				System.out.println("Nice Job, you got a Full House!");
				score = 7;
			}

		}
		
		
		//Flush Done
		if(yourSuit1 == yourSuit2 && yourSuit1 == yourSuit3 && yourSuit1 == yourSuit4 && yourSuit1 == yourSuit5)
		{
			System.out.println("Not bad, you got a Flush");
			score = 6;
		}
		
		
		//Straight Done
		if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
		{
			if(aces.size() == 1 && twos.size() == 1 && threes.size() == 1 &&fours.size() == 1 && fives.size() == 1)
			{
				System.out.println("You got a Straight, it's alright");
				score = 5;
				straight = true;
			}
			if(twos.size() == 1 && threes.size() == 1 && fours.size() == 1 && fives.size() == 1 && sixes.size() == 1)
			{
				System.out.println("You got a Straight, it's alright");
				score = 5;
				straight = true;
			}
			if(threes.size() == 1 && fours.size() == 1 && fives.size() == 1 && sixes.size() == 1 && sevens.size() == 1)
			{
				System.out.println("You got a Straight, it's alright");
				score = 5;
				straight = true;
			}
			if(fours.size() == 1 && fives.size() == 1 && sixes.size() == 1 && sevens.size() == 1 && eights.size() == 1)
			{
				System.out.println("You got a Straight, it's alright");
				score = 5;
				straight = true;
			}
			if(fives.size() == 1 && sixes.size() == 1 && sevens.size() == 1 && eights.size() == 1 && nines.size() == 1)
			{
				System.out.println("You got a Straight, it's alright");
				score = 5;
				straight = true;
			}
			if(sixes.size() == 1 && sevens.size() == 1 && eights.size() == 1 && nines.size() == 1 && tens.size() == 1)
			{
				System.out.println("You got a Straight, it's alright");
				score = 5;
				straight = true;
			}
			if(sevens.size() == 1 && eights.size() == 1 && nines.size() == 1 && tens.size() == 1 && jacks.size() == 1)
			{
				System.out.println("You got a Straight, it's alright");
				score = 5;
				straight = true;
			}
			if(eights.size() == 1 && nines.size() == 1 && tens.size() == 1 && jacks.size() == 1 && queens.size() == 1)
			{
				System.out.println("You got a Straight, it's alright");
				score = 5;
				straight = true;
			}
			if(nines.size() == 1 && tens.size() == 1 && jacks.size() == 1 && queens.size() == 1 && kings.size() == 1)
			{
				System.out.println("You got a Straight, it's alright");
				score = 5;
				straight = true;
			}
			if(tens.size() == 1 && jacks.size() == 1 && queens.size() == 1 && kings.size() == 1 && aces.size() == 1)
			{
				System.out.println("You got a Straight, it's alright");
				score = 5;
				straight = true;
			}
		}		
		
		//Three of a Kind Done
		if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
		{
			if(trips.size() == 1 && pair.size() != 1)
			{
				System.out.println("Nice Trips you got there");
				score = 4;
			}

		}
		
		
		//Two Pair Done
		if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
		{
			if(pair.size() == 2)
			{
				System.out.println("Two Pair, not terrible");
				score = 3;
			}

		}
		
		
		//Pair Done
		if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
		{
			if(pair.size() == 1 && trips.size() != 1)
			{
				System.out.println("It's not a lot but a Pair is better than nothing");
				score = 2;
			}

		}
		
		
		//High Card Done
		if(clubs.size() < 5 && hearts.size() < 5 && diamonds.size() < 5 && spades.size() < 5)
		{
			if(aces.size() <= 1 && twos.size() <= 1 && threes.size() <= 1 && fours.size() <= 1 && fives.size() <= 1 && sixes.size() <= 1 && 
					sevens.size() <= 1 && eights.size() <= 1 && nines.size() <= 1 && tens.size() <= 1 && jacks.size() <= 1 && queens.size() <= 1 && kings.size() <= 1)
			{
				if(straight == false)
				{
					System.out.println("Yikes! You've got nothing!");
					score = 1;
				}
			}
		}
		
		//Royal Flush Done
		if(enemySuit1 == enemySuit2 && enemySuit1 == enemySuit3 && enemySuit1 == enemySuit4 && enemySuit1 == enemySuit5)
		{
			if(enemyTens.size() == 1 && enemyJacks.size() == 1 && enemyQueens.size() == 1 && enemyKings.size() == 1 && enemyAces.size() == 1)
			{
				enemyScore = 10;
				enemyStraight = true;
			}
		}
		
		
		//Straight Flush Done
		if(enemySuit1 == enemySuit2 && enemySuit1 == enemySuit3 && enemySuit1 == enemySuit4 && enemySuit1 == enemySuit5)
		{
			if(enemyAces.size() == 1 && enemyTwos.size() == 1 && enemyThrees.size() == 1 && enemyFours.size() == 1 && enemyFives.size() == 1)
			{
				enemyScore = 9;
				enemyStraight = true;
			}
			if(enemyTwos.size() == 1 && enemyThrees.size() == 1 && enemyFours.size() == 1 && enemyFives.size() == 1 && enemySixes.size() == 1)
			{
				enemyScore = 9;
				enemyStraight = true;
			}
			if(enemyThrees.size() == 1 && enemyFours.size() == 1 && enemyFives.size() == 1 && enemySixes.size() == 1 && enemySevens.size() == 1)
			{
				enemyScore = 9;
				enemyStraight = true;
			}
			if(enemyFours.size() == 1 && enemyFives.size() == 1 && enemySixes.size() == 1 && enemySevens.size() == 1 && enemyEights.size() == 1)
			{
				enemyScore = 9;
				enemyStraight = true;
			}
			if(enemyFives.size() == 1 && enemySixes.size() == 1 && enemySevens.size() == 1 && enemyEights.size() == 1 && enemyNines.size() == 1)
			{
				enemyScore = 9;
				enemyStraight = true;
			}
			if(enemySixes.size() == 1 && enemySevens.size() == 1 && enemyEights.size() == 1 && enemyNines.size() == 1 && enemyTens.size() == 1)
			{
				enemyScore = 9;
				enemyStraight = true;
			}
			if(enemySevens.size() == 1 && enemyEights.size() == 1 && enemyNines.size() == 1 && enemyTens.size() == 1 && enemyJacks.size() == 1)
			{
				enemyScore = 9;
				enemyStraight = true;
			}
			if(enemyEights.size() == 1 && enemyNines.size() == 1 && enemyTens.size() == 1 && enemyJacks.size() == 1 && enemyQueens.size() == 1)
			{
				enemyScore = 9;
				enemyStraight = true;
			}
			if(enemyNines.size() == 1 && enemyTens.size() == 1 && enemyJacks.size() == 1 && enemyQueens.size() == 1 && enemyKings.size() == 1)
			{
				enemyScore = 9;
				enemyStraight = true;
			}
		}
		
		
		//Four of a Kind Done
		if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
		{
			if(enemyQuads.size() == 1)
			{
				enemyScore = 8;
			}

		}
		
		
		//Full House Done
		if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
		{
			if(enemyTrips.size() == 1 && enemyPair.size() == 1)
			{
				enemyScore = 7;
			}

		}
		
		
		//Flush Done
		if(enemySuit1 == enemySuit2 && enemySuit1 == enemySuit3 && enemySuit1 == enemySuit4 && enemySuit1 == enemySuit5)
		{
			enemyScore = 6;
		}
		
		
		//Straight Done
		if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
		{
			if(enemyAces.size() == 1 && enemyTwos.size() == 1 && enemyThrees.size() == 1 && enemyFours.size() == 1 && enemyFives.size() == 1)
			{
				enemyScore = 5;
				enemyStraight = true;
			}
			if(enemyTwos.size() == 1 && enemyThrees.size() == 1 && enemyFours.size() == 1 && enemyFives.size() == 1 && enemySixes.size() == 1)
			{
				enemyScore = 5;
				enemyStraight = true;
			}
			if(enemyThrees.size() == 1 && enemyFours.size() == 1 && enemyFives.size() == 1 && enemySixes.size() == 1 && enemySevens.size() == 1)
			{
				enemyScore = 5;
				enemyStraight = true;
			}
			if(enemyFours.size() == 1 && enemyFives.size() == 1 && enemySixes.size() == 1 && enemySevens.size() == 1 && enemyEights.size() == 1)
			{
				enemyScore = 5;
				enemyStraight = true;
			}
			if(enemyFives.size() == 1 && enemySixes.size() == 1 && enemySevens.size() == 1 && enemyEights.size() == 1 && enemyNines.size() == 1)
			{
				enemyScore = 5;
				enemyStraight = true;
			}
			if(enemySixes.size() == 1 && enemySevens.size() == 1 && enemyEights.size() == 1 && enemyNines.size() == 1 && enemyTens.size() == 1)
			{
				enemyScore = 5;
				enemyStraight = true;
			}
			if(enemySevens.size() == 1 && enemyEights.size() == 1 && enemyNines.size() == 1 && enemyTens.size() == 1 && enemyJacks.size() == 1)
			{
				enemyScore = 5;
				enemyStraight = true;
			}
			if(enemyEights.size() == 1 && enemyNines.size() == 1 && enemyTens.size() == 1 && enemyJacks.size() == 1 && enemyQueens.size() == 1)
			{
				enemyScore = 5;
				enemyStraight = true;
			}
			if(enemyNines.size() == 1 && enemyTens.size() == 1 && enemyJacks.size() == 1 && enemyQueens.size() == 1 && enemyKings.size() == 1)
			{
				enemyScore = 5;
				enemyStraight = true;
			}
			if(enemyTens.size() == 1 && enemyJacks.size() == 1 && enemyQueens.size() == 1 && enemyKings.size() == 1 && enemyAces.size() == 1)
			{
				enemyScore = 5;
				enemyStraight = true;
			}
		}		
		
		//Three of a Kind Done
		if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
		{
			if(enemyTrips.size() == 1 && enemyPair.size() != 1)
			{
				enemyScore = 4;
			}

		}
		
		
		//Two Pair Done
		if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
		{
			if(enemyPair.size() == 2)
			{
				enemyScore = 3;
			}

		}
		
		
		//Pair Done
		if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
		{
			if(enemyPair.size() == 1 && enemyTrips.size() != 1)
			{
				enemyScore = 2;
			}

		}
		
		
		//High Card Done
		if(enemyClubs.size() < 5 && enemyHearts.size() < 5 && enemyDiamonds.size() < 5 && enemySpades.size() < 5)
		{
			if(enemyAces.size() <= 1 && enemyTwos.size() <= 1 && enemyThrees.size() <= 1 && enemyFours.size() <= 1 && enemyFives.size() <= 1 && enemySixes.size() <= 1 && 
					enemySevens.size() <= 1 && enemyEights.size() <= 1 && enemyNines.size() <= 1 && enemyTens.size() <= 1 && enemyJacks.size() <= 1 && enemyQueens.size() <= 1 && enemyKings.size() <= 1)
			{
				if(enemyStraight == false)
				{
					enemyScore = 1;
				}
			}
		}
	return score;
	}
	
	public int calculateOpponentScore()
	{
		return enemyScore;
	}

}
