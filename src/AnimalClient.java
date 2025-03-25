public class AnimalClient {
    public static void main(String [] args) {

        Animal blah = new Animal("ian");
        blah.eat();
        blah.sleep();
        blah.run();
        System.out.println(blah);

        Zebra z = new Zebra("chris", true);

        //since Zebra is a child class of Animal,
        //it has access to the public methods of Animal
        z.eat();
        z.run();
        z.attack();

        //Animal objects don't have access to child class methods
        //-a zebra is an animal, but an animal isn't necessarily a zebra
        //blah.attack();

        //this runs the overriden version of sleep defined
        //in zebra
        z.sleep();

        //(if you don't override sleep() in zebra, it runs the Animal version of sleep())
        System.out.println(z);
    }
}
