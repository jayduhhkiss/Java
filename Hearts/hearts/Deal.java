package hearts;

import io.IO;

public class Deal 
{	
        public static void main(String[] args)
        {
        	String [] deck = new String [52];
            
            for (int i = 0; i < 52; i++)
            {
                deck[i] = IO.prompt("");
            }
       	 
            for (int k = 0; k < deck.length; k++)
            {
            	IO.stdout.println(deck[k]);
            }

            //north
            String[] northDeck = new String[13];
            for (int i = 0; i < 13; i++)
            {
           	 northDeck[i] = deck[i];
            }
            System.out.println("\nThe North Deck:");
            for (int k = 0; k < northDeck.length; k++)
            {
           	 IO.stdout.println(northDeck[k]);
            }
            
            //east
            String[] eastDeck = new String[13];
            int i = 13;
            while (i == 13 && i < 26)
            {
            	for(int j = 0; j < 13; j++)
            	{
            		eastDeck[j] = deck [i];
           	    	i++; 
            	}
            }
            System.out.println("\nThe East Deck:");
            for (int k = 0; k < eastDeck.length; k++)
            {
           	 IO.stdout.println(eastDeck[k]);
            }
            
            //south
            String[] southDeck = new String[13];
            int i2 = 26;
            while (i2 == 26 && i2 < 39)
            {
            	for (int j = 0; j < 13; j++)
            	{
            		southDeck[j] = deck [i2]; 
            		i2++;
            	}
            }
            System.out.println("\nThe South Deck:");
            for (int k = 0; k < southDeck.length; k++)
            {
           	 IO.stdout.println(southDeck[k]);
            }
           
            //west
            String[] westDeck = new String[13];
            int i3 = 39;
            while (i3 == 39 && i3 < 52)
            {
            	for (int j = 0; j < 13; j++)
            	{
            		westDeck[j] = deck [i3];
            		i3++;
            	}
            }
            System.out.println("\nThe West Deck:");
            for (int k = 0; k < westDeck.length; k++)
            {
           	 IO.stdout.println(westDeck[k]);
            }  
      }
}
