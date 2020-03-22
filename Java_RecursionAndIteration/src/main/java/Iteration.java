import org.junit.Test;

/**
 * Created by fadeprogramerWZT on 2020/3/22.
 *
 * 可读性差
 * 数据大，但计算量小
 */
public class Iteration {
    @Test
    public void test(){
        Long start = System.currentTimeMillis();
        System.out.println(loop(40));
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
        /*
            test:
                165580141
                0
         */
    }

    public int loop(int n){
        if(n < 1){
            throw new IllegalArgumentException(n + "不能小于1");
        }
        if(n == 1 || n == 2){
            return n;
        }

        int one = 2;
        int two = 1;
        int sum = 0;
        for(int i=3; i<=n; i++){
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;
    }
}
