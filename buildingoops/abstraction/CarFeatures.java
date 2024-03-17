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
    void tyre() {
        System.out.println("Car's tyre");
    }

    @Override
    void body() {
        System.out.println("Car's's body frame");
    }
}
