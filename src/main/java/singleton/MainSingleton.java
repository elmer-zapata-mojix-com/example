package singleton;

public class MainSingleton {
    public static void main(String[]arg){
        SingletonExample test = SingletonExample.getInstance();
        SingletonExample test2 = SingletonExample.getInstance();
        SingletonExample test3 = SingletonExample.getInstance();
        SingletonExample test4 = SingletonExample.getInstance();
        SingletonExample test5 = SingletonExample.getInstance();
    }
}
