package single;

/**
 * Created by fadeprogramerWZT on 2020/3/21.
 *
 * 在内部类被加载和初始化，才创建INSTANCE实例对象
 * 静态内部不会自动随着外部类的加载和初始化而初始化，它是要单独去加载和初始化的。
 * 因为是在内部类加载和初始化，创建的，因此是线程安全的
 */
public class Singleton6 {
    private Singleton6(){

    }
    private static class inner{
        private static final Singleton6 INSTANCE = new Singleton6();
    }
    public static Singleton6 getInstance(){
        return inner.INSTANCE;
    }
}
