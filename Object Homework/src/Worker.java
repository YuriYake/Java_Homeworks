public interface Worker {

    void work();

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Programmer programmer = new Programmer();
        Driver driver = new Driver();

        teacher.work();
        programmer.work();
        driver.work();
    }
}

class Teacher implements Worker {

    @Override
    public void work() {
        System.out.println("Teacher is teaching");
    }
}

class Programmer implements Worker {

    @Override
    public void work() {
        System.out.println("Programmer is coding");
    }
}

class Driver implements Worker {

    @Override
    public void work() {
        System.out.println("Driver is driving");
    }
}