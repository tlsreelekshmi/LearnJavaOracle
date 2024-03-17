import abstraction.ParentCompanyClass;
import inheritance.ParentClass;

class hybridInheritance extends parentClass{
    /* Single level inheritance : parent -> child
       Multi level inheritance - > parent -> child -> grant child
       hierarchical inheritance -> parent -> child1, parent -> child2
       4th category - hybrid inheritance - Hybrid inheritance combines multiple types of inheritance
       (single, multi-level, or hierarchical) within a single program.
       hybrid inheritance can be achieved through interfaces.
     */
    public static void main (String[] args) {
        hybridInheritance hybridInheritance = new hybridInheritance();
        hybridInheritance.printMe();
    }
}

class parentClass implements parentInterface {

    public void printMe() {
        System.out.println("I am implementing methods in parentInterface..");
    }
}

interface parentInterface {
    public void printMe();
}
