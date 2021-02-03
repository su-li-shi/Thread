package com.ren.demo01.lambda;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("张三",18),
                new Person("李四",20),
                new Person("王五",21)
        };
        // Arrays.sort(arr, new Comparator<Person>() {
        //     @Override
        //     public int compare(Person o1, Person o2) {
        //         //前-后，升序排序
        //         return o1.getAge()- o2.getAge();
        //     }
        // });

        //使用Lambda表达式简化匿名内部类
        // Arrays.sort(arr,(o1, o2)->{
        //     return o1.getAge()- o2.getAge();
        // });


        //再优化
        Arrays.sort(arr,(o1, o2)->o1.getAge()- o2.getAge()
        );

        //遍历数组
        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
