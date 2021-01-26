package test;

/**
 * 正则表达式
 * 1:编写匹配数字的正则表达式,数字至少一位以上.
 *
 */
public class TestDemo01 {
    public static void main(String[] args) {

        String str = "abc123def456ghj789lkm";
        /*

         */
        String[] arr = str.split("[0-5]+");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}