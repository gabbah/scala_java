package _1_basic._8_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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


    }
}
