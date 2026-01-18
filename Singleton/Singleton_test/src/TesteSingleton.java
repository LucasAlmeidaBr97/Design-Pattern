
public class TesteSingleton implements Runnable {
    private String name;

    public TesteSingleton(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Iniciando Thread: " + name);

        Singleton singleton = Singleton.getInstance();

        System.out.println(
                "Thread " + name +
                        " -> identityHashCode: " +
                        System.identityHashCode(singleton));
        System.out.println("Finalizando Thread: " + name);
    }
}