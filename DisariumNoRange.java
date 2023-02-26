import java.util.Scanner;
class DisariumNoRange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int val1=sc.nextInt();
        int val2=sc.nextInt();
         
          for(int i=val1;i<=val2;i++)
          {
            disarium(i);
          }
    }
    public static int power(int rem,int count)
    {
        int power=1;
        for(int i=0;i<count;i++)
        {
            power=power*rem;
        }
        return power;
    }

    public static void disarium(int value)
    {
        int tem=value;
         int i,count=0,sum=0;
         for(i=value;i>0;i/=10)
        {
            count++;
        }
              while(value>0)
              {
                int rem=value%10;
                sum=sum+power(rem,count);
                value/=10;
                count--;
              }
           if(sum==tem)
           {
            System.out.println("The given number is Disarium "+tem);
           }
      }
}