package com.ren.string;/** 
 * @author : renwenhao 
 * @date : 14:43 2020/12/18 
 */
public class StringDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("hello");
        buffer.append(123456);
        buffer.append(true);
        System.out.println(buffer);

    //    在数字3之前插入“你好”
        int len = buffer.indexOf("3");
        System.out.println(len);
        buffer.insert(len,"你好");
        System.out.println(buffer);

    //    删除true
        int lens = buffer.indexOf("true");
        System.out.println(lens);
        buffer.delete(lens,lens + "true".length());
        System.out.println(buffer);


        StringBuilder builder = new StringBuilder();
    }
}
