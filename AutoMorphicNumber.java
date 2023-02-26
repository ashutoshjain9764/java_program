import java.util.Scanner;
class AutoMorphicNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int  no=sc.nextInt();
       
        autoMorphic(no);
    }
    public static void autoMorphic(int no)
    {
         int count=0;
        for(int i=no;i>0;i/=10)
        {
             count++;
        }
         int square=square(no);
        int restu=power(count);
         int rem=square%restu;
        
         if(rem==no)
         {
            System.out.println("tThe Given Number is automorphic "+no);
         }
         else
          {
            System.out.println("tThe Given Number is not  automorphic  "+no);
         }

    }
    public static int square(int no)
    {
           return no*no;
    }
    public static int power(int count)
    {
        int power=1;
        for(int i=1;i<=count;i++)
        {
            power*=10;
        }
        return power;
    }
}