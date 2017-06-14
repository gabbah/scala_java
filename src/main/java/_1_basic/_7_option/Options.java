package _1_basic._7_option;

import java.util.Optional;

public class Options {
    
    // Alternative one: "classic" java
    static class CaseOne {
        static class Person {
            Wallet wallet;

            public Wallet getWallet() {
                return wallet;
            }

            public Person(Wallet wallet) {
                this.wallet = wallet;
            }
        }

        static class Wallet {
            License license;

            public License getLicense() {
                return license;
            }

            public Wallet(License license) {
                this.license = license;
            }
        }
        static class License { public boolean validNow() { return true;}}

        public static boolean mayDriveCar(Person person) {
            return person.getWallet() != null && person.getWallet().getLicense() != null;
        }

        // Alternative two: java 8 ofNullable
        public static boolean mayDriveCar2(Person person) {
            return Optional.ofNullable(person.getWallet())
                    .map(Wallet::getLicense)  // map returns Optional.empty for nulls
                    .map(License::validNow)
                    .orElse(false);
        }
        
        public static void main(String[] args) {
            Person person = new Person(new Wallet(new License()));
            System.out.println(mayDriveCar(person));
            System.out.println(mayDriveCar2(person));
        }
    
    
    }
    // Alternative three: Java 8 Optional as method return values
    static class CaseTwo {
        static class Person {
            // Optional<Wallet> wallet; // Not a good idea - Optional is not serializable
            Wallet wallet;

            public Optional<Wallet> getWallet() {
                return Optional.ofNullable(wallet);
            }

            public Person(Wallet wallet) {
                this.wallet = wallet;
            }
        }

        static class Wallet {
            License license;

            public Optional<License> getLicense() {
                return Optional.ofNullable(license);
            }

            public Wallet(License license) {
                this.license = license;
            }
        }
        static class License { public boolean validNow() { return true;}}

        public static boolean mayDriveCar(Person person) {
            return person.getWallet()
                    .flatMap(Wallet::getLicense)
                    .map(License::validNow)
                    .orElse(false);
        }

        public static void main(String[] args) {
            Person person = new Person(new Wallet(new License()));
            System.out.println(mayDriveCar(person));
        }


    }
}
