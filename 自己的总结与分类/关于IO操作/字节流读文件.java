package 关于IO操作;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 字节流读文件 {
    public static void main(String[] args) {
        File f = new File("D:\\a.TXT");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            byte[] bytes = new byte[1024];
            int n = 0;
            while((n=fis.read(bytes))!=-1){
                String s = new String(bytes,0,n,"UTF-8");
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
