// Print Intreger Numbers Present at Even Locations in Array
import java.util.Scanner;
class H 
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

        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0 )
            {
                if(arr[i]%2==0)
                {
                System.out.println("arr ["+i+"]=" + arr[i]);
                }
            }
        }
    }
}
