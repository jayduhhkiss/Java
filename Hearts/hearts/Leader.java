package hearts;

import io.IO;

public class Leader {
	
	public static void main(String[] args) 
	{
		String north = IO.prompt("");
        String [] northHand = new String [13];
                
        for (int i = 0; i < 13; i++)
        {
                northHand[i] = IO.prompt("");
        }
        for (int k = 0; k <13; k++)
        {
                IO.stdout.println(northHand[k]);
        }
         
        System.out.println("-----------");
        
        String east = IO.prompt("");
        String [] eastHand = new String [13];
         
        for (int i = 0; i < 13; i++)
        {
                eastHand[i] = IO.prompt("");
        }
        for (int k = 0; k <13; k++)
        {
                IO.stdout.println(eastHand[k]);
        }

        System.out.println("-----------");
        
        String south = IO.prompt("");
        String [] southHand = new String [13];
                
        for (int i = 0; i < 13; i++)
        {
                southHand[i] = IO.prompt("");
        }
        for (int k = 0; k <13; k++)
        {
                IO.stdout.println(southHand[k]);
        }

        System.out.println("-----------");
        
        String west = IO.prompt("");
        String [] westHand = new String [13];

        for (int i = 0; i < 13; i++)
        {
                westHand[i] = IO.prompt("");
        }
        for (int k = 0; k <13; k++)
        {
                IO.stdout.println(westHand[k]);
        }

		for (int i = 0; i < 13; i++)
		{
			if (northHand[i].equals("Two of clubs."))
			{
				IO.stdout.println("The north deck contains the two of clubs.");
			}
			else if (eastHand[i].equals("Two of clubs."))
			{
				IO.stdout.println("The east deck contains the two of clubs.");
			}
			else if (southHand[i].equals("Two of clubs."))
			{
				IO.stdout.println("The south deck contains the two of clubs.");
			}	
			else if (westHand[i].equals("Two of clubs."))
			{
				IO.stdout.println("The west deck contains the two of clubs.");
			}
		}
	}

}
