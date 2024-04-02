// Необходимо реализовать строение классов, без конкретной реализации:
// 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди, принятие/отдача заказа
// 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление состояния магазина
// 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей в очереди в различных статусах

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour {
    private Queue<Actor> queue = new LinkedList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " вошел в магазин.");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.forEach(actor -> {
            if (queue.remove(actor)) {
                System.out.println(actor.getName() + " покинул магазин.");
            }
        });
    }

    @Override
    public void take(Actor actor) {
        if (!queue.contains(actor)) {
            System.out.println("Актера " + actor.getName() + " нет в очереди.");
            return;
        }
        actor.setMakeOrder();
        System.out.println(actor.getName() + " сделал заказ.");
    }

    @Override
    public void out() {
        Actor actor = queue.poll();
        if (actor != null) {
            System.out.println(actor.getName() + " покинул очередь.");
        } else {
            System.out.println("Очередь пустая.");
        }
    }

    @Override
    public void getOrder() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                System.out.println(actor.getName() + " получил заказ.");
                actor.setTakeOrder();
            }
        }
    }

    @Override
    public void givOrder() {
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                System.out.println(actor.getName() + " отдал заказ.");
                actor.setMakeOrder();
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Market market = new Market();
            Actor actor1 = new Human("Человек 1");
            Actor actor2 = new Human("Человек 2");

            market.acceptToMarket(actor1);
            market.acceptToMarket(actor2);

            market.take(actor1);
            market.take(actor2);

            market.getOrder();
            market.givOrder();

            market.releaseFromMarket(List.of(actor1, actor2));
        }
    }

}
