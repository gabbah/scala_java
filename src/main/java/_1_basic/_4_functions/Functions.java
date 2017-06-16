package _1_basic._4_functions;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Functions {
    
    public static Integer ageSum(List<Person> persons, Function<Person, Integer> someFunction) {
        return persons.stream().map(someFunction).mapToInt(i -> i).sum();
    }
    
    public static Function<Person, Integer> above18 = (Person p) -> p.getAge() >= 18 ? p.getAge() : 0;

    
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(30));

        Integer sum = ageSum(persons, above18);
        System.out.println(sum);
    }
    
    
    static class Person {

        Integer age;

        public Person(Integer age) {
            this.age = age;
        }
        public Integer getAge() {
            return age;
        }


    }
}
