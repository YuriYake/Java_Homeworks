public class Appliance {

    public void turnOn() {
        System.out.println("Appliance is turned on");
    }

    public static void main(String[] args) {

        WashingMachine washingMachine =
                new WashingMachine();

        Refrigerator refrigerator =
                new Refrigerator();

        washingMachine.turnOn();
        refrigerator.turnOn();
    }
}

class WashingMachine extends Appliance {

    @Override
    public void turnOn() {
        System.out.println("Washing machine is starting");
    }
}

class Refrigerator extends Appliance {

    @Override
    public void turnOn() {
        System.out.println("Refrigerator is cooling");
    }
}