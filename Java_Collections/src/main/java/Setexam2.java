import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by fadeprogramerWZT on 2020/3/23.
 *
 * 写一个Student类, 包含属性id[1-30), grade[1-6], score[0-100], 所有属性都是随机生成
 * 创建一个Set集合, 保存20个对象, 如果两个对象的id是一样的,则不允许添加
 * 使用迭代器遍历集合,打印输出对象的信息, 并找出分数最高的同学和分数最低的同学, 最后打印输出最高分和最低分同学信息
 *
 */
public class Setexam2 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();
        for (; set.size() != 20; ) {
            int id = (int) (Math.random() * 29 + 1);
            int grade = (int) (Math.random() * 6 + 1);
            double score = (int) (Math.random() * 1001) / 10.0;
            set.add(new Student(id, grade, score));
        }
        for (Student student : set) {
            System.out.println(student);
        }
        System.out.println("---------------------------");
        Student maxScoreStudent = null;
        Student minScoreStudent = null;
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (maxScoreStudent == null) {
                maxScoreStudent = student;
                minScoreStudent = student;
            }
            if (student.getScore() > maxScoreStudent.getScore()) {
                maxScoreStudent = student;
            }
            if (student.getScore() < minScoreStudent.getScore()) {
                minScoreStudent = student;
            }
        }
        System.out.println(maxScoreStudent);
        System.out.println(minScoreStudent);
    }

}

class Student implements Comparable<Student> {

    private int id;
    private int grade;
    private double score;

    public Student() {
    }

    public Student(int id, int grade, double score) {
        super();
        this.id = id;
        this.grade = grade;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", grade=" + grade + ", score=" + score + "]";

    }

    public int compareTo(Student o) {
        return (int) (this.score - o.score);
    }

}