package homework_week_9;

import java.util.HashSet;

/**
 * Created by Jay Vaghani
 */
/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Programme_8_Hashset {
    public static void main(String[] args) {
        // create a Hashset object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();
        // add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // show which number between 1 and  10 are in the set
        for (int i = 1; i <= 10; i++){
            if (numbers.contains(i)){
                System.out.println(i + "is found in the set.");
            }else {
                System.out.println(i + "is not found in the set.");
            }
        }
    }
}
