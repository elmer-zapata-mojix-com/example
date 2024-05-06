package singleton;

public class SingletonExample {
    public static SingletonExample client = null;
    String property1;
    private SingletonExample() {
        property1 = "Hello, I am";
    }
    public static SingletonExample getInstance() {

        if(client == null){
            System.out.println("Solo una vez");
            client = new SingletonExample();
        }
        return client;
    }
}
