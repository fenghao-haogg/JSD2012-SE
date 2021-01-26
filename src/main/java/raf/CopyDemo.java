package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *复制原理：从原文件中顺序读取每个字节并写入到另一个字节中
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("fenghao.png","r");
        RandomAccessFile desc = new RandomAccessFile("fenghao_cp.png","rw");
        /*
        fenghao.png:
            00101101  11010101 10011010 0111010 0110101 10011010......

            d:00000000 00000000 00000000 10011010

            fenghao_cp.png
            00101101  11010101 10011010 0111010 0110101 10011010......

         */
        //用来记录每次读取到的字节
        int d;
        //获取当前系统时间的毫秒值
        long start = System.currentTimeMillis();
        while ((d = src.read())!=-1){
            desc.write(d);
        }
        System.out.println("复制完毕！耗时"+(-start)+"ms");
        src.close();
        desc.close();
    }
}
