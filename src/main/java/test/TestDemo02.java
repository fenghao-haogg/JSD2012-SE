package test;

import java.util.Arrays;

/**
 * 拆分字符串练习
 *
 * 将上述字符串按照"?"拆分为两部分并输出
 * ?左侧在控制台输出内容为:
 * 请求:http://localhost:8088/myweb/reg
 *
 * ?右侧在控制台输出内容为:
 * 参数:name=zhangsan
 */
public class TestDemo02 {
    public static void main(String[] args) {
                     //0123456789
        String path = "http://localhost:8088/myweb/reg?name=zhangsan";

        //按照？拆分
        String[] str = path.split("[?]+");
        System.out.println(str.length);
        for (int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

    }
}
