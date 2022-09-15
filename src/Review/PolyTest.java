package Review;

class ParentClass {
    private int num;
    private String name;

    public void show() {
        System.out.println("Parent");
    }
}

class ChildClassA extends ParentClass {
    public ChildClassA() {
    }

    @Override
    public void show() {
        System.out.println("Child A");
    }
}

class ChildClassB extends ParentClass {
    public ChildClassB() {
    }

    @Override
    public void show() {
        System.out.println("Child B");
    }
}

class ChildClassC extends ParentClass {
    public ChildClassC() {
    }

    @Override
    public void show() {
        System.out.println("Child C");
    }
}

public class PolyTest {
    public static void main(String[] args) {
        ParentClass aClass = new ChildClassA();
        ParentClass bClass = new ChildClassB();
        ParentClass cClass = new ChildClassC();

        aClass.show();
        bClass.show();
        cClass.show();
    }
}
