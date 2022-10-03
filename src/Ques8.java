public class Ques8 {
    public static void main(String[] args) throws Exception {
        MyResource1 myResource1 = new MyResource1();
        MyResource2 myResource2 = new MyResource2();
        try (myResource1; myResource2) {
            myResource1.openResource();
            myResource2.openResource();
            myResource1.displayResource();
            myResource2.displayResource();
        }
    }
}

class MyResource1 implements AutoCloseable{
    void openResource(){
        System.out.println("MyResource1: Opened");
    }
    void displayResource(){
        System.out.println("MyResource1: Running");
    }
    @Override
    public void close() throws Exception {
        System.out.println("MyResource1: Closed");
    }
}
class MyResource2 implements AutoCloseable {
    void openResource() {
        System.out.println("MyResource2: Opened");
    }

    void displayResource() {
        System.out.println("MyResource2: Running");
    }

    @Override
    public void close() throws Exception {
        System.out.println("MyResource2: Closed");
    }

}