public class CoreMultiDimArrayWrapper {
    public static void main (String [] args) {
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
        intMatrix [2][2] = 1;

        //how to print elements in a matrix ?
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                int element = intMatrix[i][j];
                System.out.print(element + " ");
            }
            System.out.println("");
        }

        //or we can initialise while declaring like this
        int [][] integerMatrix = new int[][] {{2,7,3}, {5,8,2}, {6,9,1}};

        //how to find the number of rows and coloums of a matrix
        int rows = integerMatrix.length;
        int cols = integerMatrix[0].length; //take first row and get it's length

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                int element = intMatrix[i][j];
                System.out.print(element + " ");
            }
            System.out.println("");
        }

        //This is how string multi dimensional arrays looks like !!
        String [][] srr = new String[2][3];
        srr[0][0] = "apple";
        srr[0][1] = "orange";
        srr[0][2] = "plum";
        srr[1][0] = "red";
        srr[1][1] = "orange";
        srr[1][2] = "pink";

        for (String[] rowValues : srr) {
            for (String strings : rowValues) {
                System.out.println(strings);
            }
        }

        //print smallest number in a matrix. let's take integerMatrix
        int min = integerMatrix[0][0];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                int num = integerMatrix[i][j];
                if (num < min) {
                    min = num;
                }
            }
        }
        //System.out.println("Minimum value from the matrix : " + min);

        //First write the above code to find minimum number
        int minNum = integerMatrix[0][0];
        int minNumRow = 0;
        for (int i=0; i<rows; i++) { //to find min number and it's row
            for (int j=0; j<cols; j++) {
                int num = integerMatrix[i][j];
                System.out.println("number " + num);
                if (num < minNum) {
                    minNum = num;
                    minNumRow=i;
                    System.out.println("a min num found in row - " + minNumRow);
                }
            }
        }
        System.out.println("Minimum value : " + minNum);
        System.out.println("min num row - " + minNumRow);
        int maxNumInRow = 0;
        for (int z=0; z<cols; z++) {
            int number = integerMatrix[minNumRow][z];
            if (number > maxNumInRow) {
                maxNumInRow = number;
            }
        }
        System.out.println("max number in row with minimum number - " + maxNumInRow);


    }
}
