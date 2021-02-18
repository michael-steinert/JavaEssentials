public class PrimitiveAndReferenceTypes {
    public static void main(String[] args) {
        System.out.println("Primitive Types");
        int x = 42;
        int y = x;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println("Changing Primitive Type");
        x = 12;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        Number numberX = new Number(42);
        Number numberY = numberX;

        System.out.println("Reference Types");
        System.out.println("NumberX: " + numberX.number);
        System.out.println("NumberY: " + numberY.number);

        System.out.println("Changing Reference Types");
        numberX.number = 12;

        System.out.println("NumberX: " + numberX.number);
        System.out.println("NumberY: " + numberY.number);
    }

    static class Number {
        Integer number;

        public Number(Integer number) {
            this.number = number;
        }
    }
}
