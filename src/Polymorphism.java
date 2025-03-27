public class Polymorphism {

    public static void main(String [] args) {
        Animal a = new Animal("ian");
        Zebra z = new Zebra("dr t", false);

        a.eat(); //+1
        a.run(); //-50

        //overridden methods: for a zebra object,
        //sleep() and toString() are redefined to
        //have a different behavior than in Animal
        a.sleep(); //+15
        z.sleep(); //double

        System.out.println(a);
        System.out.println(z);

        //method specific to the zebra class
        z.attack();

        //Since an Animal isn't necessarily a zebra,
        //it can't access zebra-specific methods
        //a.attack();

        //can't access the parent class version of
        //a method from a client if it's been
        //overridden
        //z.super.sleep();

        //polymorphism - an object can have different types
        //do to the inheritance hierarchy
        //-methods can have different behaviors based on
        //whether they're overridden

        //declared type - Animal
        //actual type - Zebra
        Animal b = new Zebra("ryan", false);

        //doesn't work to declare as a child type
        // with an actual type of a parent class
        //Zebra z2 = new Animal("fdasfsa");

        //only have direct access to methods of the declared type
        b.run();
        b.eat();

        //if the method is overridden, it will run the version
        //defined in the child class
        b.sleep();

        //attack() is not a method in the declared type Animal
        //b.attack();

        //to call a method from the actual type, cast
        //the object to that type
        Zebra z2 = (Zebra) b;
        //can call attack from z2 bc the declared type of z2 is Zebra
        z2.attack();

        //same thing:
        ((Zebra)b).attack();

        //class cast exception - can't cast as a zebra
        //bc the actual type was Animal, not Zebra
        //Zebra z3 = (Zebra)a;

        //check the actual type before casting
        if (b instanceof Zebra) {
            Zebra z3 = (Zebra)b;
            System.out.println("casted as zebra");
        }
        else {
            System.out.println("actual type is not zebra");
        }

        //prevent the program from crashing by checking
        //the actual type before casting
        if (a instanceof Zebra) {
            Zebra z3 = (Zebra)a;
            System.out.println("casted as zebra");
        }
        else {
            System.out.println("actual type is not zebra");
        }

        //a2 and a3 are two separate objects
        //a3 and a4 are the same object as different var names
        Animal a2 = new Animal("greta");
        Animal a3 = new Animal("greta");
        Animal a4 = a3;

        // == checks whether the two objects are the same
        //object in memory
        // (not checking if two different objects have
        // the same instance var values)
        System.out.println("a2 == a3: " + (a2==a3));
        System.out.println("a3 == a4: " + (a3==a4));

    }
}
