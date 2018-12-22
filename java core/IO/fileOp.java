package indi.kai.hello;
import java.io.*;
import java.util.Scanner;


public class filetest {

    public static void main (String[] args){
        String name="filetest.txt";
        String path="./";

        /*
        目录操作类似，关键词为pathFile
         */
        File file=new File(path,name);
        if(file.exists()){
            System.out.println("文件名称："+file.getName());
            System.out.println("文件路径："+file.getPath());
            System.out.println("文件绝对路径："+file.getAbsolutePath());
        }
        /*
          else{
            try{
                file.createNewFile();
            }catch(IOException e){
                e.printStackTrace();;
            }
        }
         */


    }
}
