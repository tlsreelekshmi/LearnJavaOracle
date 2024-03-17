package abstraction;

public class CarFeatures extends ParentCompanyClass{

    public static void main(String [] args) {
        CarFeatures carFeatures = new CarFeatures();
        carFeatures.body();
        carFeatures.engine();
        carFeatures.tyre();
        //all above methods are abstract in parent class and override in inhertited class
        carFeatures.companyLogo(); // a method inherited from parent class
        carFeatures.companyOwner(); // a method inherited from parent class
    }

    @Override
    void engine() {
        System.out.println("Car's's diesel engine");
    }

    @Override
    public void tyre() { //since abstract method is public, we should use public here
        System.out.println("Car's tyre");
    }

    @Override
    protected void body() { //since abstract method is protected, we should use either protected or public here
        System.out.println("Car's's body frame");
    }
}
