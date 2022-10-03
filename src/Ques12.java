public class Ques12{
    public static void main(String[] args) {
        Base base= new Base();
        base.display();
        Base child1=new Child1();
        child1.display();
        Base child2=new Child2();
        child2.display();
    }
}
sealed class Base permits Child1,Child2{
    void display(){
        System.out.println("This is Base Class");
    }
}
final class Child1 extends Base{
    void display(){
        System.out.println("This is Child1 Class");
    }
}
non-sealed class Child2 extends Base{
    void display(){
        System.out.println("This is Child2 Class");
    }
}
