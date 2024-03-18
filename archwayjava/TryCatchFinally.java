//one try can be followed by mutiplle catch blocks
//catch should be an immediate block after try

public class TryCatchFinally {

    public static void main(String[] args) {
        int b = 7;
        int c = 0;

        try {
            int k = b / c;
        } catch (ArithmeticException et) {
            System.out.println("I catched the Arthimetic/exception");
        } catch (IndexOutOfBoundsException ets) {
            System.out.println("I catched the IndexBound/exception");
        } catch (Exception e) {
            System.out.println("I catched the error/exception");
        } finally {
            System.out.println("delete cookies");//THis block is executed irrespective of exception thrown or not
        }
    }

}