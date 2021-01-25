package integer;

/**
 * 包装类
 * 包装类是为了解决基本类型不能直接参与面向对象开发的问题，使得基本
 * 类型可以以“对象”的形式存在
 * 包装类都定义在java.lang中作为基础类使用。6个数字类型的包装类、
 * 继承来自Number,其余两个直接继承Object。
 */
public class IntegerDemo {
    public static void main(String[] args) {

        //基本类型转换为包装类
        int d = 123;
//        Integer i1 = new Integer(d);
//        Integer i2 = new Integer(d);

        Integer i1 = Integer.valueOf(d);
        Integer i2 = Integer.valueOf(d);
        System.out.println(i1==i2);            //valueOf创建则为true

        //包装类都重写过equals
        System.out.println(i1.equals(i2));

        //包装类转换为基本类型
        int i = i1.intValue();
        System.out.println(i);

        double dou = i2.doubleValue();
        System.out.println(dou);


    }
}
