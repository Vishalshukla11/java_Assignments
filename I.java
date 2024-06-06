//Calculate the Average of Numbers Present at Even Locations
import java.util.Scanner;
class I 
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int []arr= new int [size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                sum=sum+arr[i];
            }
        }

        System.out.println("average = " + sum/arr.length);
    }
}