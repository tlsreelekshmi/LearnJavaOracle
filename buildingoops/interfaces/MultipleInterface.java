package interfaces;

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class MyClass implements Interface1, Interface2 {

    public static void main (String [] args) {
        MyClass myClass = new MyClass();
        myClass.method1();
        myClass.method2();
    }

    public void method1() {
        System.out.println("Method of interface1 implemented...");
    }

    public void method2() {
        System.out.println("Method of interface2 implemented...");
    }
}
