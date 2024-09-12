public class Inheritance {
    public static void main(String[] args) {

    }

    class Animal {
        String name;

        void migrate() {
            System.out.println("migrates");
        }

        void fight() {
            System.out.println("fights");
        }
    }

    class Fish extends Animal {
        void underwaterBreating() {
            System.out.println("under water breating");
        }

        void wander() {
            System.out.println("wander in 3d");
        }
    }

    class Pirana extends Fish {
        void bites() {
            System.out.println("bites very deadly");
        }

        void blood() {
            System.out.println("bloddy bascket");
        }
    }

    class Shark extends Fish {
        void king() {
            System.out.println("king of water");
        }

        void humanAttacks() {
            System.out.println("insano ki bhakcahk");
        }
    }

    class Bird extends Animal {
        String wings = "2 wings";

    }

}
