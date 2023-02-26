import java.util.Scanner;
class HappyNoRange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int val1=sc.nextInt();
        int val2=sc.nextInt();
         
          for(int i=val1;i<=val2;i++)
          {
               int no=sum(i);
               while(no!=1 && no!=4)
               {
                    no=sum(no);
               }
               if(no==1)
               {
                System.out.println("HAppy number is :- "+i);
               }
               else
                 {
                System.out.println("sad  number is :- "+i);
               }
          }
    }

    public static int sum(int value)
    {
      
         int i,sum=0;
         while(value>0)
              {
                int rem=value%10;
                sum=sum+rem*rem;
                value/=10;
             }
           return sum;
      }
}