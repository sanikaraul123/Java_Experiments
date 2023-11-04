class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}
class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new MyCheckedException("You must be at least 18 years old to proceed.");
            }
            // throw new MyUncheckedException("This is an unchecked exception.");
        } catch (MyCheckedException e) {
            System.err.println("Checked Exception Caught: " + e.getMessage());
        } catch (MyUncheckedException e) {
            System.err.println("Unchecked Exception Caught: " + e.getMessage());
        }
    }
}
