//Sort the Array 
import java.util.Scanner;
class J 
{
    public static void main(String args[])
    {
        
        int temp=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int [] arr= new int [size];
        //int leng=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("Before sorting");
        for(int num:arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        //logic

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

       

        System.out.println("after sorting");
        for(int num:arr)
        {
            System.out.print(num + " ");
        }
    }
}