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

        int[] brr = new int[]{23,44,55,67,3,78,4};
        //Declare array and initialise all  together

        String [] crr = new String[] {"seena", "meena", "reenu", "kalyani"};
        for (String s : crr) {
            System.out.print(s + " ");
        }
        System.out.println("");

        //Print smallest number in the array brr
        int min = brr[0];
        for (int num : brr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("minimum value in the array : " + min);

        //Find sum of elements in an array drr
        int[] drr = new int[] {10,20,30,40,50};
        int sum = 0;
        for (int num : drr) {
            sum = sum + num;
        }
        System.out.println(sum);
        System.out.println(sum/drr.length);

        //Check if elements in array is sorted (Ascending or descending)
        int[] err = new int[] {100, 20, 10, 3, 4};
        boolean isAscending=false;
        for (int i=0; i<err.length-1; i++) { // check if array is ascending
            if (err[i] <= err[i+1]) {
                isAscending = true;
            } else {
                isAscending = false;
                break;
            }
        }
        boolean isDescending=false;
        for (int i=0; i<err.length-1; i++) { // check if array is descending
            if (err[i] >= err[i+1]) {
                isDescending = true;
            } else {
                isDescending = false;
                break;
            }
        }
        boolean isSorted = (isDescending || isAscending);
        System.out.println("is Array sorted ? " + isSorted);

        //Remove duplicates from an array
        int[] dupArray = new int[] {2, 3, 4, 5, 3, 3, 4, 5, 7, 8};
        int oldCount = dupArray.length;
        int newCount = oldCount;
        for (int i=0; i<oldCount; i++) {
            for(int j=i+1; j<oldCount; j++) {
                if (dupArray[i] == dupArray[j]) {
                    newCount--;
                    break;
                }
            }
        }
        System.out.println("newCount " +newCount);
        int [] tempArray = new int[newCount];
        int index=0;
        for (int k=0; k<oldCount; k++) {
            boolean isDuplicate = false;
            for (int l=k+1; l<oldCount; l++) {
                if (dupArray[k] == dupArray[l]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempArray[index] = dupArray[k];
                index++;
            }
        }
        dupArray = tempArray;
        for (int ele: dupArray) {
            System.out.print(ele + " ");
        }

        // Rotate the elements of an array to the right by 2 positions.
        String[] sree = new String[]{"minni", "cheechu", "sethu", "shalu", "kathu", "kallu"};
        String[] tempNames = new String[sree.length];
        int shift = 2;
        for (int i=0; i<sree.length; i++) {
            if (i < shift) {
                tempNames[i] = sree[i + sree.length - shift];
            } else {
                tempNames[i] = sree[i - shift];
            }
        }

        System.out.println("");

        for (String names : tempNames) {
            System.out.print(names + " ");
        }
        System.out.println("");

        // Find the longest and shortest strings in an array.
        int maxLength = 0;
        for (String s: sree) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        System.out.println("max length " + maxLength);
    }
}
