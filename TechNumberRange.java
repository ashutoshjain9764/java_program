import java.util.Scanner;
class TechNumberRange
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int no1=sc.nextInt();
            int no2=sc.nextInt();
            int i;
            for(i=no1;i<=no2;i++)
            {
                if(techNo(i))
                {
                    System.out.println(i);
                }
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
        public static boolean techNo(int no)
        {
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
                    return true;
                 }
                 else
                 {
                    return false;
                 }

             }
            else
            {
                    return false;
            }
        }
    }
