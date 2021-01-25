package string;

/**
 * String 支持正则表达式的方法之二:
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分后的所有部分以
 * 一个String数组形式返回
 */

public class SplitDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghj789imn";

        //按照数字部分拆分
        String[] arr = str.split("[0-9]+");
        System.out.println(arr.length);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);

            str = "123,456,789";
            //按照 ","拆分      若果字符串开始就是可拆分项，则拆分后的第一项是空字符串
            // 若末尾都是","连续拆分出来的可以忽略不记,但是中间会出现空字符串
            arr = str.split(",");
            System.out.println(arr.length);
            for (int i1=0;i1< arr.length;i1++){
                System.out.println(arr[i1]);
            }

        }

    }
}
