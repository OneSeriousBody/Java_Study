/**
 * Created by fadeprogramerWZT on 2020/3/22.
 *
 * 局部变量:方法体{}中，形参，代码块{}中
 * 成员变量:类中方法外
 *      * 类变量:有static修饰
 *      * 实例变量:没有static修饰
 *
 * 修饰符
 *      局部变量:final
 *      成员变量:public、protected、private、final、static、volatile、transient
 */
public class VariablesExam {
    static int s;   //成员变量，类变量
    int i;  //成员变量，实例变量
    int j;  //成员变量，实例变量
    //非静态代码块:每次创建实例对象都会被执行
    {
        int i = 1;  //非静态代码块中的局部变量、i
        i++;
        j++;
        s++;
    }
    public void test(int j){    //形参，局部变量、j
        j++;
        i++;
        s++;
    }

    public static void main(String[] args) {    //形参，局部变量、args
        VariablesExam v1 = new VariablesExam(); //局部变量，v1
        VariablesExam v2 = new VariablesExam(); //局部变量，v2
        v1.test(10);
        v1.test(20);
        v2.test(30);
        System.out.println(v1.i + "," + v1.j + "," + v1.s);
        System.out.println(v2.i + "," + v2.j + "," + v2.s);
        /*
            test:
                2,1,5
                1,1,5
         */
    }
}
