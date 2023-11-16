// need to figure out the structure of this, for code interviews, and or for ocp study, fluency of different options....
// different structure for each of the 3 above is required - decide as we go


 // remove an element using streams
        int filter = 4;
        int[] numbers = {1,2,3,4,5,6};
        int[] filteredNumbers = Arrays.stream(numbers)
                .filter(n -> n != 3)
                .toArray();
        Arrays.stream(filteredNumbers).forEach(System.out::print);


// remove element traditional
        int[] numbers = {0,2,3,7,5,6};
        int remove = 3;
        Arrays.stream(numbers).forEach(System.out::print);  // nice convert to stream and then out
        ArrayList<Integer> replace = new ArrayList<>();
        for(int i : numbers){
            if(i != remove)
                replace.add(i);
        }
        System.out.println(); // just making it tidy
        replace.forEach(System.out::print); // you can just run the forEach to print out as a shortcut


 // string test compiler funnies
            String a = "test";
            String b = "test";
            if(a == b){
                System.out.println("test succeeded but in theory should not");
            } // this executes due to compiler conserves space for string objects that
            // have the same contents
            String c = new String("test");
            String d = new String("test");
            if(c == d){
                System.out.println("better"); // this does not succeed as the string objects
                // are specifically created as new instance object variables
            }


// reverse string with StringBuilder reverse function class . - uses reverse()
            StringBuilder sb = new StringBuilder("dlkfjdlskjfldkjfl");
            sb.reverse();
            System.out.println(sb);


// reverse string without StringBuilder reverse function
            StringBuilder sb = new StringBuilder("dlkfjdlskjfldkjfl");
            StringBuilder sbr = new StringBuilder();
            System.out.println(sb);
            for(int i = sb.length()-1; i >= 0; i--)
                sbr.append(sb.charAt(i));
            System.out.println(sbr);


 // reverse string without StringBuilder reverse using tochararray
        String in = "alsdkjfflksdjflkdjfklj";
        System.out.println(in);
        StringBuilder sb = new StringBuilder();
        char[] ca = in.toCharArray();
        for(int i = in.length()-1; i >= 0; i--){
            sb.append(ca[i]);   // stange check against length of ca array causes issue with the loop??
        };
        System.out.println(sb);



