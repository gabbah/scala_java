package _1_basic._8_collections;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Transformations2 {
    public static void main(String[] args) {
        List<String> listOne = asList("a", "b", "c");
        List<Integer> listTwo = asList(1,2,3);

        // want to create a map from these two lists

        // .... ok just pull in a guava lib for this or..
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < listOne.size(); i++) {
            map.put(listOne.get(i), listTwo.get(i));
        }  // TODO: fix case where lists not equal length
    }
}
