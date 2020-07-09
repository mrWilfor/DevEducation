package practice.practic_17_06_07_2020_RabbitsLifeCycle;

public class RabbitLifeCycle implements Runnable {
    private volatile static long counter = 0;
    private volatile static long quantityOfLifeRabbits = 0;

    public RabbitLifeCycle() {
        counter();
    }

    public synchronized void counter() {
        RabbitLifeCycle.counter++;
        RabbitLifeCycle.quantityOfLifeRabbits++;
    }

    @Override
    public synchronized void run() {
        wasBorn();
        ate();
        multiplied();
        died();
    }

    private void wasBorn() {
        System.out.println("Was born ".concat(Thread.currentThread().getName()));
    }

    private synchronized void ate() {
        System.out.println(Thread.currentThread().getName().concat(" ate"));
    }

    private synchronized void multiplied() {
        System.out.println(Thread.currentThread().getName().concat(" has multiplied"));

        if (RabbitLifeCycle.quantityOfLifeRabbits < 50_000) {
            Thread one = new Thread(new RabbitLifeCycle(), "Rabbit ".concat(String.valueOf(RabbitLifeCycle.counter)));
            Thread two = new Thread(new RabbitLifeCycle(), "Rabbit ".concat(String.valueOf(RabbitLifeCycle.counter)));

            one.start();
            two.start();
            System.out.println("quantity of live rabbits: ".concat(String.valueOf(quantityOfLifeRabbits)));
        } else {
            new Thread(new RabbitLifeCycle(), "Rabbit ".concat(String.valueOf(RabbitLifeCycle.counter))).start();
            System.out.println("quantity of live rabbits: ".concat(String.valueOf(quantityOfLifeRabbits)));
        }

    }

    private synchronized void died() {
        System.out.println(Thread.currentThread().getName().concat(" has died"));
        RabbitLifeCycle.quantityOfLifeRabbits--;
        System.out.println("quantity of live rabbits: ".concat(String.valueOf(quantityOfLifeRabbits)));
    }

    public static long getCounter() {
        return counter;
    }
}
