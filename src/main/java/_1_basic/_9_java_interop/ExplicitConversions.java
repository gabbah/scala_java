package _1_basic._9_java_interop;

import java.util.List;
import static java.util.Arrays.asList;
import static scala.collection.JavaConverters.*;

public class ExplicitConversions {
    private List<String> names;

    public ExplicitConversions(List<String> names) {
        this.names = names;
    }

    public static void main(String[] args) {
        MyScalaClass scalaClass = new MyScalaClass(asScalaBuffer( asList("Mats", "Johan")));
        
        MyScalaClass scalaClass2 = MyScalaClass.apply(asList("Mats", "Johan"));
    }
}
