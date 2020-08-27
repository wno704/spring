package creational.singleton.single;

public class SingletonFive {
    private static class SingletonHolder {
        private static final SingletonFive INSTANCE = new SingletonFive();
    }
    private SingletonFive (){}
    public static final SingletonFive getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
