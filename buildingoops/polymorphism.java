import java.security.PublicKey;

class India {

//Method overriding

    public static String status = "UNION";
    public static String[] list() {
        return new String[] {"Union list", "Concurrent list"};
    }
}

class Kerala extends India {
    public static String[] list() {
        return new String[] {"State list", "Concurrent list"};
    }

    public static void main (String [] args) {

        System.out.println(status); //Output - UNION a method is parent class

        for (String list : list()) {
            System.out.print(list + ", "); //Output - State list, Concurrent list (overrides)
        }

    }
}

//Method overloading
class calculation {
    public static void main(String [] args) {
        printSum(5,6);
        printSum(5,6, 7);
    }

    public static void printSum(int a, int b) {
        System.out.println(a+b);
    }

    public static void printSum(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}
