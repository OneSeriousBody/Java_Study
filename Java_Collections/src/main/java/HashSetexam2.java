import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by fadeprogramerWZT on 2020/3/23.
 *
 * 题目:从键盘获取一行输入字符串，要求去除重复字符
 *
 * 分析过程：
 * 1. 需要使用Scanner类
 * 2. 输入的是一行字符串，需要转换成字符数组
 * 3. 创建HashSet集合对象（利用HashSet无法储存相同元素的特性达到去除重复字符的目的）
 * 4. 字符数组遍历元素，并添加进入HashSet集合
 * 5. 变量集合元素
 *
 */
public class HashSetexam2 {
    public static void main(String[] args) {
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String line = sc.nextLine();

        //字符串转换成字符数组
        char[] c = line.toCharArray();

        //字符串组转换成集合对象，创建HashSet
        HashSet<Character> hs = new HashSet<>();

        //遍历数组，元素依次添加
        for(int i = 0; i < c.length; i++){
            hs.add(c[i]);
        }

        //遍历HashSet集合
        for(Character character : hs){
            System.out.print(character + " ");
        }

        /*
            test:
                输入一个字符串
                abcabcabcddd
                a b c d
         */
    }
}
