public class StaticKeyword {
    public static void main(String[] args) {
        Person person1 = new Person("Michael");
        Person person2 = new Person("Marie");
        System.out.println(person1.name);
        System.out.println(person2.name);
        // The static Variable belongs to the Class Person, and not to the Instances themself
        System.out.println(Person.createdPersons);
    }

    static class Person {
        static int createdPersons = 0;
        String name;

        public Person(String name) {
            this.name = name;
            createdPersons++;
        }
    }
}
