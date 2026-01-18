public class App {
    public static void main(String[] args) throws Exception {
        
        Thread t1 = new Thread(new TesteSingleton("T1"));
        Thread t2 = new Thread(new TesteSingleton("T2"));
        Thread t3 = new Thread(new TesteSingleton("T3"));
        Thread t4 = new Thread(new TesteSingleton("T4"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
      
    }
}
