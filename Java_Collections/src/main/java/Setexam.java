import java.util.HashSet;
import java.util.Set;

/**
 * Created by fadeprogramerWZT on 2020/3/23.
 *
 * 获取命令行参数中的字符串列表，输出其中重复的字符、不重复的字符以及消除重复以后的字符列表
 */
public class Setexam {
    public static void main(String[] args) {
        String str = "abcdeafblmbnopawc";
        System.out.println("原字符串：" + str);

        Set<Character> set1 = new HashSet<Character>();//消除重复后的字符
        Set<Character> set2 = new HashSet<Character>();//重复的字符
        Set<Character> set3 = new HashSet<Character>();//不重复的字符

        //把字符串转为字符数组
        char[] cs = str.toCharArray();
        for (char c : cs) {
            boolean b = set1.add(c);
            if (!b) {
                set2.add(c);
            }
        }

        //把消除重复后的字符赋给set3
        set3.addAll(set1);
        //把消除重复后的字符 - 重复的字符 = 不重复的字符
        set3.removeAll(set2);

        System.out.println("====消除重复后的字符========");
        for (char c : set1) {
            System.out.print(c+" ");
        }

        System.out.println("\n====重复的字符========");
        for (char c : set2) {
            System.out.print(c+" ");
        }

        System.out.println("\n====不重复的字符========");
        for (char c : set3) {
            System.out.print(c+" ");
        }

        /*
             test:
                原字符串：abcdeafblmbnopawc
                ====消除重复后的字符========
                p a b c d e f w l m n o
                ====重复的字符========
                a b c
                ====不重复的字符========
                p d e f w l m n o
         */
    }
}
