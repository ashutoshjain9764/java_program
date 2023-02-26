import java.util.Scanner;
class CountNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int no=sc.nextInt();
        int i,j;
        int  flag=1;
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
           
           if(count>=1)
           {
            
            System.out.println("THe duplicate number of  "+rem+" count is "+count);
           }
           
        }
        
    }
}