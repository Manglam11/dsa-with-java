
/*public class ComplextNumber {

    public static void main(String[] args) {
        double real, imaginary;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter real part: ");
        real = sc.nextDouble();
        System.out.print("enter imaginary part: ");
        imaginary = sc.nextDouble();

    }
} */

class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car
        extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

public class ElectriCar extends Car {
    @Override
    public final String drive() {
        return "Driving electric car";
    }

    public static void main(String[] wheels) {
        final Car car = new ElectriCar();
        System.out.println(car.drive());
    }
}