public class Exceptions {
    public static void main(String[] args) {
        /* Checked Exceptions are Exceptions that have to be handled in Compile Time */
        String nullString = null;
        try {
            System.out.println(nullString.toLowerCase());
        } catch (NullPointerException exception) {
            System.out.println("String is null");
        }

        /* Unchecked Exceptions are Exceptions that have to be handled in Runtime */
        int result = 10;
        try {
            result = result / 0;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Number cannot be divided by 0");
            throw new MyException("Number cannot be divided by 0");
        }
    }

    static class MyException extends RuntimeException {
        public MyException(String message) {
            super(message);
        }
    }
}
