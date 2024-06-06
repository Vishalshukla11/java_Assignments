// Count Digits in an Integer Number
import java.util.Scanner;
class A
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter number");
        int num=sc.nextInt();
        int number =num;
        
        while(num !=0)
        {
            num=num/10;
            count++;
        }
        System.out.println("the count of " + number + " = " + count);
    }

}