package Task_2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Evgen");
        Human human2 = new Human("Alex");
        Human human3 = new Human("Sergey");
        Human human4 = new Human("Ivan");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.update();

    }
}
