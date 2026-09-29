public class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public static void main(String[] args) {

        Dog dog = new Dog("Rex", 3);

        dog.makeSound();
        dog.bark();
    }
}

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("Woof!");
    }
}