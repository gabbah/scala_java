package _1_basic._9_java_interop;


import java.util.List;
import static java.util.Arrays.asList;
import static scala.collection.JavaConversions.*;

public class ImplicitConversions {
    private List<String> names;

    public ImplicitConversions(List<String> names) {
        this.names = names;
    }

    public static void main(String[] args) {
        List<String> tList = asList("Mats", "Johan");
        MyScalaClass scalaClass = new MyScalaClass(asScalaBuffer(tList));

        MyScalaClass scalaClass2 = MyScalaClass.apply(asList("Mats", "Johan"));
    }
}

