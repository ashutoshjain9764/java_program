import java.util.Scanner;
class CircularPrimeNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter the size");
        int no=sc.nextInt();
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
            }
            else
            {
                flag=0;
                break;
            }

        }
        if(flag==1)
        {
            System.out.println("The given number is cicular prime");
        }
        else
        {
             System.out.println("The given number is  not cicular prime");
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
        
       