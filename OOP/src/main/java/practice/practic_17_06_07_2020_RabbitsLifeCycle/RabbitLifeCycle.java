package practice.practic_17_06_07_2020_RabbitsLifeCycle;

public class RabbitLifeCycle implements Runnable {
    private static long counter = 0;
    private static long quantityOfLifeRabbits = 0;

    public RabbitLifeCycle() {
        RabbitLifeCycle.counter++;
        RabbitLifeCycle.quantityOfLifeRabbits++;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
            wasBorn();
            ate();
            multiplied();
            died();
        } catch (InterruptedException i) {

        }
    }

    private void wasBorn() {
        System.out.println("Was born ".concat(Thread.currentThread().getName()));
    }

    private void ate() {
        System.out.println(Thread.currentThread().getName().concat(" ate"));
    }

    private void multiplied() {

        System.out.println(Thread.currentThread().getName().concat(" has multiplied"));

        if (quantityOfLifeRabbits < 50_000) {
            Thread rabbit1 = new Thread(new RabbitLifeCycle(), "Rabbit ".concat(String.valueOf(RabbitLifeCycle.counter)));
            rabbit1.start();
            Thread rabbit2 = new Thread(new RabbitLifeCycle(), "Rabbit ".concat(String.valueOf(RabbitLifeCycle.counter)));
            rabbit2.start();
            System.out.println("number of live rabbits: ".concat(String.valueOf(quantityOfLifeRabbits)));
        } else {
            new Thread(new RabbitLifeCycle(), "Rabbit ".concat(String.valueOf(RabbitLifeCycle.counter))).start();
            System.out.println("quantity of live rabbits: ".concat(String.valueOf(quantityOfLifeRabbits)));
        }

    }

    private void died() {
        System.out.println(Thread.currentThread().getName().concat(" has died"));
        RabbitLifeCycle.quantityOfLifeRabbits--;
        System.out.println("quantity of live rabbits: ".concat(String.valueOf(quantityOfLifeRabbits)));
//        Thread.currentThread().interrupted();
    }

    public static long getCounter() {
        return counter;
    }
}
