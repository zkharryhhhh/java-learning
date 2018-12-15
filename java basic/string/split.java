package indi.kai.hello;

public class array {
    
    public static void main (String[] args){
        String str="hello,java,zk,harry,icy";
        String s=",";
        //拆分无数量限制
        String[] ss1=str.split(s);
        
        //拆分有数量限制
        String[] ss2=str.split(s,3);
        System.out.println("ss1字符数组的长度："+ss1.length);
        for(int i=0;i<ss1.length;i++){
            System.out.print(ss1[i]+" ");
        }
        System.out.println();
        System.out.println("ss2字符数组的长度："+ss2.length);
        for(int i=0;i<ss2.length;i++){
            System.out.print(ss2[i]+" ");
        }
    }
}
