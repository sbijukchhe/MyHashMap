/*
Create a map and store integers and their word values.
HashMap<Integer, String> myMap = new HashMap<Integer, String>();
Prompt user to enter a number and print out the word value.
Example:

Prompt: Enter a number: 10 Response: You entered ten.

If number is not found (use myMap.containsKey(10) then prompt user to tell the map to add that to the map.

Add the key and value to the map with the following line of code:

myMap.put(10,"ten");

Retrieve the value with

String value = myMap.get(10)

Next: Save the values to a file in the format:

10 ten
11 eleven
12 twelve
Then modify your program to load the class and populate the hashmap from the file. That way the user will not have
to enter a key/value pair twice.

Use the Scanner.nextInt() and Scanner.next() methods to return values in your file.

            File file = new File();
            scannerInput = new Scanner(file);//note that Scanner can read from a file!
            while (scannerInput.hasNextLine()) {
                String line = scannerInput.nextLine();
                System.out.println(line);
            }


One way of iterating through a HashMap....

Map map = new HashMap();

//iterating over keys only
for (Integer key : map.keySet()) {
    System.out.println("Key = " + key);
}

//iterating over values only
for (Integer value : map.values()) {
    System.out.println("Value = " + value);
}
Finally, your program should prompt the user for the value and print out the text.
Program Example:
https://github.com/dave45678/HashmapExample/blob/master/HashmapExample/src/HashmapApp.java
 */



import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyHashMap {

    public static void main(String[] args){

        int inNum;
        String inValue;

        Map<Integer, String> myMap = new HashMap<Integer, String>();
        System.out.println(myMap);
        myMap.put(1,"One");
        myMap.put(2,"Two");
        myMap.put(3,"Three");
        myMap.put(4,"Four");
        myMap.put(5,"Five");
        System.out.println(myMap);

        System.out.println("\nPlease enter a number: ");
        Scanner input = new Scanner(System.in);
        inNum = input.nextInt();

        if(myMap.containsKey(inNum)) {
            System.out.println("Key: " + inNum + "\tValue: " + myMap.get(inNum));
        }
        else {
            //add the key and value to the map
            System.out.println("\nSorry, value for this number is not found");
            System.out.println("Please enter value now");
            inValue = input.next();
            myMap.put(inNum, inValue);
            System.out.println("\n***** Here is your number and value ***** ");
            System.out.println("***** Key: " + inNum + "\tValue: " + myMap.get(inNum) + " *****");

        }

    }
}
