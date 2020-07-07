package homeWork;

public class Main {
    public static void main(String[] args) {
        new Thread(new RabbitLifeCycle(0)).start();
    }
}
