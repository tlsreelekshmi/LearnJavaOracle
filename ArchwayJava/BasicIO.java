import java.util.Scanner;

public class BasicIO {
    //To Learn basic input and output in java

    public static void main (String [] args) {
        //Print something
        System.out.println("Hello....!!!");

        //scan a string, save to a string and print
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello... " + name + "!!!");

        //scan integer, character etc.
        int date = sc.nextInt(); //scan an integer
        System.out.println("Today's date is... " + date + "!!!");

        System.out.println(sc.hasNext());
    }
}
