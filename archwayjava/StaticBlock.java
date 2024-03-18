public class StaticBlock {

    static String name;
    static String place;
    static String state;

    static {
        name = "sree";
        place = "muvattupuzha";
        state = "kerala";
        //static keyword is mainly to optimize code and conclude all static variables
        System.out.println("Class is called so, variables are initialised");
        //Static block is helpful when defining steps that should run before main method

    }

    public static void main (String [] args) {
        //Even if nothing is executed, when the class runs, static block gets instantiated.
        System.out.println(name);
    }
}