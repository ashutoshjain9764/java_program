import java.util.Scanner;
class LeapYear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year1=sc.nextInt();
        int year2=sc.nextInt();
        for(int i=year1;i<=year2;i++)
        {
              if(leapYear(i))
            System.out.println(i);
        }
              
           
    }
    public static boolean  leapYear(int no)
    {
       
         if(((no%4==0)&&(no%100!=0))||(no%400==0))
         {
           return true;
         }
         return false;
    }

}
        
       