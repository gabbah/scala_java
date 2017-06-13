package _1_basic._1_classes;

public class Overloading_default_params {
    
    static class Dog {
        String breed;
        int legsCount = 4;
        boolean hasTail = true;

        public Dog(String breed) {
            this.breed = breed;
        }

        public Dog(String breed, int legsCount, boolean hasTail) {
            this.breed = breed;
            this.legsCount = legsCount;
            this.hasTail = hasTail;
        }

        public Dog(String breed, int legsCount) {
            this.breed = breed;
            this.legsCount = legsCount;
        }

        public Dog(String breed, boolean hasTail) {
            this.breed = breed;
            this.hasTail = hasTail;
        }
    }

    
}
