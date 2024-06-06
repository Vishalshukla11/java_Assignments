//Armstrong Number
import java.util.Scanner;
class D 
{
    public static void main(String args[])
    {
        int rev=0;
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int number=num;
        
     while(num !=0)
        {
            int rem=num%10;
            rev=rem*rem*rem;
            sum=sum+rev;
            num=num/10;
           
        }
        System.out.println("after reverse = " + sum);
        if(number==sum)
        {
            System.out.println("number is armstrong number");
        }
        else{
            System.out.println("number is not armstrong number");
        }
        
        
        
    }
}
