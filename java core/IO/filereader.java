package indi.kai.hello;
import java.io.*;
//和FileInputStream相比，该方法更常用，因为其可以直接读取字符，
public class FileReaderTest {

    public static void main (String[] args)  {
        FileReader fr=null;
        int end=0;
        // String path="d:/file.txt";
        //File f=new File(path);
        try{
            fr=new FileReader("d:/file.txt");//指定文件的路径
        }
        catch (FileNotFoundException e){
            ;
        }

        //
        System.out.println("按字符读取");

        try{
            while((end=fr.read())!=-1){
                System.out.println((char)end);

            }
            System.out.println("打印结束");

        }catch (IOException e1){

        }

        System.out.println("读取结束");




    }
}
