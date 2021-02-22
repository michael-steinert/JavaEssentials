package ObjectOrientedProgrammingConcepts;

public class OopMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Bruno");
        animals[1] = new Cat("Bud");
        for (int i = 0; i < animals.length; i++) {
            /* Achieving Compile-Time Polymorphism throw Overloading a Method by Arguments */
            System.out.println(animals[i].getName());
            System.out.println(animals[i].getName("Good Boy "));
            animals[i].makeNoise();
        }

        AnimalInterface[] animalInterfaces = new AnimalInterface[2];
        animalInterfaces[0] = new Dog("Bruno");
        animalInterfaces[1] = new Cat("Bud");
        for (int i = 0; i < animalInterfaces.length; i++) {
            /* Achieving Runtime Polymorphism throw Overriding a Method by Classes */
            animalInterfaces[i].makeNoise();
        }
    }
}
