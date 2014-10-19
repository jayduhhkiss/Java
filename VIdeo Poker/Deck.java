/*
 * Jada - Ashey Hawkins 
 * 04/10/2013
 * Creates an object of type deck that shuffles, deals to the player,
 * and removes cards from the player's deck when they are finished. 
 * Also allows players to redraw each card only once. 
 */
import java.util.Random;
import java.util.ArrayList;

//Instance Variables
public class Deck 
{
	 
	private ArrayList<Card> mainDeck;
	private ArrayList<Card> newMD;
	private ArrayList<Card> myHand; 

	//Constructor 
	public Deck()
	{
		mainDeck = new ArrayList<Card>();
		newMD = new ArrayList<Card>();
		myHand = new ArrayList<Card>();
		
		for (int rank = 0; rank <= 14; rank++)
		{
			for (int suit = 1; suit <= 4; suit++)
			{
				mainDeck.add(new Card(suit, rank)); 
			}
		}		
		
		for (int i = 4; i <= 55; i++)
		{
			
			newMD.add(mainDeck.get(i));
		}
		
	}
	
	//Shuffle
	public void shuffle()
	{
		for (int j = 0; j < 1000; j++) 
		{
		 	Random randomGenerator = new Random();
			int randomPos = randomGenerator.nextInt(newMD.size() - 1);
			int ran = randomGenerator.nextInt(newMD.size() - 1);
			Card temp = newMD.get(ran);
			newMD.set(ran, newMD.get(randomPos)); 
			newMD.set(randomPos, temp);
		}
	}
	
	//Gives size of Array List so I can ensure there were only 52 cards
	public void giveSize()
	{
		System.out.println(newMD.size());
	}
	
	//Allowed me to double check the main deck 
	public void printMainDeck()
	{
		System.out.println(newMD);
	}
	
	//Deals the hand 
	public void deal()
	{
		
		for (int i = 0; i <= 4; i++)
			{
				myHand.add(newMD.get(i));
			}
		System.out.println(myHand);
		
	}
	
	//Removes card from the hand once I restart the game
	public void remove()
	{
			myHand.remove(0);
			myHand.remove(0);
			myHand.remove(0);
			myHand.remove(0);
			myHand.remove(0);
		
	}
	
	//Redraw method 
 	public ArrayList<Card> redrawHand(int j, int i)
	{
 		myHand.set(j, newMD.get(i));	
 		System.out.println(myHand);
 		return myHand;
	}

 	//Gives me main deck 
 	public ArrayList<Card> getDeck()
 	{
 		return newMD;
 	}
 	
 	//Give me hand deck 
 	public ArrayList<Card> getDeckOne()
 	{	
 		return myHand;
 	} 	
}
	