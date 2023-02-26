import java.util.Scanner;
class ReverseString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str2="";
        System.out.println("Enter the  String ");
        String str=sc.next();
      
        int i;
        for(i=0;i<str.length();i++)
         {
              str2+=str.charAt(i)+" ";
         }
       System.out.println(str2);
        }
        
    }
