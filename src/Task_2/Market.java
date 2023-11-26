package Task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market implements QueueBehaviour,MarketBehaviour{
    private final List<Actor> queue;

    public Market(){
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришёл в магазин");
        takeInQueue(actor);
    }
    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }
    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + "получил заказ");
            }
        }
    }
    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActor = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()){
                releasedActor.add(actor);
                System.out.println(actor.getName() + "вышел из очереди");
            }
        }
        releaseFromMarket(releasedActor);
    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        Iterator<Actor> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Actor actor = iterator.next();
            System.out.println(actor.getName() + " вышел из магазина");
            iterator.remove();
        }
    }
    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}