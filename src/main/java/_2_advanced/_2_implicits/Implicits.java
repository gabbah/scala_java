package _2_advanced._2_implicits;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Implicits {
    
    public static String clean(String name) {
        String[] splitOnWhiteSpace = name.trim().split("\\s+");
        return Stream.of(splitOnWhiteSpace).map(s -> 
                s.substring(0, 1).toUpperCase() + s.substring(1, s.length())
        ).collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(
                clean("  gabriel   klappenbach")
        );
    }
}
