import java.util.Scanner;
class HappyNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int n=no;
         while(no!=1 && no!=4)
                 {
                    no=sum(no);
                 }
             if(no==1)
             {
                System.out.println("Given number is Happy number  "+n);
             }
           else
           {
                    System.out.println("Given number is not Happy "+n);
           }
        }
        public static int square(int no)
        {
           
            return no*no;
        }
        public static int sum(int no)
        {
            int sum=0;
            while(no!=0)
            {
                int rem=no%10;
                sum=sum+square(rem);
                no/=10;
            }
            return sum;
        }
    }
