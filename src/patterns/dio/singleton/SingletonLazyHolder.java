package patterns.dio.singleton;

public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instacia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstacia() {
        return Holder.instacia;
    }
}
