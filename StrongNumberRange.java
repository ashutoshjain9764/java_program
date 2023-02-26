import java.util.Scanner;
class StrongNumberRange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        for(int i=no1;i<=no2;i++)
        {
            if(strong(i))
            {
                System.out.println(i);
            }
        }
       
    }
    public static boolean strong(int no)
    {
         int sum=0;
         for(int i=no;i!=0;i/=10)
         {
            int rem=i%10;
            sum+=factorial(rem);
         }
         if(sum==no)
         {
            return true;
         }
         else
          {
             return false;
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