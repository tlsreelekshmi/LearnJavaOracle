public class CoreArrayWrapper {

    public static void main (String [] args) {
        int arr[] = new int[5];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 9;
        arr[4] = 6;

        for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println("");
        arr[1] = 2;


        for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println("");
        System.out.println("Array length " + arr.length);

        int[] brr = new int[]{23,44,55,67,78,4};
        //Declare array and initialise all  together

        String [] crr = new String[] {"seena", "meena", "reenu", "kalyani"};
        for (String s : crr) {
            System.out.print(s + " ");
        }
        System.out.println("");

        //2 D array / matrix
        /*  ________________
            | 2  | 7  | 3  |
            | 5  | 8  | 2  |
            | 6  | 9  | 4  |
            ----------------
         */

        int [][] intMatrix = new int[3][3];
        intMatrix [0][0] = 2;
        intMatrix [0][1] = 7;
        intMatrix [0][2] = 3;
        intMatrix [1][0] = 5;
        intMatrix [1][1] = 8;
        intMatrix [1][2] = 2;
        intMatrix [2][0] = 6;
        intMatrix [2][1] = 9;
        intMatrix [2][2] = 4;

        //how to print elements in a matrix ?
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                int element = intMatrix[i][j];
                System.out.print(element + " ");
            }
            System.out.println("");
        }

        //or we can initialise while declaring like this
        int [][] integerMatrix = new int[][] {{2,7,3}, {5,8,2}, {6,9,4}};

        String [][] srr = new String[2][3];
        srr[0][0] = "apple";
        srr[0][1] = "orangle";
        srr[0][2] = "plum";
        srr[1][0] = "red";
        srr[1][1] = "orangle";
        srr[1][2] = "pink";

    }
}
