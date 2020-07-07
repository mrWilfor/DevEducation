package practice.practic_17_06_07_2020_RabbitsLifeCycle;

public class RabbitLifeCycle implements Runnable {
    private static long counter = 0;
    private static long quantityOfRabbits = 0;

    public RabbitLifeCycle() {
        RabbitLifeCycle.counter++;
        RabbitLifeCycle.quantityOfRabbits++;
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

        RabbitLifeCycle rabbitLifeCycle1 = new RabbitLifeCycle();
        RabbitLifeCycle rabbitLifeCycle2 = new RabbitLifeCycle();
        new Thread(rabbitLifeCycle1, "Rabbit ".concat(String.valueOf(RabbitLifeCycle.counter))).start();
        new Thread(rabbitLifeCycle2, "Rabbit ".concat(String.valueOf(RabbitLifeCycle.counter))).start();
        System.out.println("number of live rabbits: ".concat(String.valueOf(quantityOfRabbits)));
    }

    private void died() {
        System.out.println(Thread.currentThread().getName().concat(" has died"));
        Thread.currentThread().interrupted();
        RabbitLifeCycle.quantityOfRabbits--;
    }

    public static long getCounter() {
        return counter;
    }
}
