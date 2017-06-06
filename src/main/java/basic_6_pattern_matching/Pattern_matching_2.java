package basic_6_pattern_matching;


import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class Pattern_matching_2 {

    /**
     * given two lists of numbers: 
     * - if both lists are non-empty, print the sum of both lists elements.
     * - else if either list is empty, print the second element of the other list (if it exists).
     * - else if boths lists are empty, print "both empty"
     */
    public static void printInfo(List<Integer> a, List<Integer> b) {
        if (!a.isEmpty() && !b.isEmpty()) {
            System.out.println( a.stream().mapToInt(i -> i).sum() + b.stream().mapToInt(i -> i).sum() );
        }
        else if (a.isEmpty() && !b.isEmpty()) System.out.println(getStringAtIndex(b, 1));
        else if (b.isEmpty() && !a.isEmpty()) System.out.println(getStringAtIndex(a, 1));
        else if (a.isEmpty() && b.isEmpty()) System.out.println("both empty");
    }

    // Returns empty string if the index is out of bounds
    private static String getStringAtIndex(List<Integer> list, int index) {
        return list.size() > index ? list.get(index).toString() : "";
    }

    public static void main(String[] args) {
        printInfo(asList(1, 3), asList(5, 7));
        printInfo(emptyList(), asList(5, 7));
        printInfo(asList(1, 3), emptyList());
        printInfo(asList(), asList());
    }
}
