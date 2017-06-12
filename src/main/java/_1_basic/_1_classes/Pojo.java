package _1_basic._1_classes;


public class Pojo {

    private Integer age;
    private final String name;

    public Pojo(Integer age, String name){

        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

     public void setAge(Integer age) {
         this.age = age;
    }

    public String getName() {
        return name;
    }
    
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pojo pojo = (Pojo) o;

        if (age != null ? !age.equals(pojo.age) : pojo.age != null) return false;
        return name != null ? name.equals(pojo.name) : pojo.name == null;
    }

    @Override
    public int hashCode() {
        int result = age != null ? age.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
