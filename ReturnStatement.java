class ReturnStatement
{
    public static void main(String args[])
    {
           demo();
            System.out.println(sum());
    }
    public static void demo()
    {
        System.out.println("Hello World");
        return ;
    }
    public static int sum()
    {    int a =1;
       
        return 1; // it passes value ,variable ,Expression
       /// int b; compile time error
    }
}