import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class Main1 {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Vivek", 24));
        people.add(new Person("Akshay", 23));
        people.add(new Person("Akash", 25));
        people.add(new Person("Shiv", 23));

    
        people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        
        people.forEach(System.out::println);
    }
}
