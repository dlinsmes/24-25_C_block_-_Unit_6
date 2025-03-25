//inheritance - java classes have a parent-child
//(superclass/subclass) relationship
//-the child class/subclass extends the parent/super class
//-the child class inherits (has access to) all public
//functionalities of the parent class (public methods and vars)
public class Zebra extends Animal {

    private boolean fear;

    public Zebra(String name, boolean f) {

        //since Zebra is an Animal, we need to initialize
        //the Animal portion of the object by calling
        //the parent class constructor using the keyword super()
        super(name);
        //make sure the args for the parent constructor match
        //how that constructor was defined

        //-calling super() needs to be the first line in the
        //child class constructor

        fear = f;
    }

    public void attack() {
        if (!fear)
            //name in the Animal class is no directly accessible
            //bc it's private - need to use the get method
            System.out.println(getName() + " attacked a rock");
        else
            System.out.println(getName() + " attacked a tree");
    }

    //when a zebra sleeps, the energy doubles

    //you can override a parent class method, which means you
    //redefine its behavior for the child class
    public void sleep() {

        //energy is private in Animal
        //energy = energy * 2;

        setEnergy( 2 * getEnergy() );

        System.out.println(getName() + " took a zebra nap and has " + getEnergy() + " energy");
    }

    public String toString() {
        //"super" is used to refer to the parent class version of a method
        return super.toString() + " and is a zebra. fear: " + fear;
    }
}
