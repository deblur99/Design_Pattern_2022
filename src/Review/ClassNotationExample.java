package Review;

interface Message {
    void showMessage();
}

class B implements Message {
    public void showMessage() {
        System.out.println("Composition Demo");
    }
}

class C implements Message {
    public void showMessage() {
        System.out.println("Aggregation Demo");
    }
}

class D implements Message {
    public void showMessage() {
        System.out.println("Association Demo");
    }
}

class E implements Message {
    public void showMessage() {
        System.out.println("Dependency Demo");
    }
}

class CompositionExample {
    private B b;

    public CompositionExample() {
        b = new B();
        b.showMessage();
    }

    public void showB() {
        b.showMessage();
    }
}

class AggregationExample {
    private C c;

    public AggregationExample(C c) {
        this.c = c;
        c.showMessage();
    }

    public void showC() {
        c.showMessage();
    }
}

class AssociationExample {
    private D d;

    public AssociationExample() {
    }

    public void setD(D d) {
        this.d = d;
        d.showMessage();
    }

    public void showD() {
        d.showMessage();
    }
}

class DependencyExample {
    public DependencyExample() {
        // e.showMessage -> error!!
    }

    public void doSomething(E e) {
        e.showMessage(); // 매개변수로 받은 E 인스턴스가 혼자 돌다가 메서드 끝나면 바로 해제되어 다른 메서드에서 참조 불가
        // E 인스턴스는 지역변수이므로, Dependency 관계에 있는 클래스의 인스턴스는 일회성으로, 사용하고자 하는 메서드에서만 사용할 수 있다.
    }

    // Error
//    public void showE() {
//        e.showMessage();
//    }
}

public class ClassNotationExample {
    public static void main(String[] args) {
        CompositionExample compositionExample = new CompositionExample();
        compositionExample.showB();

        AggregationExample aggregationExample = new AggregationExample(new C());
        aggregationExample.showC();

        AssociationExample associationExample = new AssociationExample();
        associationExample.setD(new D());
        associationExample.showD();

        DependencyExample dependencyExample = new DependencyExample();
        dependencyExample.doSomething(new E());
    }
}
