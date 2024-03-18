public class ThisKeyword {

    int a = 10;

    public void printA() {
        int a = 5;
        System.out.println(a); //output - 5
        System.out.println(this.a); //output - 10 - class variable

        System.out.println(" Sum of local variable and global variable " + (a + this.a));// sum - 15
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword();
        thisKeyword.printA();
    }
}
