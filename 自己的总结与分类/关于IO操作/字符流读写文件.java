package 关于IO操作;

import java.io.*;

public class 字符流读写文件 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        FileWriter fw = null;
        FileReader fr = null;

        try {
            fr = new FileReader("D:\\a.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("D:\\c.txt");
            bw = new BufferedWriter(fw);
            String s = "";
            while((s=br.readLine())!=null){
                //System.out.println(s);
                bw.write(s+"\r\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
