package annotation;

public class FruitTest {
    public static void main(String[] args) {
        FruitInfoUtil.getFruitInfo(Apple.class);
        Apple apple = new Apple();
        System.out.println(apple);
    }
}
