public class BabyZebra extends Zebra{
    private boolean tall;

    public BabyZebra() {
        //call the parent class constructor for
        //zebra by using "super()"
        super("baby zebra" , true);
        tall = false;
    }

    public void complain() {
        System.out.println("feed me i'm hungry");
    }

    //can override a method from two levels of classes up
    public void eat() {
        System.out.println("yummy rocks");
    }

    public boolean equals(Object o) {
        if (o instanceof BabyZebra) {
            BabyZebra other = (BabyZebra) o;
            //super.equals() uses the Zebra class equals()
            //to check name, energy, fear
            if (super.equals(other) && this.tall == other.tall) {
                return true;
            }
        }
        return false;
    }
}
