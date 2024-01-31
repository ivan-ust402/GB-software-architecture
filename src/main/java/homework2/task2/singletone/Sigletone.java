package homework2.task2.singletone;

public final class Singleton {

    private static Singleton INSTANCE;
    private String info = "Initial info class";

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

    // getters and setters
    public String getName() {
        return info;
    }

    public void setName(String name) {
        this.info = info;
    }
}
