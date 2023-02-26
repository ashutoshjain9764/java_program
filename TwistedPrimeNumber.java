import java.util.Scanner;
class TwistedPrimeNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int no=sc.nextInt();
       
        if(prime(no))
       
            {
               int rev=reverse(no);
               if(prime(rev))
               {
                System.out.println("The given number is Twisted prime number");
               }
               else
                {
                System.out.println("The given number is  not Twisted prime number");
               }
            }
            else 
            {
                System.out.println("The given number is not prime number");
            }
        
    }
    public static boolean prime(int no)
    {
        int i;
        for(i=2;i<no;i++)
        {
            if(no%i==0)
            {
                return false;
            }
        }
     
        return true;
      
    }
     public static int reverse(int no)
    {
        int i,rev=0;
        for(i=no;i!=0;i/=10)
        {
           rev=rev*10+(i%10);
        }
     
        return rev;
      
    }

}
        
       