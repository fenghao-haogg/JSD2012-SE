package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取数据
 */
public class RAFDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.dat","r");

        /*
        raf.dat文件数据
        00000001 00000010
         */
        /*
        int read()
        从文件中读取1个字节，并以int型返回。实际读取的字节是返回的int的值对应的2进制的低八位上
        但如果返回值为-1，则表示文件末尾。EOF：end of file
         */
        //00000000 00000000 00000000 00000001
        int d = raf.read();  //1
        System.out.println(d);
        //00000000 00000000 00000000 00000010
        d = raf.read(); //2
        System.out.println(d);
        //1111111 11111111 111111111 111111111
        d= raf.read(); //-1 文件末尾!
        System.out.println(d);
        raf.close();

    }
}
