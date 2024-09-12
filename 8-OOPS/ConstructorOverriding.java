public class ConstructorOverriding {
    public static void main(String[] args) {
        Mustang m = new Mustang();
    }

}

abstract class Animals {
    String color;

    Animals() {
        color = "brown";
        System.out.println("Animal constructor called.");
    }

    // Non-abstract Methods
    void eats() {
        System.out.println("animal eats");
    }

    // Abstract Methods
    abstract void walk();
}

class Horse extends Animals {
    Horse() {
        System.out.println("Horse constructor called.");
    }

    void changeColor() {
        color = "black";
    }

    void walk() {
        System.out.println("walks on 4 legs.");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called.");
    }
}
