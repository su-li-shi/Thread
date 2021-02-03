package Set;

import java.util.TreeSet;

public class demo03 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();

        Student st1 = new Student("张三",18);
        Student st2 = new Student("张三",18);
        Student st3 = new Student("张三",18);
        Student st4 = new Student("张三",18);
        Student st5 = new Student("张三",18);
        Student st6 = new Student("张三",18);
        Student st7 = new Student("张三",18);

        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        ts.add(st4);
        ts.add(st5);
        ts.add(st6);
        ts.add(st7);

        for (Student s : ts){
            System.out.println(s.getName()+"---------"+s.getAge());
        }
    }
}
