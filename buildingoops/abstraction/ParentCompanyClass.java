package abstraction;

public abstract class ParentCompanyClass {

    abstract void engine(); //all abstract methods are forced to implement in child class

    abstract void tyre();

    abstract void body();

    void companyLogo() {
        System.out.println("S");
    }

    void companyOwner() {
        System.out.println("Maruthi suzuki");
    }

}
