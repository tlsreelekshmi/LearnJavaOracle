package abstraction;

public class BikeFeatures extends ParentCompanyClass{

    public static void main(String [] args) {
        BikeFeatures bikeFeatures = new BikeFeatures();
        bikeFeatures.body();
        bikeFeatures.engine();
        bikeFeatures.tyre();
        //all above methods are abstract in parent class and override in inhertited class
        bikeFeatures.companyLogo(); // a method inherited from parent class
        bikeFeatures.companyOwner(); // a method inherited from parent class
    }

    @Override
    void engine() {
        System.out.println("Bike's petrol engine");
    }

    @Override
    public void tyre() { //since abstract method is public, we should use public here
        System.out.println("bike 2 wheeler tyre");
    }

    @Override
    protected void body() { //since abstract method is protected, we should use either protected or public here
        System.out.println("bike's body");
    }
}
