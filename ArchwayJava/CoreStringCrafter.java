public class CoreStringCrafter {
    public static void main (String [] args) {
        String s = "hello"; //String literal
        String sr = new String("hello"); // Creat object for string with string class

        /* both are correct, but when declare like later, it creates a new string. but no problem for both */

        //String methods
        String a = " java training";
        System.out.println(a.charAt(3)); //gives v
        System.out.println(a.indexOf("j")); // gives 1
        System.out.println(a.lastIndexOf("a")); // gives 8
        System.out.println(a.substring(3, 6)); // gives "va t"
        System.out.println(a.substring(5)); // gives "training"
        System.out.println(a.concat(" programme")); // " java training rahul teaches"
        System.out.println(a.length()); //gives 14
        System.out.println(a.trim()); //gives "java training"

        String b = "Java Training for Freshers";
        System.out.println(b.toUpperCase()); //gives "JAVA TRAINING FOR FRESHERS"
        System.out.println(b.toLowerCase()); //gives "javq training for freshers"

        //split
        String arr[]=b.split("a");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(a.replace("t", "$")); //java sraining
        System.out.println(a.replace("a", "@")); // jQvQ trQining

        /* Problems related to string reversing*/
        //reverse a string easily
        String hello = "Hi,, how are you!!!";
        int leftIndex =0;
        int rightIndex = hello.length() - 1;
        char[] helloChars = new char[hello.length()];
        while (leftIndex <= rightIndex) {
            char leftChar = hello.charAt(leftIndex);
            char rightChar = hello.charAt(rightIndex);
            helloChars[leftIndex] = rightChar;
            helloChars[rightIndex] = leftChar;
            leftIndex++;
            rightIndex--;
        }

        String finalString = new String(helloChars);
        System.out.println("Reversed string - " + finalString);

        //reverse a string more easily
        String easyMethod = "Malayalam";
        String tempo = "";
        for (int i=easyMethod.length()-1 ; i>=0; i--) {
            String t = String.valueOf(easyMethod.charAt(i));
            tempo = tempo + t;
        }
        System.out.println("easily reversed string " + tempo);

        //how to check if it is palindrome ? - just check if tempo = easyMethod
        System.out.println("is the string palindrome ? " + easyMethod.equalsIgnoreCase(tempo));

        //reverse the string but keep special characters in place
        String mainString = "Hi, there:)";
        // expected result-  er, ehtiH:)

        int total = mainString.length();
        char [] charArray = new char[total];
        for (int i=0; i<total; i++) {
            char charvalue = mainString.charAt(i);
            if (!String.valueOf(charvalue).matches("[a-zA-Z]")) {
                charArray[i] = charvalue;
            }
        }
        for (int i=0; i<total; i++) {
            char charvalue = mainString.charAt(i);
            if (String.valueOf(charvalue).matches("[a-zA-Z]")) {
                int position = total-1;
                while(charArray[position] != '\0') {
                    position--;
                }
                charArray[position] = charvalue;
            }
        }
        mainString = "";
        for (char c : charArray) {
            mainString = mainString + c;
        }
        System.out.println("Reversed string with spl chars " + mainString);

        //Twist!!! - Simplified code
        String specialString = "Hi, there:)";
        char[] arrayOfChars = specialString.toCharArray();
        int left = 0;
        int right = arrayOfChars.length - 1;

        while (left < right) {
            if (!Character.isLetter(arrayOfChars[left])) {
                left++;
            } else if (!Character.isLetter(arrayOfChars[right])) {
                right--;
            } else {
                char temp = arrayOfChars[left];
                arrayOfChars[left] = arrayOfChars[right];
                arrayOfChars[right] = temp;
                left++;
                right--;
            }
        }

        specialString = new String(arrayOfChars);
        System.out.println("Reversed string with special chars in place: " + specialString);




    }
}
