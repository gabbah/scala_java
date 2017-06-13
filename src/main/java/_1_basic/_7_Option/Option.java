package _1_basic._7_Option;

public class Option {
    
    // Alternative one: "classic" java
    static class Person {
        String forename;
        String surname;
        Person partner; // may or may not have partner....

        public Person(String forename, String surname, Person partner) {
            this.forename = forename;
            this.surname = surname;
            this.partner = partner;
        }
        
        public Boolean isMarried() { return partner != null && partner.surname.equals(surname);  }
    }
    
    // Alternative two: Java 8 Option
    
}
