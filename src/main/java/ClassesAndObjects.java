public class ClassesAndObjects {

    public static void main(String[] args) {
        // An Object is the Representation of a real Thing
        Person person = new Person("Michael");
        System.out.println(person);
    }

    // Class is a Blueprint for Creating multiple Objects
    static class Person {
        String name;
        int age;
        Gender gender;

        public Person(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public Person(String name) {
            this(name, 26, Gender.MALE);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender.getGender() + '\'' +
                    '}';
        }
    }

    static enum Gender {
        MALE("m"), FEMALE("f");

        private String gender;

        Gender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return gender;
        }
    }
}
