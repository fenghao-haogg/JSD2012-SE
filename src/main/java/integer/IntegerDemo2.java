package integer;

/**
 * 包装类常见功能
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        //获取int 最大值
        int max = Integer.MAX_VALUE;
        System.out.println("max:"+max);
        //获取int最小值
        int min = Integer.MIN_VALUE;
        System.out.println("min:"+min);

        long lmax = Long.MAX_VALUE;
        System.out.println("max:"+lmax);

        /*
            包装类提供了一个静态方法parseXXX(String line)
            可以将字符串解析为对应的
          */
        String line = "456";
        //String line = "456.123"; 这个字符串就不能转为int值
        int in = Integer.parseInt(line);
        System.out.println(in);

        double dou = Double.parseDouble(line);
        System.out.println(dou);



    }
}
