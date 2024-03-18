class MainClass {
    public static void main (String [] args) {
        SubClass subClass = new SubClass();
        subClass.printKingName();

        SonClass sonClass = new SonClass();
        /* Out put
        Execute parent class
        Execute child class
        since super() is there in the SonClass constructor, this calls father constructor first
         */

        KeralaState state = new KeralaState("Modi" , "pinarayi");

    }
}
class SuperClass {
    String king = "Danaerys";
}

class SubClass extends SuperClass {
    String king = "John snow";

    public void printKingName() {
        System.out.println("King in the north " + king); //King in the north John snow
        System.out.println("King of the 7 kingdoms " + super.king); //King of the 7 kingdoms Danaerys
    }
}

class FatherClass {
    FatherClass() {
        System.out.println("Execute parent class");
    }
}

class SonClass extends FatherClass {
    SonClass() {
        super();
        System.out.println("Execute child class");
    }
}

class IndianUnion {
    IndianUnion(String pmName) {
        System.out.println("Indian PM is " + pmName);
    }
}

class KeralaState extends IndianUnion {

    KeralaState(String pmName, String cmName) {
        super(pmName);
        System.out.println("Kerala CM is " + cmName);
    }
}