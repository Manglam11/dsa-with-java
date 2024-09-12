public class ChessPlayer {
    public static void main(String[] args) {
        Vazir v = new Vazir();
        v.moves();
        Babool b = new Babool();
        b.eats();
    }
}

/**
 * Herbivore
 */
interface Herbivore {

    void eats();
}

interface Carnivore {

    void eats();
}

class Babool implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("abhi sidha kahunga");
    }
}

interface Player {
    void moves();
}

class Vazir implements Player {
    public void moves() {
        System.out.println("sabhi kadam dhai ko chodh kar.");
    }
}

class Ooth implements Player {
    public void moves() {
        System.out.println("safed wala safed m");
    }
}

class Ghoda implements Player {
    public void moves() {
        System.out.println("dhai kadam");
    }
}
