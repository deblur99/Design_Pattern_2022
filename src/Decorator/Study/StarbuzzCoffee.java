package Decorator.Study;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(String.format("%s $%.2f", beverage1.getDescription(), beverage1.cost()));

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);  // new Whip(new Mocha(new Mocha(new DarkRoast())));
        // 호출 순서 (바깥쪽부터 안쪽) : Whip -> 바깥쪽 Mocha -> 안쪽 Mocha -> DarkRoast
        // 실행 순서 : 안쪽부터 바깥쪽 -> 호출 순서와 역순
        System.out.println(String.format("%s $%.2f", beverage2.getDescription(), beverage2.cost()));

        // 사이즈에 따라 가격 바꾸기
        // 내 방법
        // 1) 열거형 Size, Component에 Size, getSize, setSize 추가
        // 2) Decorator에 추상 메서드 getSizeCost 추가
        // 3) Decorator 파생 클래스에 추상 메서드 구현하는데, switch - case 문으로 cost 값 계산 후 반환
        // 4) getSizeCost()의 호출은 기존 cost 메서드에서 cost 값 계산할 때 이루어짐
        System.out.println("======= Changing beverage2 size =======");
        beverage2.setSize(Size.TALL);
        System.out.println("Changed size to "+beverage2.getSize());
        System.out.println(String.format("%s $%.2f", beverage2.getDescription(), beverage2.cost()));
        System.out.println();

        beverage2.setSize(Size.GRANDE);
        System.out.println("Changed size to "+beverage2.getSize());
        System.out.println(String.format("%s $%.2f", beverage2.getDescription(), beverage2.cost()));
        System.out.println();

        beverage2.setSize(Size.VENTI);
        System.out.println("Changed size to "+beverage2.getSize());
        System.out.println(String.format("%s $%.2f", beverage2.getDescription(), beverage2.cost()));
        System.out.println("======= END =======");

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(String.format("%s $%.2f", beverage3.getDescription(), beverage3.cost()));
    }
}
