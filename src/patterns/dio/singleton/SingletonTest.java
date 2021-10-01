package patterns.dio.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstacia();
        System.out.println(eager);
        lazy = SingletonLazy.getInstacia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstacia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstacia();
        System.out.println(lazyHolder);
    }
}
