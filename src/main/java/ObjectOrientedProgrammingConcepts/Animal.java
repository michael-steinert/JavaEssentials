package ObjectOrientedProgrammingConcepts;

public abstract class Animal implements AnimalInterface {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getName(String goodBoy) {
        return goodBoy + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
