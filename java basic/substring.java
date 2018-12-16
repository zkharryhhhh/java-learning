package indi.kai.hello;

public class array {

    public static void main (String[] args){
        String str="hello,java,zk,harry,icy";
        String s=",";
        //一个参数代表截取字符串的起始位置，包含该位置
        String ss1=str.substring(6);
        //两个参数，第一个表示截取字符串的起始位置，包含该位置；第二个表示截取字符串的结束位置，不包含该位置
        String ss2=str.substring(6,10);

        System.out.println("ss1字符串："+ss1);
        System.out.println();
        System.out.println("ss2字符串："+ss2);

    }
}
