//Find Even and Odd Numbers in Array
import java.util.Arrays;
import java.util.Scanner;
class F 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.print("even numbers:- ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+ ",");
            }
        }
        System.out.println("");
        System.out.print("odd numbers:-");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+ ",");
            }
        }
    }  
        
}