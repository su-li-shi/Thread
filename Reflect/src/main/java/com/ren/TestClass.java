package com.ren;

/**
 * @author : renwenhao
 * @date : 10:30 2020/12/18
 */
public class TestClass {
    public static void main(String[] args) throws ClassNotFoundException {
        testGetClass();
    }

    public static void testGetClass() throws ClassNotFoundException{

        TestClass t = new TestClass();
        Class class1 = t.getClass();
        System.out.println(class1.getName());

        Class class2 = TestClass.class;
        System.out.println(class2.getName());

        Class class3 = Class.forName("com.ren.TestClass");
        System.out.println(class3.getName());

        //一个 jvm 中一种 Class 只会被实例化一次，对上面的 Class 实例进行判断发现都是相等的
        System.out.println(class1 == class2);
        System.out.println(class1 == class3);

    }
}
