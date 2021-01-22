package string;

import com.sun.org.apache.bcel.internal.generic.FSUB;

public class Test {
    public static void main(String[] args) {
        //                              012345678901
        String s1 = getHostName("www.tedu.cn");
        String s2 = getHostName("http://www.tarena.com");
        String s3 = getHostName("doc.canglaoshi.com.cn");

        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);


    }

    /**
     * 获取给定的网址中的域名(地址中第一个"."到第二个"."之间的内容)
     */

    public static  String getHostName(String address){
        //地址值第一个"."之后第一个字符的位置
        int start = address.indexOf(".")+1;
        //地址中第二个"."的位置
        int end = address.indexOf(".",start);
        return address.substring(start,end);

    }

}
