//Palindrome Number
import java.util.Scanner;
class C 
{
    public static void main(String args [])
    {
        int rev=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int number=num;
         while(num!=0)
         {
           int rem=num%10;
           num=num/10;
            rev=rev*10+rem;
         }
         System.out.println("after reverse = "+ rev);

         if(rev==number)
         {
            System.out.println("given number is palindrome number");
         }
         else
         {
            System.out.println("number is not a palindrome number");
         }
    }
}