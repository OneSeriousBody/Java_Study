package single;

/**
 * Created by fadeprogramerWZT on 2020/3/21.
 * 在类初始化时直接创建实例，不管你是否需要这个对象都会被创建
 *
 * (1)构造器私有化
 * (2)自行创建，并且用静态变量保存
 * (3)向外提供这个实例
 * (4)强调这是一个实例，可以用final修饰
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {

    }

//    public static void test(){
//
//    }
}
