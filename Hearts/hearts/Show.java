package hearts;

import io.IO;

public class Show {

	public static void main(String[] args) 
	{
		System.out.println("-----North-----");
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
         
        System.out.println("-----East-----");
        
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

        System.out.println("-----South-----");
        
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

        System.out.println("-----West-----");
        
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
	}

}
