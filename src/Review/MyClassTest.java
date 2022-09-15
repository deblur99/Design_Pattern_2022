package Review;

interface Talk {
    void message();
}

class MyClass implements Talk {
    public MyClass(int num) {}

    @Override
    public void message() {
        System.out.println("MyClass created");
    }
}

class MyClass2 implements Talk {
    public MyClass2() {
        System.out.println("Explicit constructor");
    }
    @Override
    public void message() {
        System.out.println("MyClass2 created");
    }
}

class MyClass3 implements Talk {
    public MyClass3() {}
    @Override
    public void message() {
        System.out.println("MyClass3 created");
    }
}

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(10); // Error
        myClass.message();
        MyClass2 myClass2 = new MyClass2(); // OK
        myClass2.message();
        MyClass3 myClass3 = new MyClass3(); // OK
        myClass3.message();
    }
}