public class StaticKeyWord {
    public static void main(String[] args) {
        Student s1 = new Student();
        /*
         * s1.schoolName = "SSM";
         * 
         * Student s2 = new Student();
         * System.out.println(s2.schoolName);
         * 
         * Student s3 = new Student();
         * s3.schoolName = "KV";
         * 
         * Horse h = new Horse();
         * System.out.println(h.color);
         */

        ConstructorChaining c = new ConstructorChaining();
        c.display();
        ;
    }
}

// static keyword
class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

// super keyword
class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "black";
        System.out.println("horse constructor called");
    }
}
// constructor chaining

class ConstructorChaining {
    int a;
    int b;

    // default construtor
    ConstructorChaining() {
        this(10, 20);
    }

    // parameterized construcor
    ConstructorChaining(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a + b);
    }
}