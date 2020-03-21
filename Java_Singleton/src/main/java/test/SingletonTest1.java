package test;

import single.Singleton1;
import single.Singleton2;
import single.Singleton3;

/**
 * Created by fadeprogramerWZT on 2020/3/21.
 */
public class SingletonTest1 {

    public static void main(String[] args) {
//        Singleton1 s1 = Singleton1.INSTANCE;
//        System.out.println(s1);

//        Singleton2 s2 = Singleton2.INSTANCE;
//        System.out.println(s2);

        Singleton3 s3 = Singleton3.INSTANCE;
        System.out.println(s3);
    }
}
