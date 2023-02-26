import java.util.Scanner;
class ArmStrongRange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int  no1=sc.nextInt();
        int  no2=sc.nextInt();
        for(int i=no1;i<=no2;i++)
        {
            if(armStrong(i))
            {
                System.out.println(i);
            }
        }
       
    }
    public static boolean armStrong(int no)
    {
         int sum=0;
         int restu=count(no);
         for(int i=no;i!=0;i/=10)
         {
            int rem=i%10;
            sum+=power(rem,restu);
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
    public static int power(int no,int restu)
    {
         int power=1;
        for(int i=0;i<restu;i++)
        {
            power*=no;
        }
        return power;
    }
     public static int count(int no)
    {
         int count=0;
        for(int i=no;i>0;i/=10)
        {
             count++;
        }
        return count;
    }
}