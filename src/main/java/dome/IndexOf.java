package dome;

import java.net.BindException;

/**
 * 取下表
 */
public class IndexOf {
    public static void main(String[] args) {
                   //0123456789012345678
        String s1 = "love like java over";
        //重载的indexOf方法可以从指定位置开始检索第一次出现指定字符串的位置
        int index = s1.indexOf("e",2);
        System.out.println(index);
        index = s1.indexOf("v",2);
        System.out.println(index);

    }
}
