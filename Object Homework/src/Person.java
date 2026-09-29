public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Person person1 = new Person("Aram", 20);
        Person person2 = new Person("Anna", 22);

        person1.printInfo();

        System.out.println();

        person2.printInfo();
    }
}