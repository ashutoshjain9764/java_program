import java.util.Scanner;
class StrongNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int  no=sc.nextInt();
        strong(no);
    }
    public static void strong(int no)
    {
         int sum=0;
         for(int i=no;i!=0;i/=10)
         {
            int rem=i%10;
            sum+=factorial(rem);
         }
         if(sum==no)
         {
            System.out.println("tThe Given Number is Strong  "+no);
         }
         else
          {
            System.out.println("tThe Given Number is not  Strong  "+no);
         }

    }
    public static int factorial(int no)
    {
         int fact=1;
        for(int i=1;i<=no;i++)
        {
            fact*=i;
        }
        return fact;
    }
}