import java.util.Scanner;
class DisariumNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int value=sc.nextInt();
        int i,count=0,sum=0;
        int tem=value;
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
           else
           {
            System.out.println("The given number is  not Disarium "+tem);
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
}