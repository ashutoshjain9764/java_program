import java.util.Scanner;
class UniqueNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int no=sc.nextInt();
         int  flag=1;
         int i,j;
        for(i=no;i>0;i/=10)
        {
            int rem=i%10;
            int count=0;
            for(j=no;j>0;j/=10)
            {
                int rem1=j%10;
                if(rem==rem1)
                {
                    count++;
                }
               
            }
            if(count==1)
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
            System.out.println("Given number is unique");
        }
        else
         {
            System.out.println("Given number is not  unique");
        }
    }
}