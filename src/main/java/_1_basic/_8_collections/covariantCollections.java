package _1_basic._8_collections;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class covariantCollections {
    static class Animal { public Animal shave() { return this;}}
    static class Cow extends Animal {}
    
    public static void main(String[] args) {
        List<Cow> cows = asList(new Cow(), new Cow());
        processAnimals(cows);  // doesn't compile: List<Cow> is not a subtype of List<Animal> !
    }
    
    public static List<Animal> processAnimals(List<Animal> animals) {
        return animals.stream().map(Animal::shave).collect(Collectors.toList());
    }
}
