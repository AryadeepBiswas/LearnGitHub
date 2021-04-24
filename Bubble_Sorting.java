import java.util.*; //importing the package !!
import java.io.*;

public class BubbleSort
{
    public void bubbleSort(int arr[]) //Creating the method so that its clear to understand the Process !
    {   //Get the length of the Array 
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {   
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    // Swap arr[j+1] and arr[j]
                    int temp = arr[j]; // An temporary variable for keeping the array value !!
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }        
        }
    }
       
     /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        // Calling Scanner Class For Taking Input From The User !!
        int n = kb.nextInt();
        BubbleSort ob = new BubbleSort();
        int arr[] = new int[n];
        ob.bubbleSort(arr);
        //Calling the method bubbleSort for sorting the array inputed !!
        System.out.println("Sorted array");
        // Now Printing the Array !!
        ob.printArray(arr);
        //Thus again Calling the PrintArray function for printing !!

    }
}
