package _1_basic._6_pattern_matching;

import java.time.LocalDate;


public class Pattern_matching_1 {
    
    static class Mammal {
        private Integer age;

        public Mammal(Integer age) {
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }
    }
    
    static class Dog extends Mammal {
        private LocalDate lastVaccination;
        public Dog(Integer age, LocalDate lastVaccination) {
            super(age);
            this.lastVaccination = lastVaccination;
        }

        public LocalDate getLastVaccination() {
            return lastVaccination;
        }
    }
    
    static class Human extends Mammal {
        private String name;
        public Human(Integer age, String name) {
            super(age);
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    
    public static void printInfo(Object objectToPrint) {
        if (objectToPrint instanceof Dog) {
            Dog dog = (Dog) objectToPrint;
            System.out.println(dog.getLastVaccination());
        }
        if (objectToPrint instanceof Human) {
            Human human = (Human) objectToPrint;
            System.out.println(human.getName());
        }
    }

    public static void main(String[] args) {
        printInfo(new Dog(8, LocalDate.now()));
        printInfo(new Human(40, "Jens"));
    }
    
}
