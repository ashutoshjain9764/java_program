import java.util.Scanner;
class SquareRoot1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        for(int i=no1;i<=no2;i++)
        {
            squareRoot(i);
        }
       
        }

        public static void squareRoot(int no)
        {
             double i;
            for(i=1; ; i++)
            {
                if((i*i)==no)
                {
                    System.out.println("Perfect Square "+no+ " root :- "+i);
                    break;
                }
                else if((i*i)>no)
                {
                    i=i-0.5;
                    double n=no/i;
                    double sqr=(n+i)/2;
                    System.out.println("Perfect Square " +no+ " root :- "+sqr);
                    break;
                }
             }
        }
 }  