public class Character {

    public void attack() {
        System.out.println("Character is attacking");
    }

    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Archer archer = new Archer();

        warrior.attack();
        archer.attack();
    }
}

class Warrior extends Character {

    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword");
    }
}

class Archer extends Character {

    @Override
    public void attack() {
        System.out.println("Archer attacks with a bow");
    }
}