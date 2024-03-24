package interfaces;

interface Interface1 {
    void method1();
    default void method3() {
        System.out.println("Method of interface1 implemented...");
        //These default methods are added after java 8, allows constructor to have non abstract methods
    }

    private void privateMethodInInterface() {
        System.out.println("Method of interface1 implemented...");
        //These private methods are added after java 9, allows interface to use it within it
    }

    static String variable = "Interface allows static methods now after java 9.";
}

interface Interface2 {
    void method2();
}

class MyClass implements Interface1, Interface2 {

    public static void main (String [] args) {
        MyClass myClass = new MyClass();
        myClass.method1();
        myClass.method2();
        myClass.method3(); //calling default method in interface
    }

    public void method1() {
        System.out.println("Method of interface1 implemented...");
    }

    public void method2() {
        System.out.println("Method of interface2 implemented...");
    }
}
