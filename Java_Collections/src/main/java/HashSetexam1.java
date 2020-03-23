import java.util.HashSet;
import java.util.Random;

/**
 * Created by fadeprogramerWZT on 2020/3/23.
 *
 * 题目:生成10个1到20之间的不重复的随机数
 *
 * 分析过程：
 * 1. 需要生成随机数，那么需要Random类
 * 2. 需要存储10个不能重复的数，需要HashSet集合（当前TreeSet还没学习到）
 * 3. 判断，当HashSet的Size小于10就往里存储随机数，等于就停止添加存储元素
 * 4. 通过Random的nextInt()方法获取随机数并加入到HashSet里
 * 5. 遍历HashSet,打印出10个随机数
 *
 */
public class HashSetexam1 {
    public static void main(String[] args) {
        //创建Random对象
        Random r = new Random();
        //创建HashSet对象
        HashSet<Integer> hs = new HashSet<>();
        //判断并添加元素
        while(hs.size() < 10){
            //通过Random中随机方法nextInt()获取1到20范围内随机数
            hs.add(r.nextInt(20) + 1);  //如果不加1，随机范围是0到19
        }
        //遍历HashSet
        for(Integer integer : hs){
            System.out.print(integer + " ");
        }

        /*
            test:
                17 2 18 4 6 7 8 9 12 15
         */

    }
}
