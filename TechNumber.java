import java.util.Scanner;
class TechNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int i,count=0;
        for( i=no;i!=0;i/=10)
        {
            count++;
        }
        if(count%2==0)
           {
               int n=no;
                int den=power(count);
                int rem1=n%den;
                  int rem2=n/den;
                 int sum=rem1+rem2;
                 int square=square(sum);
                 if(no==square)
                 {
                    System.out.println("Given number Tech "+no);
                 }
                 else
                  {
                    System.out.println("Given number is not Tech "+no);
                 }

           }
           else
           {
                    System.out.println("Given number is not Tech ");
           }
        }
        public static int power(int count)
        {
            int power=1;
            for(int i=1;i<=count/2;i++)
            {
                power*=10;
            }
            return power;
        }
        public static int square(int no)
        {
           
            return no*no;
        }
    }
