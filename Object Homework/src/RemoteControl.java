public interface RemoteControl {

    void turnOn();

    void turnOff();

    public static void main(String[] args) {

        Television television = new Television();
        AirConditioner airConditioner = new AirConditioner();

        television.turnOn();
        television.turnOff();

        System.out.println();

        airConditioner.turnOn();
        airConditioner.turnOff();
    }
}

class Television implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

class AirConditioner implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Air conditioner is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Air conditioner is OFF");
    }
}