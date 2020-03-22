import org.junit.Test;

/**
 * Created by fadeprogramerWZT on 2020/3/22.
 *
 * 可读性高
 * 数据太大，计算量会很大
 */
public class Recursionexam {

    @Test
    public void test(){
        Long start = System.currentTimeMillis();
        System.out.println(f(40));
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
        /*
            test:
                165580141
                474
         */
    }

    public int f(int n){
        if(n < 1){
            throw new IllegalArgumentException(n + "不能小于1");
        }
        if(n == 1 || n == 2){
            return n;
        }
        return f(n-2) + f(n-1);
    }
}
