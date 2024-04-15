public interface QueueBehaviour {

    void take(Actor actor);

    void out();

    void getOrder();

    void givOrder();
}
