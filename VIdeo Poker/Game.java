/*
 * Jada - Ashley Hawkins 
 * 04/10/2013 
 * Implements an object of type Game. 
 * This class contains the evaluation and sorting methods.
 * It also confirms if the player would like to play again.
 * As well as organize the flow of the actual game. 
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Game 
{
	//Instance Variables
	private Deck deck; 
	Scanner scan = new Scanner(System.in);
	String secondCase;
	String thirdCase;
	String fourthCase;
	String fifthCase;
	ArrayList <Card> evalHold;
	
	//Constructor 
	public Game()
	{
		deck = new Deck(); 
	}
	
	//Sorting Method
 	public ArrayList<Card> sort(ArrayList <Card> c) 
 	{
 	    for (int i=0; i<= 4; i++) 
 	    {
 	        for (int j=i+1; j<= 4; j++) {
 	            if (c.get(i).getRank() > c.get(j).getRank()) 
 	            {
 	                Card temp = c.get(i);
 	                c.set(i, c.get(j));
 	                c.set(j, temp);
 	            }
 	        }
 	    }
 	    return c;
 	}
 	
 	//Do you want to redraw your card? 
	public Deck confirmRedraw()
{
		
		String thirdCase;
		String fourthCase;
		String fifthCase;
		
		//FIRST CASE BASE
		System.out.println("Would you like to redraw your first card?"); 
		Scanner scan = new Scanner(System.in);
		
		String firstCase = scan.next();
		if(firstCase.equalsIgnoreCase("yes"))
		{
			deck.redrawHand(0,5);
			// + SECOND CASE BASE
			
			
			System.out.println("Would you like to redraw your second card?");
			String secondCase = scan.next();
			if (secondCase.equalsIgnoreCase("yes"))
			{
				deck.redrawHand(1,6);
				//Third Case
				
				
				System.out.println("Would you like to redraw your third card?");
				thirdCase = scan.next();
				if(thirdCase.equalsIgnoreCase("yes"))
				{
					deck.redrawHand(2,7);
					
					System.out.println("Would you like to redraw your fourth card?");
					fourthCase = scan.next();
					if(fourthCase.equalsIgnoreCase("yes"))
					{
						deck.redrawHand(3,8);
					
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,9);
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
					else if(fourthCase.equalsIgnoreCase("no"))
					{
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,8);
						
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
					
				}
				else if(thirdCase.equalsIgnoreCase("no"))
				{
					System.out.println("Would you like to redraw your fourth card?");
					fourthCase = scan.next();
					if(fourthCase.equalsIgnoreCase("yes"))
					{
						deck.redrawHand(3,7);
					
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,8);
						
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
					else if(fourthCase.equalsIgnoreCase("no"))
					{
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,7);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
				}
			}
			
			else if (secondCase.equalsIgnoreCase ("no"))
			{
				System.out.println("Would you like to redraw your third card?");
				thirdCase = scan.next();
				if(thirdCase.equalsIgnoreCase("yes"))
				{
					deck.redrawHand(2,6);
					
					System.out.println("Would you like to redraw your fourth card?");
					fourthCase = scan.next();
					if(fourthCase.equalsIgnoreCase("yes"))
					{
						deck.redrawHand(3,7);
					
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,8);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
					else if(fourthCase.equalsIgnoreCase("no"))
					{
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,7);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
					
				}
				else if(thirdCase.equalsIgnoreCase("no"))
				{
					System.out.println("Would you like to redraw your fourth card?");
					fourthCase = scan.next();
					if(fourthCase.equalsIgnoreCase("yes"))
					{
						deck.redrawHand(3,6);
					
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,7);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
					else if(fourthCase.equalsIgnoreCase("no"))
					{
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,6);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
				}
			}
		}
	
		else if (firstCase.equalsIgnoreCase("no"))
		{
			
			System.out.println("Would you like to redraw your second case?");
			String secondCase = scan.next();
			if (secondCase.equalsIgnoreCase("yes"))
			{
				deck.redrawHand(1,5);
				//Third Case
				
				
				System.out.println("Would you like to redraw your third card?");
				thirdCase = scan.next();
				if(thirdCase.equalsIgnoreCase("yes"))
				{
					deck.redrawHand(2,6);
					
					System.out.println("Would you like to redraw your fourth card?");
					fourthCase = scan.next();
					if(fourthCase.equalsIgnoreCase("yes"))
					{
						deck.redrawHand(3,7);
					
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,8);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
					else if(fourthCase.equalsIgnoreCase("no"))
					{
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,7);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
					
				}
				else if(thirdCase.equalsIgnoreCase("no"))
				{
					System.out.println("Would you like to redraw your fourth card?");
					fourthCase = scan.next();
					if(fourthCase.equalsIgnoreCase("yes"))
					{
						deck.redrawHand(3,6);
					
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,7);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
					else if(fourthCase.equalsIgnoreCase("no"))
					{
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,7);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
				}
			}
			
			else if (secondCase.equalsIgnoreCase ("no"))
			{
				System.out.println("Would you like to redraw your third card?");
				thirdCase = scan.next();
				if(thirdCase.equalsIgnoreCase("yes"))
				{
					deck.redrawHand(2,5);
					
					System.out.println("Would you like to redraw your fourth card?");
					fourthCase = scan.next();
					if(fourthCase.equalsIgnoreCase("yes"))
					{
						deck.redrawHand(3,6);
					
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,7);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
					else if(fourthCase.equalsIgnoreCase("no"))
					{
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,6);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
					
				}
				else if(thirdCase.equalsIgnoreCase("no"))
				{
					System.out.println("Would you like to redraw your fourth card?");
					fourthCase = scan.next();
					if(fourthCase.equalsIgnoreCase("yes"))
					{
						deck.redrawHand(3,5);
					
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,6);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
					else if(fourthCase.equalsIgnoreCase("no"))
					{
						System.out.println("Would you like to redraw your fifth card?");
						fifthCase = scan.next();
						if(fifthCase.equalsIgnoreCase("yes"))
						{
							System.out.println("Here is your hand "); 
							deck.redrawHand(4,5);
							
						}
						else if(fifthCase.equalsIgnoreCase("no"))
						{
							deck.redrawHand(4,4);
						}
					}
				}
			}
		}
		return deck;
}
	
	//Congrats you won because of...
	public void evaluation()
	{ 
		fourOfAKind();
		fullHouse();
		flush();
		straight();
		straightFlush();
		threeOfAKind();
		twoPair();
		aPair();
		highCard();
		
		//Straight Flush 
		
		if (straightFlush() == true)
		{
			System.out.println("Congrats you have a straight flush!");
		}
		
		//Four of a Kind 
		else if (fourOfAKind() == true)
		{
			System.out.println("Congrats you have a four of a kind!");
		}
		
		//Full House 
		else if (fullHouse() == true)
		{
			System.out.println("Congrats you have a full house!");
		}
		
		//Flush 
		else if (flush() == true)
		{
			System.out.println("Congrats you have a flush!");
		}
		
		//Straight
		else if (straight() == true)	
		{
			System.out.println("Congrats you have a straight!");
		}
		
		//Three of a Kind 
		else if (threeOfAKind() == true)
		{
			System.out.println("Congrats you have three of a kind!");
		}
		
		//Two Pair 
		else if (twoPair() == true)
		{
			System.out.println("Congrats you have two pair!");
		}
		
		//A Pair 
		else if (aPair() == true)
		{
			System.out.println("Congrats you have a pair!");
		}
		
		//The High Card 
		else 
		{
			System.out.println("You've won by having a high card!");
		}
}
	
	//Do you want to play again?
	public void confirmPlay()
	{
		Scanner scan = new Scanner(System.in);
		String confirmation =scan.next();

		if (confirmation.equalsIgnoreCase("yes"))
		{
			replay();
		}
		else if(confirmation.equalsIgnoreCase("no"))
		{
		System.out.println("Thank you for playing!");
		System.exit(0);
		}
	}
	
	//Specifics of Replay
	public void replay ()
	{
		deck.shuffle();
		deck.remove();
		play(); 
	}
	
	//Play the game 
	public void play()
	{
		
		System.out.println("Welcome to Video Poker.");
		//deck.printMainDeck(); --> I liked to make sure I had the original deck
		deck.shuffle();
		//deck.printMainDeck(); --> Compare deck after it has been shuffled
		//deck.giveSize();  --> ensure that there is 52 cards. 
		ArrayList <Card> evalHold =  deck.getDeckOne();
		System.out.println("Here is your hand... ");
		deck.deal();
		confirmRedraw();
		//System.out.println(evalHold); --> So I can view the hand 
		sort(evalHold);
		System.out.println("");
		System.out.println("Here is your sorted list... ");
		System.out.println(sort(evalHold));
		System.out.println("");
		evaluation();
		System.out.println("Would you like to play again?");
		confirmPlay();	
	}

	//Four of a Kind 
	public boolean fourOfAKind()
	{
		boolean s = false;
		
		if (deck.getDeckOne().get(0) == deck.getDeckOne().get(1) 
		&& 
		deck.getDeckOne().get(0) == deck.getDeckOne().get(2)
		&&
		deck.getDeckOne().get(0) == deck.getDeckOne().get(3))
		{
			s = true; 
		}
		else if (deck.getDeckOne().get(4) == deck.getDeckOne().get(1) 
		&& 
		deck.getDeckOne().get(4) == deck.getDeckOne().get(2)
		&&
		deck.getDeckOne().get(4) == deck.getDeckOne().get(3))
		{
			s = true;
		}
		return s;
	}
	
	//Full House
	public boolean fullHouse()
	{
		
		boolean s = false; 
		
		if (threeOfAKind() == true && twoPair() == true && fourOfAKind() == false)
		{
			s = true;
		}
		
		return s;
	}
	
	//Flush
	public boolean flush()
	{
		boolean s = false; 
		
		if (
				deck.getDeckOne().get(0).getSuit() == deck.getDeckOne().get(1).getSuit() 
				&& 
				deck.getDeckOne().get(1).getSuit() == deck.getDeckOne().get(2).getSuit() 
				&& 
				deck.getDeckOne().get(2).getSuit() == deck.getDeckOne().get(3).getSuit()
				&& 
				deck.getDeckOne().get(3).getSuit() == deck.getDeckOne().get(4).getSuit()
			)
			s = true;
		return s; 
	}
	
	//Straight
	public boolean straight()
	{
		boolean s = false; 
		
		if (
				deck.getDeckOne().get(0).getRank() + 1 == deck.getDeckOne().get(1).getRank() 
				&& 
				deck.getDeckOne().get(1).getRank() + 1 == deck.getDeckOne().get(2).getRank() 
				&& 
				deck.getDeckOne().get(2).getRank() + 1 == deck.getDeckOne().get(3).getRank()
				&& 
				deck.getDeckOne().get(3).getRank() + 1 == deck.getDeckOne().get(4).getRank()
			)
				s = true;		
		return s; 
	}
	
	//Straight Flush
	public boolean straightFlush()
	{
		boolean s = false; 
		
		if (flush() == true && straight() == true)
		{
			s = true;
		}
		
		return s;
		
	}
	
	//Three of a Kind
	public boolean threeOfAKind()
	{
		boolean s = false;
		
		if (deck.getDeckOne().get(0) == deck.getDeckOne().get(1) 
		&& 
		deck.getDeckOne().get(0) == deck.getDeckOne().get(2))
		{
			s = true; 
		}
		else if (deck.getDeckOne().get(4) == deck.getDeckOne().get(3) 
		&& 
		deck.getDeckOne().get(4) == deck.getDeckOne().get(2))
		{
			s = true;
		}
		else if (deck.getDeckOne().get(1) == deck.getDeckOne().get(2) 
				&& 
				deck.getDeckOne().get(2) == deck.getDeckOne().get(4))
				{
					s = true;
				}
		return s;
	}
			
	//Two Pair
	public boolean twoPair()
	{
		boolean s = false;
		int pair = 0;
		
		if (deck.getDeckOne().get(0) == deck.getDeckOne().get(1))
		{
			pair++;
		}
		if (deck.getDeckOne().get(1) == deck.getDeckOne().get(2))
		{
			pair++;
		}
		if (deck.getDeckOne().get(2) == deck.getDeckOne().get(3))
		{
			pair++;
		}
		if (deck.getDeckOne().get(3) == deck.getDeckOne().get(4))
		{
			pair++;
		}
	
		if (pair > 1 && threeOfAKind() == false)
		{
			s = true;
		}
		return s; 
	}
	
	//One Pair
	public boolean aPair()
	{
		boolean s = false;
		for(int i = 0; i <= 4; i++)
			for (int j = 1; j <= 4; j++)
			{
				if(j != i)
				{
					if (deck.getDeckOne().get(i).compareTo(deck.getDeckOne().get(j)) == 0)
					{
						s = true; 
					}
				}
			}
		return s;
	} 		
	
	//High Card 
	public Card highCard ()
	{	
		Card highestCard = new Card(0, 0); 
		for(int i = 0; i <= 4; i++)
		{
			if (deck.getDeckOne().get(i).compareTo(deck.getDeckOne().get(i++)) == 1)
			{
				highestCard = deck.getDeckOne().get(i);
			}
			else if (deck.getDeckOne().get(i).compareTo(deck.getDeckOne().get(i++)) == -1)
			{
				highestCard = deck.getDeckOne().get(i++);
			}
		}
		return highestCard;
	}

}
			
		
		
		

	

