import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by fadeprogramerWZT on 2020/3/23.
 *
 * 使用Scanner从控制台读取一个字符串，统计字符串中每个字符出现的次数
 */
public class SLMexam {
    public static void main(String[] args) {
        String str = "abcdeblmbac";
        System.out.println("原字符串：" + str);

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] cs = str.toCharArray();

        for (char c : cs) {

            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;

                map.put(c, value);

            } else {
                map.put(c, 1);
            }
        }
        //遍历map
        Set<Character> set = map.keySet();
        for (Character c : set) {
            System.out.println(c + "出现了" + map.get(c) + "次");
        }

    }

}
