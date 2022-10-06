package Observer.Test1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cell> cells = new ArrayList<Cell>();
        Cell one = new Cell("One");
        Cell two = new Cell("Two");
        Cell three = new Cell("Three");
        Cell four = new Cell("Four"); // 7번 문제

        one.addCell(three);
        two.addCell(three);
        four.addCell(one); // 7번 문제
        four.addCell(three); // 7번 문제

        one.display();
        two.display();
        three.display();
        four.display(); // 7번 문제

        one.setMessage("One is changed");
        one.display();
        two.display();
        three.display();
        four.display(); // 7번 문제

        two.setMessage("Two is changed");
        one.display();
        two.display();
        three.display();
        four.display(); // 7번 문제
    }
}
