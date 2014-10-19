package hearts;

import io.IO;

public class NewDeck
{
        public static void main(String[] args)
        {
                String[] deck = {
                                "Two of clubs.", "Two of diamonds.", "Two of hearts.", "Two of spades.",
                                "Three of clubs.", "Three of diamonds.", "Three of hearts.", "Three of spades.",
                                "Four of clubs.", "Four of diamonds.", "Four of hearts.", "Four of spades",
                                "Five of clubs.", "Five of diamonds.", "Five of hearts.", "Five of spades.",
                                "Six of clubs.", "Six of diamonds", "Six of hearts.", "Six of spades.",
                                "Seven of clubs.", "Seven of diamonds.", "Seven of hearts.", "Seven of spades.",
                                "Eight of clubs.", "Eight of diamonds.", "Eight of hearts.", "Eight of spades.",
                                "Nine of clubs.", "Nine of diamonds.", "Nine of hearts.", "Nine of spades.",
                                "Ten of clubs.", "Ten of diamonds.", "Ten of hearts.", "Ten of spades.",
                                "Jack of clubs.", "Jack of diamonds.", "Jack of hearts.", "Jack of spades.",
                                "Queen of clubs.", "Queen of diamonds.", "Queen of hearts.", "Queen of spades.",
                                "King of clubs.", "King of diamonds.", "King of hearts.", "King of spades.",
                                "Ace of clubs.", "Ace of diamonds.", "Ace of hearts.", "Ace of spades."
                        };

                IO.stdout.println(deck.length);

                for (String card : deck)
                {
                        IO.stdout.println(card);
                }
        }
}

