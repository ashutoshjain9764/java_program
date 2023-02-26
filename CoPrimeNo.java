import java.util.Scanner;
 class CoPrimeNo
 {
    public static  void main(String[]args)
    {
          int no1,no2,i;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Two  No");
          no1=sc.nextInt();
          no2=sc.nextInt();
          int min=no1<no2?no1:no2;
          while(min>1)
          {
             if( (no1%min==0) && (no2%min==0) )
                 {
                
                    break;
                 }
                 min--;
               
             }
             if(min==1)
             {
                System.out.println("The given number is Coprime");
             }
             else
              {
                System.out.println("The given number is not  Coprime");
             }
          }
    }
  