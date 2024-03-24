class BasicConstructor {

    public static void main (String [] args) {
        NormalClass normalClass = new NormalClass();
        normalClass.getData();

        SimpleConstructerClass simpleConstructerClass = new SimpleConstructerClass();
        /*When the class runs gets - this output "this is a simple constructor"
            Even if we do not call a method, the default constructor runs when object creates form the class
         */

        ParameterizedConstructorClass paraClass = new ParameterizedConstructorClass();
        System.out.println("Exam - " + paraClass.exam); //output - Exam - upsc
        System.out.println("Candidate name - " + paraClass.candidate); //output - null (variable not initialised via constructor)

        ParameterizedConstructorClass paraConClass = new ParameterizedConstructorClass("sreeja", 19);
        System.out.println("Candidate name - " + paraConClass.candidate); //output - sreeja
        System.out.println("Candidate age - " + paraConClass.age); //output - 19
    }
}

class NormalClass {
    public void getData() {
        System.out.println("Printing method Data ... ");
    }
}

class SimpleConstructerClass {
    SimpleConstructerClass() {
        System.out.println("this is a simple constructor");
    }
}

class ParameterizedConstructorClass {
    ParameterizedConstructorClass() {

    }

    String exam = "upsc";

    String candidate;
    int age;
    ParameterizedConstructorClass(String name, int age) {
        this.candidate = name;
        this.age = age;
    }

}