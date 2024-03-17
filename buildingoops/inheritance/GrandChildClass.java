package inheritance;

public class GrandChildClass extends ChildClass {
    static int age = 3;
    public String name = "sree";
    public static String place = "muvattupuzha";

    public static void main(String [] args) {

        System.out.println(job); //Output - hostel warden. this variabble is in ChildClass
        System.out.println(place); //Output - lakshmi bhavan. this variabble is in ParentClass

        System.out.println(age); //out put - 3 (as grand child override child)
        System.out.println(ChildClass.age); //out put -  28
        System.out.println(ParentClass.age); //out put - 55
        //As everything is static, we can simply call by Classname.methodname

        GrandChildClass grandChildClass = new GrandChildClass();
        System.out.println(grandChildClass.name); //output - sree

        ChildClass childClass = new ChildClass();
        System.out.println(childClass.name); //output - latha

        ParentClass parentClass = new ParentClass();
        System.out.println(parentClass.name); //output - rajamma

        ParentClass parent = new GrandChildClass();
        System.out.println(parent.name); //output - rajamma as it refers to ParentClass
        // We can't use parent.place here as it can't access

        ChildClass child = new GrandChildClass();
        System.out.println(child.name); //output - latha as it refers to ChildClass
    }
}
