import java.util.Objects;

public class Ques11 {
    public static void main(String[] args) {
        Student student1=new Student("Harsh Gupta",1,22);
        Student student2=new Student("Mayank Gupta",2,22);
        Student student3=new Student("Nikhil Gupta",1,22);
        System.out.println(Student.count);
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
    }
}
record Student(String name, int id, int age) {
    static int count=0;
    Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        count++;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int id() {
        return id;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

