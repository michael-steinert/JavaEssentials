public class AccessModifiers {
    public static void main(String[] args) {
        final String name = "Michael";
    }

    // Package-Protected, only accessible within the same Package
    static class Class1 {}

    // Public, Access is possible from all the Project
    public static class Class2 {}

    // Private, only accessible within the same Class
    private static class Class3 {}
}
