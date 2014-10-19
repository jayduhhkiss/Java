package hearts;

import io.IO;

public class Shuffle
{
        public static void main(String[] args)
        {
                String cardsString = IO.prompt("");
                int numOfCards = 0;
        
                try
                {  
                        numOfCards = Integer.parseInt(cardsString);
                }
                catch(NumberFormatException e)
                {
                        System.out.println("Helpful?");
                }
                 
                String [] deck = new String [numOfCards];
                
                for (int i = 0; i < numOfCards; i++)
                {
                        deck[i] = IO.prompt("");
                }
                 

                for (int i = 0; i < 1000; i++)
                {
                        int ranNum = (int)(Math.random()*deck.length);
                        int ranNum2 = (int)(Math.random()*deck.length);
                        
                        String temp = deck[ranNum];
                        String temp2 = deck[ranNum2];
                        
                        deck [ranNum] = temp2;
                        deck [ranNum2] = temp;
                }
                 
                        for (int k = 0; k < deck.length; k++)
                        {
                        	IO.stdout.println(deck[k]);
                        }
        }      
}  