package String01;

/**
 * 字符串常量池是JVM专门在堆中为字符串提供的一种空间
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = "456def";
        System.out.println("s1:"+s1);

        //字符串s1与s2相同是因为，s2重用了s1上面创建的字符串

        String s2 = "456def";
        System.out.println("s2"+s2);
        System.out.println(s1==s2);


    }


}
