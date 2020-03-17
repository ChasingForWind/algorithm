package 关于IO操作;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流写文件 {
    public static void main(String[] args) {
        File f = new File("D:\\b.TXT");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(f);
            String s = new String("刘畅    加油！");
            fos.write(s.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos==null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
