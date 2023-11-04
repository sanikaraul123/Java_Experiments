public class ConstructorChaining {
    private String name;
    private int age;
    public ConstructorChainingDemo() {
        this("John Doe"); 
    }
    public ConstructorChainingDemo(String name) {
        this(name, 30);
    }
    public ConstructorChainingDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorChainingDemo person1 = new ConstructorChainingDemo();
        ConstructorChainingDemo person2 = new ConstructorChainingDemo("Alice");
        ConstructorChainingDemo person3 = new ConstructorChainingDemo("Bob", 25);

        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("Person 2:");
        person2.displayInfo();

        System.out.println("Person 3:");
        person3.displayInfo();
    }
}
