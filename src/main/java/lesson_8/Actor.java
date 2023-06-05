package lesson_8;

public abstract class Actor implements ActorBehavior {

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected boolean inTheQueue;


    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    public boolean isInTheQueue() {
        return inTheQueue;
    }

    public void setInTheQueue(boolean inTheQueue) {
        this.inTheQueue = inTheQueue;
    }

    @Override
    public boolean InTheQueue() { return inTheQueue; }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
