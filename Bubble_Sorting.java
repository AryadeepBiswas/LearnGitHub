import java.util.*;
import java.io.*;

public class Bubble_Sorting
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        System.out.Println("Enter the Number of Inetegers You want to enter inside the array");
        int n = kb.nextInt();
        int ar[] = new int(n);
        int k = 0;
        //Taking the input for number of vslues in the array 
        //Now we have to sort the array so that we can Get to Know how to do bubble sorting !!! 
        System.out.println("Input the Integers")
        for(int i = 0 ; i<=n ; i++ )
        {
            ar[i] = kb.nextInt();    
        }
        for(int i = 0 ; i<=n ; i++)
        {
            for(int j = 0 ; j<=n ; j++)
            {
                //For swapping the array by entering the value in index 1 in index 2 
                if(ar[j]=ar[j+1])
                {
                    k = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = k;
                }

            }
        }    //For Printing the array !! 
        
        for(int i = 0 ; i<=n ;i++)
        {
            System.out.print(ar[i]);
        }
    }    
    
}