import java.util.Scanner;
class CubeRoot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int no=sc.nextInt();
         float min=min(no);
          float max=min+1;
          float avg;
          if((min*min*min)==no)
          {
                  System.out.println("Perfect Square "+no+ " root :- "+min);
                    
          }
          else
          {
                  avg=(min+max)/2;
                  while(true)
                  {
                    if((avg*avg*avg)==no)
                    {
                        System.out.println("Perfect Square "+no+ " root :- "+avg);
                         break; 
                    }
                    else if((avg*avg*avg)>no)
                    {
                        max=avg;
                    }
                    else if((avg*avg*avg)< no)
                    {
                        min=avg;
                    }
                     avg=(min+max)/2;
                  }
          }
        }

        public static int min(int no)
        {
                  int i;
            for(i=1; ; i++)
            {
                if((i*i*i)==no)
                {
                    return i;
                }
                else if((i*i*i)>no)
                {
                     return i-1;
                }
             }
        }
 }  