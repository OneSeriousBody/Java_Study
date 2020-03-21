package test;

import single.Singleton4;
import single.Singleton5;

import java.util.concurrent.*;

/**
 * Created by fadeprogramerWZT on 2020/3/21.
 */
public class SingletonTest2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Singleton4 s1 = Singleton4.getInstance();
//        Singleton4 s2 = Singleton4.getInstance();
//
//        System.out.println(s1 == s2);
//        System.out.println(s1);
//        System.out.println(s2);

        /* test:
         *      true
         *      single.Singleton4@1b6d3586
         *      single.Singleton4@1b6d3586
         */

//        Callable<Singleton4> c = new Callable<Singleton4>() {
//            @Override
//            public Singleton4 call() throws Exception {
//                return Singleton4.getInstance();
//            }
//        };
//
//        ExecutorService es = Executors.newFixedThreadPool(2);
//        Future<Singleton4> f1 = es.submit(c);
//        Future<Singleton4> f2 = es.submit(c);
//
//        Singleton4 s1 = f1.get();
//        Singleton4 s2 = f2.get();
//
//        System.out.println(s1 == s2);
//        System.out.println(s1);
//        System.out.println(s2);
//
//        es.shutdown();
        /*  test:
                false
                single.Singleton4@7f31245a
                single.Singleton4@6d6f6e28
        */

        Callable<Singleton5> c = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton5> f1 = es.submit(c);
        Future<Singleton5> f2 = es.submit(c);

        Singleton5 s1 = f1.get();
        Singleton5 s2 = f2.get();

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);

        es.shutdown();

    }
}
