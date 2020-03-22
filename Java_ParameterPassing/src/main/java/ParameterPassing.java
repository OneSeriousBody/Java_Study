import java.util.Arrays;

/**
 * Created by fadeprogramerWZT on 2020/3/22.
 *
 * 形参是基本数据类型：
 *      传递数据值
 * 实参是引用数据类型：
 *      传递地址值
 *      特殊的类型，如String、包装类等对象不可变性
 */
public class ParameterPassing {
    public static void change(int j,String s,Integer n,int[] a,MyData m){
        j += 1;
        s += "world";
        n += 1;
        a[0] += 1;
        m.a += 1;
    }

    public static void main(String[] args) {
        int i = 1;  //int是基本数据类型
        String str = "hello";   //不是基本数据类型，传递地址值，但有对象的不可变性
        Integer num = 200;      //不是基本数据类型，传递地址值，但有对象的不可变性
        int[] arr = {1,2,3,4,5};    //数组
        MyData my = new MyData();   //类

        change(i,str,num,arr,my);

        System.out.println("i = " + i);
        System.out.println("str = " + str);
        System.out.println("num = " + num);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("my.a = " + my.a);

        /*
            test:
                i = 1
                str = hello
                num = 200
                arr = [2, 2, 3, 4, 5]
                my.a = 11
         */
    }
}
class MyData{
    int a = 10;
}
