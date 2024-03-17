public class CoreStringCrafter {

    public static void main (String [] args) {
        //String is immutable
        String name = "sree";
        String wish = "welcome ";
        wish.concat(name);
        System.out.println(wish);
        /*  This operation will not manipulate the original string wish. It's immutable
            we have to assign the value to a variable to get it. or to same variable
         */
        wish = wish.concat(name);
        System.out.println(wish);

        //String buffer and String builder are mutable
        StringBuffer helloString = new StringBuffer("hello..");
        helloString.append(" cheechu");
        System.out.println(helloString); //output  - hello.. cheechu

        helloString.insert(2, "AAAA");
        System.out.println(helloString); //output  - heAAAAllo.. cheechu

        helloString.replace(7, 10, "SSSS");
        System.out.println(helloString); //output  - heAAAAlSSSS. cheechu

        helloString.replace(11, 11, "RRRR");
        System.out.println(helloString); //output  - heAAAAlSSSSRRRR. cheechu

        helloString.delete(18, 22);
        System.out.println(helloString); //output  - heAAAAlSSSSRRRR. chu

        helloString.deleteCharAt(19);
        System.out.println(helloString); //output  - heAAAAlSSSSRRRR. ch

        helloString.reverse();
        System.out.println(helloString); //output  - hc .RRRRSSSSlAAAAeh


        /*  We can do the same thing with String builder. the only diff is :-String Buffer is thread safe,
            String builder is not thread safe, non synchronised, so it's faster
            If it's parellel testing, choose string bugger. Other wise String builder is better
         */

        StringBuilder nameString = new StringBuilder("john");
        nameString.append(" snow");
        System.out.println(nameString); //output  - hc .RRRRSSSSlAAAAeh

        //All other operations mentioned earlier can be performed


    }
}
