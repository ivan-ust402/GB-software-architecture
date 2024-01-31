package homework2.task2.singletone;


public class Main {
    public static void main(String[] args) {
        SingletonClass singletonExample1 = SingletonClass.getInstance();
        System.out.println(singletonExample1.getInfo()); //Initial class info

        SingletonClass singletonExample2 = SingletonClass.getInstance();
        singletonExample2.setInfo("New class info");

        System.out.println(singletonExample1.getInfo()); //New class info
        System.out.println(singletonExample2.getInfo()); //New class info
    }
}
