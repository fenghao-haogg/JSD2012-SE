package string;

/**
 * char char(int index)
 * 获取指定位置的字符
 */
public class CharAtDemo {
    public static void main(String[] args) {

        //            0123456789012345
        String str = "trinking in java";
        //获取第5个字符(下标为:4)
        char c = str.charAt(4);
        System.out.println(c);
    }
}
