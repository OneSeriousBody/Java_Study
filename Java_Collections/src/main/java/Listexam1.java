import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by fadeprogramerWZT on 2020/3/23.
 *
 * 题目:假设顺序列表ArrayList中存储的元素是整型数字1~5，遍历每个元素，将每个元素顺序输出
 *
 */
public class Listexam1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> it = list.iterator();
        //迭代器遍历
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();
        //for循环遍历
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        //增强for循环
        for(Integer i : list){
            System.out.print(i + " ");
        }
        /*
              test:
                    1 2 3 4 5
                    1 2 3 4 5
                    1 2 3 4 5
         */

        System.out.println();
        Integer a = 1;
        Integer b = 2;
        List<Integer> list1 = new ArrayList<>();
        list1.add(0,a);
        list1.add(0,b);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i));
        }
    }
}
