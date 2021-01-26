package file;
import java.io.File;
/**
 * java.io.File可以表示硬盘上的一个文件或者目录
 * 使用File可以:
 * 1:访问该文件或者目录的属性信息(大小，修改日期，可读可写等)
 * 2：创建或者删除文件和目录
 * 3：访问一个目录中的所有子项
 *
 * 但是File不能访问文件中的数据
 */
public class fileDemo {
    public static void main(String[] args) {
        /*
        File 创建时可以指定路径
        该路径通常使用相对路径，它有更好的跨平台性
        当前程序的运行环境而定。在idea或是eclipse里运行时
        当前目录就是这个程序所在的项目目录
         */
        File file = new File("./demo.txt");
        String name = file.getName();
        System.out.println(name);

        long len = file.length();
        System.out.println(len);

        boolean cr = file.canRead();
        System.out.println("可读:"+cr);
        boolean cd = file.canRead();
        System.out.println("可写:"+cd);
        boolean ih = file.isHidden();
        System.out.println("是否隐藏:"+ih);
    }
}
