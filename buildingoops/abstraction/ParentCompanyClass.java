package abstraction;

public abstract class ParentCompanyClass {

    abstract void engine(); //all abstract methods are forced to implement in child class

    public abstract void tyre();

    protected abstract void body();

    void companyLogo() {
        System.out.println("**S**"); //this is concrete method (ie, not abstract)
    }

    void companyOwner() {
        System.out.println("Maruthi suzuki");
    }

    /* Abstraction - methods can be  protected , public, default
    and methods to be implemented should be abstract methods

    But in interfaces, strictly public
     */

}
