import java.util.Scanner;
class CircularPrimeRange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
           System.out.println("Enter the size");
        int no1=sc.nextInt();
         int no2=sc.nextInt();
         for(int i=no1;i<=no2;i++)
         {
               if(circularPrimeRange(i))
               {
                System.out.println(i);
               }
               
         }

    }
     public static boolean circularPrimeRange(int no)
     {
        int flag=0;
        int count=count(no);
        int restu=restu(count);
        for(int i=0;i<4;i++)
        {
            int rem=no%10;
            no/=10;
            no=rem*restu+no;
            if(prime(no))
            {
                flag=1;
                //return true;
            }
            else
            {
                //return false;
                flag=0;
               break;
            }

        }
        if(flag==1)
        {
            return true;
        }
        else
        {
            return false;
        }
         
     }
      public static int restu(int count)  
      {
        int restu=1;
        for(int i=1;i<count;i++)
        {
           restu*=10;
        }
        return restu;
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
    public static int count(int no)
    {
        int count =0;
        for(int i=no;i!=0;i/=10)
        {
            count++;
        }
        return count;
    }

}
        
       