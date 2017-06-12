package _1_basic._1_classes;

public class PojoWithStatic {
    public Integer incr() {
        return sharedCount += 1;
    }
    
    private static Integer sharedCount;  // may be null (implicitly)
}
