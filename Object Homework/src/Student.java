public class Student {

    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Aram", 20, 90.5);
        Student student2 = new Student("Anna", 17, 85.0);
        Student student3 = new Student("David", 18, 95.0);

        student1.printInfo();
        System.out.println("Adult: " + student1.isAdult());

        System.out.println();

        student2.printInfo();
        System.out.println("Adult: " + student2.isAdult());

        System.out.println();

        student3.printInfo();
        System.out.println("Adult: " + student3.isAdult());
    }
}