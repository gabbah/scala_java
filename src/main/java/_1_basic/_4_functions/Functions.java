package _1_basic._4_functions;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Functions {
    
    public static Integer ageSum(List<Person> persons, Function<Person, Integer> someFunction) {
        // implementation here...
        return 0;
    }
    
    public static Function<Person, Integer> above18 = (Person p) -> p.getAge() >= 18 ? p.getAge() : 0;

    
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        Integer sum = ageSum(persons, above18);
    }
    
    
    class Person {

        Integer age;

        public Person(Integer age) {
            this.age = age;
        }
        public Integer getAge() {
            return age;
        }


    }
}
