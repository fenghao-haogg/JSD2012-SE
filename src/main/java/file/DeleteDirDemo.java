package file;

import java.io.File;

/**
 * 删除目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //将当前目录下的demo目录删除
        File dir = new File("demo");
        if (dir.exists()){
            dir.delete();     //删除
            System.out.println("目录已存在！");
        }else{
            System.out.println("目录不存在！");
        }
    }
}
