public class AdeptVariablePrimer {
    public static void main (String [] args) {
        //Deals with declaration of variables, casting etc


        //swap variables with temp element
        int a = 3;
        int b = 4;

        int temp;

        temp =a;
        a =b; //now a is b and  is a
        b=temp;

        //swap without temp element
        a= a+b;
        b = a-b; //ie, a
        a = a -b;

        //swap string without temp element
        String f = "hi";
        String g = "hui";

        f = f + "_" + g;
        g = f.split("_")[0];
        f = f.split("_")[1];

    }
}
