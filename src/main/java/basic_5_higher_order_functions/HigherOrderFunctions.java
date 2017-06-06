package basic_5_higher_order_functions;

import basic_4_functions.Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class HigherOrderFunctions {
    
    public static Integer sumAdultPersonsAges(List<Person> persons, Predicate<Person> adultCalculator) {
        return persons.stream().filter(adultCalculator).mapToInt(p -> p.age).sum();
    }
    
    public static Predicate<Person> isAdultCalculator = (Person p) -> p.age >= 18;

//    class Tuple<A, B> {
//        private final A elem1;
//        private final B elem2;
//
//        public Tuple(A elem1, B elem2) {
//
//            this.elem1 = elem1;
//            this.elem2 = elem2;
//        }
//
//        public A getElem1() {
//            return elem1;
//        }
//
//        public B getElem2() {
//            return elem2;
//        }
//    }



    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Integer sum = sumAdultPersonsAges(persons, isAdultCalculator);
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
