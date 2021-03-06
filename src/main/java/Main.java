public class Main{
    public static void main(String[] args) {
        //Mnemonics
        //CAIM
        ReturnOnlyOneThing returnOnlyOneThing=(something, eve)->(something>eve);
        System.out.println(returnOnlyOneThing.saySomething(13, 12));
        returnOnlyOneThing.bookBorrowed();
        System.out.println(returnOnlyOneThing.addSome(1,2));
        AnotherClassThatNeedsLambda anotherClassThatNeedsLambda = new AnotherClassThatNeedsLambda();
        System.out.println(anotherClassThatNeedsLambda.findGreaterthanOrEqualTo(returnOnlyOneThing, 5, 5));
    }
}