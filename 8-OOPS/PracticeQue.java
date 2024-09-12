public class PracticeQue {
    public static void main(String[] args) {
        /*
         * Vehicle v = new Car();
         * v.print1();
         * 
         * Vehicle v2 = new Vehicle();
         * v2.print();
         * 
         * 
         * System.out.print(Book.count + " ");
         * Book b1 = new Book(150);
         * Book b2 = new Book(250);
         * System.out.println(Book.count);
         * System.out.println(b1.Price());
         * System.out.println(Test.marks);
         */
        Test t = new Test();
        t.set_marks(98);
        t.changeB();
        System.out.print(Test.a + Test.b);
    }
}

// inheritance vehicle
class Vehicle {
    void print() {
        System.out.println("base class(vehicle)");
    }
}

class Car extends Vehicle {
    void print1() {
        System.out.println("derived class(car)");
    }
}

// book count

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }

    int Price() {
        return price;
    }
}

// set marks
class Test {
    static int marks;

    void set_marks(int marks) {
        this.marks = marks;

    }

    // changeB
    static int a = 10;
    static int b;

    static void changeB() {
        b = a * 3;
    }

}
