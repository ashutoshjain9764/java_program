import java.util.Scanner;
class HarshadNumber
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the num=");
       int no=sc.nextInt();
       if(buzzNumber(no))
       {
      System.out.println(no);
       }
    }
   public static int sum(int no)
   {
    int sum=0;
    while(no!=0)
    {
         sum+=no%10;
         no/=10;
    }
    return sum;
   } 
   public static boolean buzzNumber(int no)
   {
       int sum=sum(no);
       if(no%sum==0)
       {
        return true;
       }
       else
        {
           return false;
       }
   }
}