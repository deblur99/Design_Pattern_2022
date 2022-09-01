package WelcomeTest;

public class MyClass {
    public void hello(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(String.format(">>> Hello %s", name));
        }
    }
}
