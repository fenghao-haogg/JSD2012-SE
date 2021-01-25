package string;

/**
 * String的优化导致其为不变对象，这会从在利于重用但是不利于修改操作。
 * 频繁修改String会降低性能并有较多的系统开销
 *
 *java.lang.StringBuilder是专门来设计修改String的API，其内部维护
 * 一个可变的char数组，并提供了多种修改字符串内容的方法，例如:增删改插，和
 * String原有的方法：indenxOf，length等等
 *
 */
public class StringBuilderDemo {
    public static void main(String[] args) {

        String str = "好好学习java";

        //内部表示空字符串
        //StringBuilder  builder =new StringBuilder();

        //基于给定字符串内容进行修改
        // StringBuilder非线程安全        StringBuffer线程安全
        StringBuffer  builder =new StringBuffer(str);


        /*
        好好学习java
        好好学习java，就是为了找个好工作！
        append:
         */
        builder.append(",就是为了找个好工作!");
        str = builder.toString();
        System.out.println(str);

        /*
         0123456789
         好好学习java,就是为了找个好工作！
         好好学习java,就是为了改变世界
         replace:替换当前字符中的部分内容为指定的内容
         */
        builder.replace(13,18,"改变世界");
        //System.out.println(builder.toString());
        //直接输出builder也是输出toString返回的字符串
        System.out.println(builder);

        /*
        好好学习java,就是为了改变世界!
        ,就是为了改变世界！
        delete:删除当前字符串中的部分内容
         */
        builder.delete(0,8);
        System.out.println(builder);

        /*
        ,就是为了改变世界！
        活着,就是为了改变世界!
        insert:将指定内容插入到指定位置
         */
        builder.insert(1,"活着");
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);





    }

}
