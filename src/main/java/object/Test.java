package object;

/**
 * 测试Object中常用的方法
 */
public class Test {
    public static void main(String[] args) {
        Point p = new Point(1,2);

        //当前转换为字符串
        /**
         * Object中定义了方法
         * String toString()
         * 作用是将当前对象转换为String
         * Object 中该方法的实现返回的字符串格式为：类名@地址
         */
//        String str = p.toString();
//        System.out.println(str);
        /**
         * 向控制台输出是很常用的操作，当我们输出一个对象时，
         * 实际上该方法会调用该对象的toString方法
         * ,将返回的字符串输出到输出台上。
         */
        System.out.println(p);

        /**
         * 字符串与其它类型连接的时候,会将其它类型转换为String
         * 而转换也是依靠对象toString
         * 下面的代码实际是将p.toString()返回字符串连接的
         */
        String line = "这个对象是:" + p;
        System.out.println(line);

        Point p2  =new Point(1,2);
        System.out.println(p==p2);
        /**
         *Object提供的另一个常用方法:
         * boolean equals(Object o)
         * 该方法的作用是比较当前对象与参数给定的对象内容是否相同
         * 但是如果子类不重写这个方法，则该方法毫无价值.因为Object
         * 实现该方法的时候使用的是"=="比较的。
         */
        System.out.println(p.equals(p2));
        /*
        Jvav提供的类基本都妥善的重写了toString和equals
        比如String.
        只有我们自己定义的类在使用的时候要去重写
         */
    }

}