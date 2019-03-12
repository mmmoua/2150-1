public class ExceptionCreatingTester {
    public void sayNick(String nick)
    {
        if("fool".equals(nick))
            return; // --> change this part into throw new FoolException()
        System.out.println("Your nick name is " + nick + ".");
    }

    public void saySam(String sam)
    {
        if("fool".equals(sam))
            throw new FoolException();

        System.out.println("Your nick name is " + sam);
    }

    public static void main(String [] args)
    {
        ExceptionCreatingTester test = new ExceptionCreatingTester();

        try {
            test.saySam("fool");
            test.saySam("Most valuable person");

        }catch(FoolException  fe)
        {
            System.out.println("Exception occurred"); 
        }
    }
}
