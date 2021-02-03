package com.ren;


/**
 * @author : renwenhao
 * @date : 10:55 2020/12/18
 */
public class TestClass2 {
    private int i = 0 ;

    public int j = 1;
    public String name;

    private String age;

    private void t(){
        System.out.println("调用 TestClass 对象的 t() 方法");
    }

    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        testClassMethod();
    }


    public static void testClassMethod() throws IllegalAccessException, InstantiationException {
        Class<TestClass2> clazz = TestClass2.class;
        System.out.println("clazz.getName() -->" + clazz.getName());//获取类全名（包含路径）
        System.out.println();
        System.out.println("clazz.getSimpleName() -->" + clazz.getSimpleName());//获取类简称
        System.out.println();
        System.out.println("clazz.getSuperclass() -->" + clazz.getSuperclass());//获取父类
        System.out.println();
        System.out.println("clazz.isInterface() -->" + clazz.isInterface());//判断是否为接口
        System.out.println();
        System.out.println("clazz.getFields() -->" + join(clazz.getFields(),"\r\n"));//获取 public 字段,包含父类 public 字段  \r\n 回车的意思
        System.out.println();
        System.out.println("clazz.getDeclaredFields() -->" + join(clazz.getDeclaredFields(),"\r\n"));//获取所有字段
        System.out.println();
        System.out.println("clazz.getMethods() -->" + join(clazz.getMethods(),"\r\n"));//获取 public 方法，包含父类 public 方法
        System.out.println();
        System.out.println("clazz.getDeclaredMethods() -->" + join(clazz.getDeclaredMethods(),"\r\n"));//获取所有字段
        System.out.println();
        System.out.println("clazz.getConstructors() -->" + join(clazz.getConstructors(),"\r\n"));//获取构造方法
        System.out.println();
        clazz.newInstance().t();
    }
    /**
     * 拼接数组成字符串
     * @param objs
     * @param s
     * @return
     */
    private static String join(Object[] objs, String s) {
        StringBuilder r = new StringBuilder();
        for (Object obj : objs) {
            r.append(obj).append(s);
        }
        return r.toString();
    }


}
