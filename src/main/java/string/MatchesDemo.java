package string;

/**
 * String  支持正则表达式的方法之一：
 *
 * boolean matches (String regex)
 *使用给定的正则表达式验证当前字符串是否符合格式要求符合·则返回true
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String email = "fenghaogg@tedu.com";

        /*
        邮箱的正则:[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
         */
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean math = email.matches(regex);
        if (math){
            System.out.println("是邮箱");
        }else{
            System.out.println("不是邮箱");
        }
    }
}