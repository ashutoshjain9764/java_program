import java.util.Scanner;
class PrimeNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int no1=sc.nextInt();
        int no2=sc.nextInt();
         for(int i=no1;i<=no2;i++)
        {
            if(prime(i))
            {
               System.out.println(i);
            }
        }
    }
    public static boolean prime(int no)
    {
        int i;
        for(i=2;i<no;i++)
        {
            if(no%i==0)
            {
                return false;
            }
        }
     
        return true;
      
    }

}
        
       