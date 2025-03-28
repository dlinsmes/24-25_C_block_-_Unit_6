public class InheritanceArrays {
    public static void main(String [] args) {

        Animal [] herd = new Animal [5];
        herd[0] = new Animal("alexa");
        herd[1] = new BabyZebra();
        herd[2] = new Zebra("evan", false);
        herd[3] = new Animal("leo");
        herd[4] = new Animal("richard");


        for (int i = 0; i < herd.length; i++) {

            //all animal objects have the run() method
            herd[i].run();

            //if a method is overridden, that's the version
            //of the method that gets used
            herd[i].sleep();

            //attack() from zebra objects
            if (herd[i] instanceof Zebra) {
                //check if the object is a zebra, cast it, then call attack()
                Zebra z = (Zebra) herd[i];
                z.attack();
            }

            if (herd[i] instanceof BabyZebra) {
                //can cast and call method in the same line
                ((BabyZebra)herd[i]).complain();
            }



            System.out.println();
        }
    }
}
