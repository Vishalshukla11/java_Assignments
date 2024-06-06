//Count the Even Numbers in Array
import java.util.Scanner;
class G 
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int [] arr = new int [size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count++;
            }
        }
        System.out.print("count of even numbers = " + count);
    }
}