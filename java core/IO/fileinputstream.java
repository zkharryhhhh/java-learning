package indi.kai.hello;
import java.io.*;
import java.util.Scanner;


public class FileInputTest {

    public static void main (String[] args) throws FileNotFoundException {
        FileInputStream fis=null;
        File f=null;
        f=new File("d:/file.txt");//指定文件的路径
        fis=new FileInputStream(f);//打开指定的文件
        int end=0;
        byte[] by=new byte[(int)f.length()];
        System.out.println("按字节读取");

        try{
            if((end=fis.read(by))!=-1){
                String s=new String(by);
                System.out.println(s);
                System.out.println("共打印了"+end+"个字节");
            }
        }catch (IOException e1){

        }

        System.out.println("读取结束");




    }
}
