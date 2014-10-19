package hearts;

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
			
				//Two
				if (rank == 2 && suit == 1)
				{
					s = "Two of clubs.";
				}
				else if (rank == 2 && suit == 2)
				{
					s = "Two of diamonds.";
				}
				else if (rank == 2 && suit == 3)
				{
					s = "Two of hearts.";
				}
				else if (rank == 2 && suit == 4)
				{
					s = "Two of spades.";
				}
				
				//Three
				else if (rank == 3 && suit == 1)
				{
					s = "Three of clubs.";
				}
				else if (rank == 3 && suit == 2)
				{
					s = "Three of diamonds.";
				}
				else if (rank == 3 && suit == 3)
				{
					s = "Three of hearts.";
				}
				else if (rank == 3 && suit == 4)
				{
					s = "Three of spades.";
				}
				
				//Four
				else if (rank == 4 && suit == 1)
				{
					s = "Four of clubs.";
				}
				else if (rank == 4 && suit == 2)
				{
					s = "Four of diamonds.";
				}
				else if (rank == 4 && suit == 3)
				{
					s = "Four of hearts.";
				}
				else if (rank == 4 && suit == 4)
				{
					s = "Four of spades.";
				}
				
				//Five
				else if (rank == 5 && suit == 1)
				{
					s = "Five of clubs.";
				}
				else if (rank == 5 && suit == 2)
				{
					s = "Five of diamonds.";
				}
				else if (rank == 5 && suit == 3)
				{
					s = "Five of hearts.";
				}
				else if (rank == 5 && suit == 4)
				{
					s = "Five of spades.";
				}
				
				//Six
				else if (rank == 6 && suit == 1)
				{
					s = "Six of clubs.";
				}
				else if (rank == 6 && suit == 2)
				{
					s = "Six of diamonds.";
				}
				else if (rank == 6 && suit == 3)
				{
					s = "Six of hearts.";
				}
				else if (rank == 6 && suit == 4)
				{
					s = "Six of spades.";
				}
				
				//Seven
				else if (rank == 7 && suit == 1)
				{
					s = "Seven of clubs.";
				}
				else if (rank == 7 && suit == 2)
				{
					s = "Seven of diamonds.";
				}
				else if (rank == 7 && suit == 3)
				{
					s = "Seven of hearts.";
				}
				else if (rank == 7 && suit == 4)
				{
					s = "Seven of spades.";
				}
				
				//Eight
				else if (rank == 8 && suit == 1)
				{
					s = "Eight of clubs.";
				}
				else if (rank == 8 && suit == 2)
				{
					s = "Eight of diamonds.";
				}
				else if (rank == 8 && suit == 3)
				{
					s = "Eight of hearts.";
				}
				else if (rank == 8 && suit == 4)
				{
					s = "Eight of spades.";
				}
				
				//Nine
				else if (rank == 9 && suit == 1)
				{
					s = "Nine of clubs.";
				}
				else if (rank == 9 && suit == 2)
				{
					s = "Nine of diamonds.";
				}
				else if (rank == 9 && suit == 3)
				{
					s = "Nine of hearts.";
				}
				else if (rank == 9 && suit == 4)
				{
					s = "Nine of spades.";
				}
				
				//Ten
				else if (rank == 10 && suit == 1)
				{
					s = "Ten of clubs.";
				}
				else if (rank == 10 && suit == 2)
				{
					s = "Ten of diamonds.";
				}
				else if (rank == 10 && suit == 3)
				{
					s = "Ten of hearts.";
				}
				else if (rank == 10 && suit == 4)
				{
					s = "Ten of spades.";
				}
				
				//Jack
				else if (rank == 11 && suit == 1)
				{
					s = "Jack of clubs.";
				}
				else if (rank == 11 && suit == 2)
				{
					s = "Jack of diamonds.";
				}
				else if (rank == 11 && suit == 3)
				{
					s = "Jack of hearts.";
				}
				else if (rank == 11 && suit == 4)
				{
					s = "Jack of spades.";
				}
				
				//Queen
				else if (rank == 12 && suit == 1)
				{
					s = "Queen of clubs.";
				}
				else if (rank == 12 && suit == 2)
				{
					s = "Queen of diamonds.";
				}
				else if (rank == 12 && suit == 3)
				{
					s = "Queen of hearts.";
				}
				else if (rank == 12 && suit == 4)
				{
					s = "Queen of spades.";
				}
				
				//King
				else if (rank == 13 && suit == 1)
				{
					s = "King of clubs.";
				}
				else if (rank == 13 && suit == 2)
				{
					s = "King of diamonds.";
				}
				else if (rank == 13 && suit == 3)
				{
					s = "King of hearts.";
				}
				else if (rank == 13 && suit == 4)
				{
					s = "King of spades.";
				}
				
				//Ace
				else if (rank == 14 && suit == 1)
				{
					s = "Ace of clubs.";
				}
				else if (rank == 14 && suit == 2)
				{
					s = "Ace of diamonds.";
				}
				else if (rank == 14 && suit == 3)
				{
					s = "Ace of hearts.";
				}
				else if (rank == 14 && suit == 4)
				{
					s = "Ace of spades.";
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

