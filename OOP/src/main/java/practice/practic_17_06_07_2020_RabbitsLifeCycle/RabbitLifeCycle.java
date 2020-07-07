package practice.practic_17_06_07_2020_RabbitsLifeCycle;

public class RabbitLifeCycle implements Runnable {
    private long counter;
    private Thread rabbitLifeCycle1;
    private Thread rabbitLifeCycle2;

    public RabbitLifeCycle(long counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        wasBorn();
        ate();
        multiplied();
        died();
    }

    private void wasBorn() {
        System.out.println("Was born ".concat(Thread.currentThread().getName()));
        counter++;
    }

    private void ate() {
        System.out.println(Thread.currentThread().getName().concat(" ate"));
    }

    private void multiplied() {
        System.out.println(Thread.currentThread().getName().concat(" has multiplied"));
        rabbitLifeCycle1 = new Thread(new RabbitLifeCycle(this.counter + 1), "Rabbit ".concat(String.valueOf(this.counter + 1)));
        rabbitLifeCycle1.start();
        rabbitLifeCycle2 = new Thread(new RabbitLifeCycle(this.counter + 1), "Rabbit ".concat(String.valueOf(this.counter + 1)));
        rabbitLifeCycle2.start();
    }

    private void died() {
        Thread.currentThread().interrupted();
        System.out.println(Thread.currentThread().getName().concat(" has died"));
    }
}
