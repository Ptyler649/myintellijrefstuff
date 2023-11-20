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


 // string test compiler funnies - discussion on immutability stack also heap memory
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
            sb.append(ca[i]);  // both in.length() and ca.length for the array need the additional -1 to work
        };
        System.out.println(sb);



// reverse string using Arrays and sort function Arrays.sort
        String[] stringArray = {"banana", "apple", "grape", "orange"};
        System.out.println("Original array: " + Arrays.toString(stringArray));
        // ascending order
        Arrays.sort(stringArray);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(stringArray));
        // descending order
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Sorted array in descending order: " + Arrays.toString(stringArray));



//reverse string using split with . “”
       String str = "dsflkjdfklfj";
       String[] strList = str.split("");
       for(int i = strList.length-1; i >= 0; i--){
           System.out.println(strList[i]);
       };


 //reverse string using split with . “” using streams
        String str = "dsflkjdfklfj";
        String[] strList = str.split("");
        List<String> reversedList = Arrays.stream(strList)
                .collect(Collectors.toList());
        Collections.reverse(reversedList);
        System.out.println(reversedList);


//reverse string using split with word using “ ” 
       String str = "the quick brown fox jumped over the lazy dog";
       String[] strList = str.split(" ");
       for(int i = strList.length-1; i >= 0; i--){
           System.out.println(strList[i]);
       };


//reverse string using split with . “” using streams
        List<String> reversedList = Arrays.stream(strList)
                        .collect(Collectors.toList());
        Collections.reverse(reversedList);
        System.out.println(reversedList);



// swap 2 numbers by only using a third variable .
        int a = 2;
        int b = 3;
        int temp;
        System.out.println("before"+a+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("after"+a+b);



// swap 2 numbers using only those 2 variables . +, -, - (`remember this pattern bab, abb, b-aa`)
        int a = 2;
        int b = 3;
        System.out.println("before:"+a+b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("after:"+a+b);



check if a number is prime . use /2 and % modula . hint - two loops with inner loop less than number being checked

roman numerals solution .  use hashmap as lookup and move right to left thru the numbers 

count occurences using hashmap . - use merge and entry 

sort list of strings using lambda . for strings → and then compareTo

sort list of numbers using lambda . for numbers no need for the compareTo

sort list of objects using lambda  . create comparators and then use those for method chaining, stream, sorted(add comparator, add .thenComparing, .collect collectors to list, separate stream to for each loop

- dont forget constructor to allow add new

      - dont forget to add get and setters and string overide to allow print out

- dont forget comparator and stream here and that :: is short hand for calling a classes method via its class name

sort list of objects by string and then number using lambda.

create a linked list and the switch values left to right if any value if the two numbers are odd ** use Collections.swap functionality. dual index starting at 0, and 1 with a break at 1 reaching size()

given a list of numbers return the 2 numbers that combine to make the given number

Write a Java Program to count the number of words in a string using HashMap  -uses merge and Entry concept

Write a Java Program to iterate HashMap using While and advance for loop
Write a Java Program to find whether a string or number is palindrome or not.
Write a Java Program for the Fibonacci series
Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop
Write a Java Program to find the duplicate characters in a string. -hashmap
Write a Java Program to find the second-highest number in an array - sort and then count back??
Write a Java Program to remove all white spaces from a string with using replace()
Write a Java Program to remove all white spaces from a string without using replace() - use split and loop

Write a program to convert List to Array
Using ArrayList class get() method (convert list to array)
Using ArrayList class toArray() method convert to object array (convert arraylist to object)
Using Arrays class copyOf() method convert object to string
check a value in a hashset using contains
convert linkedlist to arraylist
use remove method to remove an element within an arraylist
how to add an element to array list at particular indix using the add with index

also use leet code account

also make sure off the bat you can code the most common java interview questions, and fast

stretch these and make them more performant

useful techniques from leet code to practice

use the contains key from a hashmap to check for groups of elememts

use the pop and push for a Stack - Stack<Character> mystack = new Stack<>();

(the above combination can be powerful in solving some of these problems refernce the parethesis problem as an example

also stack.isEmpty() can be usefull

two sorted linked lists to be merged - 1 solution, use isEmpty while loop on both lists, checking if first elements are smaller than the other and then adding to merge list the smaller, and continueing, making sure at the end to check if any list is empty and then just at the rest, but another answer is stream concat the both lists, and then sort and output

for add / remove element - two pointer approach is a good one, where u just overwrite based on the condition = true

also ** useful find was to navigate in eclipse to file and right mouse click and replace with to get prior history if u accidental remove something

good to note - checking a string for null do these both needle == null || needle.length() == 0 as

this copes both with null and “” which is a single unknown character

design patterns examples

singleton - db driver to customer is real life example, downside be careful once down this rabbit whole you have to keep it that way

fascade - compiler restricts to provide specific perfections, downside leakage

bridge - Abstract interface and link out to other implementations e.g db out to mongo/sql server - downside is dont overuse this

strategy - containing logic into a single strategy, default strategies - downside

observer - pub / sub pattern - loose coupling from publisher to subscribers, downside you can over board on this pattern easily.