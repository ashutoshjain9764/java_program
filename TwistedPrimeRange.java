                                                        import java.util.Scanner;
class TwistedPrimeRange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int no1=sc.nextInt();
         int no2=sc.nextInt();
       for(int i=no1;i<=no2;i++)
       {
           if(TwistedPrimeRange(i))
           {
            System.out.println(i);
           }
       }
    }
    public static boolean TwistedPrimeRange(int no)
    {
        int rev=reverse(no); 
        if((prime(no)) && (prime(rev)))
              {
                return true;
               }
            else
            {
            return false;
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
     public static int reverse(int no)
    {
        int i,rev=0;
        for(i=no;i!=0;i/=10)
        {
           rev=rev*10+(i%10);
        }
     
        return rev;
      
    }

}
        
       