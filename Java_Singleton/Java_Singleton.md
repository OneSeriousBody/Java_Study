# Singleton设计模式

Singleton：在java中即指单例设计模式，他是软件开发中最常用的设计模式之一。

- 单：唯一
- 例：实例



- 单例设计模式，即某个类在整个系统中只能有一个实例对象可被获取和使用的代码模式

  例如：代表JVM运行环境的Runtime类



## 要点

（1）类只能有一个实例

- 构造器私有化

（2）必须自行创建实例

- 含有一个该类的静态变量来保存这个唯一的实例

（3）必须自行向整个系统提供这个实例

- 对外提供获取该实例对象的方式：

  ​	直接暴露

  ​	用静态变量的get方法获取



## 常见形式

一、饿汉式：直接创建对象，不存在线程安全问题

（1）直接实例化饿汉式（直观简洁）

```java
package single;

/**
 * Created by fadeprogramerWZT on 2020/3/21.
 * (1)构造器私有化
 * (2)自行创建，并且用静态变量保存
 * (3)向外提供这个实例
 * (4)强调这是一个实例，可以用final修饰
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {

    }
}

```

测试：

```java
public class SingletonTest1 {

    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.INSTANCE;
        System.out.println(s1);

    }
    /*
    	test：
    		single.Singleton1@1b6d3586
    */
}
```



（2）枚举（最简洁）

```java
package single;

/**
 * Created by fadeprogramerWZT on 2020/3/21.
 *
 *  枚举类型：表示该类型的对象是有限的几个
 *  可以限定为一个，就成了单例
 */
public enum Singleton2 {
    INSTANCE;
}

```

测试：

```java
public class SingletonTest1 {

    public static void main(String[] args) {
        Singleton2 s2 = Singleton2.INSTANCE;
        System.out.println(s2);

        /*
        	test:
        		INSTANCE
        */
    }
}
```



（3）静态代码块（适合复杂实例化）

```java
package single;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by fadeprogramerWZT on 2020/3/21.
 */
public class Singleton3 {
    public static final Singleton3 INSTANCE;
    private String info;

    static {
        try {
            Properties pro = new Properties();
            pro.load(Singleton3.class.getClassLoader().getResourceAsStream("single.properties"));
            INSTANCE = new Singleton3(pro.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private Singleton3(String info){
        this.info = info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Singleton3{" + "info='" + info + '\'' + '}';
    }
}
```

测试：

```java
public class SingletonTest1 {

    public static void main(String[] args) {
        Singleton3 s3 = Singleton3.INSTANCE;
        System.out.println(s3);
        /*
        	test:
        		Singleton3{info='coderwzt'}
        */

    }
}
```



二、懒汉式：延迟创建对象

（1）线程不安全（适用于单线程）

```java
package single;

/**
 * Created by fadeprogramerWZT on 2020/3/21.
 * 懒汉式：延迟创建这个实例对象
 *
 * （1）构造器私有化
 * （2）用一个静态变量保存这个唯一的实例
 * （3）提供一个静态方法，获取这个实例对象
 */
public class Singleton4 {
    private static Singleton4 INSTANCE;
    private Singleton4(){

    }
    public static Singleton4 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton4();
        }
        return INSTANCE;
    }
}
```

测试：

```java
package test;

import single.Singleton4;

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

        Callable<Singleton4> c = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = es.submit(c);
        Future<Singleton4> f2 = es.submit(c);

        Singleton4 s1 = f1.get();
        Singleton4 s2 = f2.get();

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);

        es.shutdown();
        
        /*
        	test:
	        	false
				single.Singleton4@7f31245a
				single.Singleton4@6d6f6e28
        */
    }
}
```



（2）线程安全（适用于多线程）

```java
package single;

/**
 * Created by fadeprogramerWZT on 2020/3/21.
 * 懒汉式：延迟创建这个实例对象
 *
 * （1）构造器私有化
 * （2）用一个静态变量保存这个唯一的实例
 * （3）提供一个静态方法，获取这个实例对象
 */
public class Singleton5 {
    private static Singleton5 INSTANCE;
    private Singleton5(){

    }
    public static Singleton5 getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton5.class){
                if(INSTANCE == null){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton5();
                }
            }
        }
        return INSTANCE;
    }
}
```

测试：

```java
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

		/*
			test:
				true
                single.Singleton5@7f31245a
                single.Singleton5@7f31245a
		*/

```



（3）静态内部类形式（适用于多线程）

```java
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
```

