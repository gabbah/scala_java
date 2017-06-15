package _1_basic._8_collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class InitCollections {
    public static void main(String[] args) {

        List<Integer> numbers = asList(1,2,3,4,5);
        List<Integer> empty = Collections.emptyList();
        Map<Object, Object> emptyMap = Collections.emptyMap();

        numbers.add(1);         // throws UnsupportedOperationException
        empty.add(1);           // throws UnsupportedOperationException 
        emptyMap.put("", "");   // throws UnsupportedOperationException 
        // ... oops.. so we have to:
        List<Integer> numbers2 = new ArrayList<>(asList(1,2,3,4,5));
        numbers2.add(1); // works
        
        // java 8
        List<Integer> collect = Stream.of(1, 2, 3).collect(Collectors.toList());  // creates modifiable list



        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        // or use guava or some other external lib
        
    }
}
