package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF是专门用来读写文件的类。其基于针对文件进行随机读写
 */
public class RAFDemo1 {
    public static void main(String[] args) throws IOException {


        //想对当前目录下的rad.dat文件进行操作
        /*
        BAF常用的构造器
        RandomAccessFile(File file,String mode)
        RandomAccessFile(String path,String mode)
        第一个参数为要进行读写的文件，可以传入file对象也可以直接给定该文件的路径
        第二个参数为操作模式，有两种
        "r"：只读模式，仅对该文件做读取数据操作
        "w"：读写模式，对文件读写均可
         */
        RandomAccessFile raf = new RandomAccessFile(
                "./raf.dat","rw"
        );
        //向文件中写入一个字节的2进制数据
        /*
            void write(int d)
            向文件中写入1个字节，写入的是给定的int值所对应的2进制的”低八位“;
           int型整数1的2进制：
           00000000 00000000 00000000 00000001

           wwrite 方法写入该int值对应的2进制的低八位：
           00000000 00000000 00000000 00000001
         */
        raf.write(1);
        raf.write(2);
        System.out.println("写出完毕！");


    }
}
