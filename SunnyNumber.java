import java.util.Scanner;
class SunnyNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n1=sc.nextInt();
         int n2=n1+1;
         int flag=0;
        for(int i=1;i<n2;i++)
        {
            if((i*i)==n2)
            {
                flag=1;
            }
        }
            if(flag==1)
             {
                System.out.println("Given number is sumnny"+n1);
            }
            else
             {
                System.out.println("Given number is not sumnny"+n1);
            }
        }
    }
