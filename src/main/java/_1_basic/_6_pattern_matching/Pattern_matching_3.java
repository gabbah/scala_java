package _1_basic._6_pattern_matching;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.awt.*;

public class Pattern_matching_3 {
    static class Eye {
        private Color color;
        private Double correction;

        public Eye(Color color, Double correction) {
            this.color = color;
            this.correction = correction;
        }

        public Color getColor() {
            return color;
        }

        public Double getCorrection() {
            return correction;
        }
    }
    
    static class Eyes {
        private Eye left;
        private Eye right;

        public Eyes(Eye left, Eye right) {
            this.left = left;
            this.right = right;
        }

        public Eye getLeft() {
            return left;
        }

        public Eye getRight() {
            return right;
        }
    }
    
    // constraint: One eye is nearsighted
    private static class NearSightedPerson {
        private String name;
        private Eyes eyes;

        public NearSightedPerson(String name, Eyes eyes) {
            this.name = name;
            this.eyes = eyes;
        }

        public String getName() {
            return name;
        }

        public Eyes getEyes() {
            return eyes;
        }
    }
    
    static class Monocle {}
    
    public static Monocle getLeftMonocle(Double correction){ throw new NotImplementedException();}
    public static Monocle getRightMonocle(Double correction){ throw new NotImplementedException();}

    public static Monocle monocleForPerson(NearSightedPerson p) {
        Double leftCorrection = p.getEyes().getLeft().getCorrection();
        Double rightCorrection = p.getEyes().getRight().getCorrection();
        if (leftCorrection != 0) { return getLeftMonocle(leftCorrection); }
        if (rightCorrection != 0) { return getRightMonocle(rightCorrection); }
        // bad example, change it!
        return null;
    }

}
