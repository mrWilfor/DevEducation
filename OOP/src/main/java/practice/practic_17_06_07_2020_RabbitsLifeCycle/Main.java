package practice.practic_17_06_07_2020_RabbitsLifeCycle;

public class Main {
    public static void main(String[] args) {
        new Thread(new RabbitLifeCycle(), "Rabbit ".concat(String.valueOf(RabbitLifeCycle.getCounter()))).start();
    }
}
