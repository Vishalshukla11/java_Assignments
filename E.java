//Reverse of Array
import java.util.Arrays;
import java.util.Scanner;
class E 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int []arr= new int[size];
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("arr [" + i + "] =");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("after reverse the array");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}