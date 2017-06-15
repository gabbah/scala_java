package _1_basic._8_collections;


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Transformations {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> list = Stream.generate(() -> generateRandomString(random, 3)).limit(8).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(prepend(list, "000"));
        
    }
    
    private static List<String> prepend(List<String> list, String prefix) {
        return list.stream().map(s -> prefix + s).collect(Collectors.toList());
    }


    // roll your own or import apache RandomStringGenerator or other external lib
    private static String generateRandomString(Random random, int length){
        return random.ints(48,122)
                .filter(i-> (i<57 || i>65) && (i <90 || i>97))
                .mapToObj(i -> (char) i)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
