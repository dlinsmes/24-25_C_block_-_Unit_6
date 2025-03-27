public class Animal {

    private String name;
    private int energy;

    public Animal(String name) {
        this.name = name;
        energy = 2;
    }

    public String getName() { return name; }
    public int getEnergy() { return energy; }

    public void setEnergy(int newEnergy) { energy = newEnergy; }

    public void eat() {
        energy += 1;
        System.out.println(name + " ate a snack and has " + energy + " energy");
    }

    public void sleep() {
        energy += 15;
        System.out.println(name + " took a nap and has " + energy + " energy");
    }

    public void run() {
        energy -= 50;
        System.out.println(name + " went for a run and has " + energy + " energy");
    }

    //every class we write is a child class of the Java Object class
    //-the Object class defines toString to return mem address info
    //-when we don't define our own toString, it's still usable, but we
    //get the mem loc
    //-when we define (override) our own toString, we choose
    //the information that's returned for that class
    public String toString() {
        return name + " has " + energy + " energy";
    }

    //the java Object class defines equals() to return whether two objects have the same reference
    // (one object with different var names)
    //override equals() so you can define how two objects of this class are
    //determined to be the same
    //-two Animal objects are equal if they have the same name and same energy
    public boolean equals(Object o) {

        //since the param is type Object, check the actual type before casting
        if (o instanceof Animal) {
            //cast o to be an Animal object
            Animal other = (Animal)o;
            //check the name and energy values
            if (other.getName().equals(this.name) && other.energy == this.energy) {
                return true;
            }
        }
        //if the actual type, name, or energy don't match - the objects aren't equal
        return false;
    }
}
