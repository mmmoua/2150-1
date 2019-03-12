public class ExceptionCreatingTester3  {

    public void sayNick(String nick) throws FoolExceptionV2
    {
        if("fool".equals(nick))
            throw new FoolExceptionV2();

        System.out.print("Your nick name is " + nick + ".");
    }
    public static void main(String []args)
    {
        ExceptionCreatingTester3 test = new ExceptionCreatingTester3();
        try{
            test.sayNick("fool");
            test.sayNick("genius");
        }
        catch(FoolExceptionV2 fe2)
        {
            System.out.println("FoolException occurred");
        }
    }
}
