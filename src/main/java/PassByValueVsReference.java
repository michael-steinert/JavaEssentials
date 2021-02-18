public class PassByValueVsReference {
    public static void main(String[] args) {
        System.out.println("Passing by Value");
        int x = 0;
        int y = incrementValueAsPrimitiveType(x);
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println("Passing by Reference");
        Number number = new Number(42);
        incrementValueAsReferenceType(number);
        System.out.println("Number: " + number.x);
    }

    // Passing by Value, if passing a Primitive Type, it will be copied in the new Scope as a new Variable
    static int incrementValueAsPrimitiveType(int value) {
        return value + 1;
    }

    // Passing by Reference, if passing a Reference Type, it will be used the same Reference in the new Scope
    static void incrementValueAsReferenceType(Number number) {
        number.x = number.x + 1;
    }

    static class Number {
        Integer x;

        public Number(Integer x) {
            this.x = x;
        }
    }
}
