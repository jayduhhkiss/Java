/*
 * Jada - Ashley Hawkins 
 * 04/10/2013
 * The Card Class creates the object of type card. 
 * It also has the compare to class that allows the 
 * program to order cards based on their rank.
 */
public class Card implements Comparable <Card>
{
	//Instance Variables
	int suit; 
	int rank; 
	
	//Constructor 
	public Card (int suit, int rank)
	{
		this.suit = suit; 
		this.rank = rank; 
	}
	
	//Comparing cards by rank 
	public int compareTo(Card other)
	{
		Integer rank = new Integer (other.rank);
		if(this.rank == other.rank)
			return 0;
		if (this.rank < other.rank) 
			return -1;
		if (this.rank > other.rank)
			return 1; 
		return rank.compareTo(other.rank);
	}
	
	//Converts cards to strings 
	public String toString ()
	{
			String s = " ";
				//Ace
				if (rank == 1 && suit == 1 || rank == 14 && suit == 1)
				{
					s = "You have an ace of clubs.";
				}
				else if (rank == 1 && suit == 2 || rank == 14 && suit == 2)
				{
					s = "You have an ace of diamonds.";
				}
				else if (rank == 1 && suit ==3 || rank == 14 && suit == 3)
				{
					s = "You have an ace of hearts.";
				}
				else if (rank == 1 && suit == 4 || rank == 14 && suit == 4)
				{
					s = "You have an ace of spades.";
				}
				
				//Two
				else if (rank == 2 && suit == 1)
				{
					s = "You have a two of clubs.";
				}
				else if (rank == 2 && suit == 2)
				{
					s = "You have a two of diamonds.";
				}
				else if (rank == 2 && suit == 3)
				{
					s = "You have a two of hearts.";
				}
				else if (rank == 2 && suit == 4)
				{
					s = "You have a two of spades.";
				}
				
				//Three
				else if (rank == 3 && suit == 1)
				{
					s = "You have a three of clubs.";
				}
				else if (rank == 3 && suit == 2)
				{
					s = "You have a three of diamonds.";
				}
				else if (rank == 3 && suit == 3)
				{
					s = "You have a three of hearts.";
				}
				else if (rank == 3 && suit == 4)
				{
					s = "You have a three of spades.";
				}
				
				//Four
				else if (rank == 4 && suit == 1)
				{
					s = "You have a four of clubs.";
				}
				else if (rank == 4 && suit == 2)
				{
					s = "You have a four of diamonds.";
				}
				else if (rank == 4 && suit == 3)
				{
					s = "You have a four of hearts.";
				}
				else if (rank == 4 && suit == 4)
				{
					s = "You have a four of spades.";
				}
				
				//Five
				else if (rank == 5 && suit == 1)
				{
					s = "You have a five of clubs.";
				}
				else if (rank == 5 && suit == 2)
				{
					s = "You have a five of diamonds.";
				}
				else if (rank == 5 && suit == 3)
				{
					s = "You have a five of hearts.";
				}
				else if (rank == 5 && suit == 4)
				{
					s = "You have a five of spades.";
				}
				
				//Six
				else if (rank == 6 && suit == 1)
				{
					s = "You have a six of clubs.";
				}
				else if (rank == 6 && suit == 2)
				{
					s = "You have a six of diamonds.";
				}
				else if (rank == 6 && suit == 3)
				{
					s = "You have a six of hearts.";
				}
				else if (rank == 6 && suit == 4)
				{
					s = "You have a six of spades.";
				}
				
				//Seven
				else if (rank == 7 && suit == 1)
				{
					s = "You have a seven of clubs.";
				}
				else if (rank == 7 && suit == 2)
				{
					s = "You have a seven of diamonds.";
				}
				else if (rank == 7 && suit == 3)
				{
					s = "You have a seven of hearts.";
				}
				else if (rank == 7 && suit == 4)
				{
					s = "You have a seven of spades.";
				}
				
				//Eight
				else if (rank == 8 && suit == 1)
				{
					s = "You have a eight of clubs.";
				}
				else if (rank == 8 && suit == 2)
				{
					s = "You have a eight of diamonds.";
				}
				else if (rank == 8 && suit == 3)
				{
					s = "You have a eight of hearts.";
				}
				else if (rank == 8 && suit == 4)
				{
					s = "You have a eight of spades.";
				}
				
				//Nine
				else if (rank == 9 && suit == 1)
				{
					s = "You have a nine of clubs.";
				}
				else if (rank == 9 && suit == 2)
				{
					s = "You have a nine of diamonds.";
				}
				else if (rank == 9 && suit == 3)
				{
					s = "You have a nine of hearts.";
				}
				else if (rank == 9 && suit == 4)
				{
					s = "You have a nine of spades.";
				}
				
				//Ten
				else if (rank == 10 && suit == 1)
				{
					s = "You have a ten of clubs.";
				}
				else if (rank == 10 && suit == 2)
				{
					s = "You have a ten of diamonds.";
				}
				else if (rank == 10 && suit == 3)
				{
					s = "You have a ten of hearts.";
				}
				else if (rank == 10 && suit == 4)
				{
					s = "You have a ten of spades.";
				}
				
				//Jack
				else if (rank == 11 && suit == 1)
				{
					s = "You have a jack of clubs.";
				}
				else if (rank == 11 && suit == 2)
				{
					s = "You have a jack of diamonds.";
				}
				else if (rank == 11 && suit == 3)
				{
					s = "You have a jack of hearts.";
				}
				else if (rank == 11 && suit == 4)
				{
					s = "You have a jack of spades.";
				}
				
				//Queen
				else if (rank == 12 && suit == 1)
				{
					s = "You have a queen of clubs.";
				}
				else if (rank == 12 && suit == 2)
				{
					s = "You have a queen of diamonds.";
				}
				else if (rank == 12 && suit == 3)
				{
					s = "You have a queen of hearts.";
				}
				else if (rank == 12 && suit == 4)
				{
					s = "You have a queen of spades.";
				}
				
				//King
				else if (rank == 13 && suit == 1)
				{
					s = "You have a king of clubs.";
				}
				else if (rank == 13 && suit == 2)
				{
					s = "You have a king of diamonds.";
				}
				else if (rank == 13 && suit == 3)
				{
					s = "You have a king of hearts.";
				}
				else if (rank == 13 && suit == 4)
				{
					s = "You have a king of spades.";
				}	
				return s; 
			}

	//Gives the suit
	public int getSuit()
	{
		return suit;
	}
	
	//Gives the rank 
	public int getRank()
	{
		return rank;
	}
}
		