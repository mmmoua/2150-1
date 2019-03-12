public class ExceptionCreatingTester2 {
    public void sayNick(String nick) {
        try {
            if ("fool".equals(nick))
                throw new FoolExceptionV2();

            System.out.println("Your nick name is " + nick);
        } catch (FoolExceptionV2 fe2) {
            System.out.println("FoolException is occurred");
        }
    }

    public static void main(String[] args) {

        ExceptionCreatingTester2 test = new ExceptionCreatingTester2();

        test.sayNick("fool");
        test.sayNick("Genius");
    }
}
