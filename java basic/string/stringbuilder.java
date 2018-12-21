package indi.kai.hello;

public class stringbulider {

    public static void main (String[] args){
        //定义空的字符串缓冲区，初始容量为16个字符
        StringBuilder sb1=new StringBuilder();
        //定义指定长度的空字符串缓冲区
        StringBuilder sb2=new StringBuilder(12);
        //创建指定字符串的缓冲区，长度为16+字符串长度
        StringBuilder sb3=new StringBuilder("JAVA BUFFER");

        System.out.println("sb1,sb2,sb3的缓冲区容量分别为："+sb1.capacity()+" "+sb2.capacity()+" "+sb3.capacity());


        //追加字符串，可以是多种类型字符串
        sb3.append(123);
        sb3.append("lalala");
        sb3.append(",.,.!");
        System.out.println(sb3);

        //插入字符串，接受任意类型
        StringBuilder sb4=new StringBuilder("JAVABUFFERBUILDERGOOD");
        sb4.insert(4,",");
        sb4.insert(11,",");
        sb4.insert(19,100);
        System.out.println("the value of sb4 is "+sb4);

        //删除字符串
        StringBuilder sb5=new StringBuilder("java,hello,world");
        sb5.deleteCharAt(4);
        //delete两个参数，分别为起始字符的索引，包含；  结束字符的索引，不包含
        sb5.delete(9,15);
        System.out.println("the value of sb5 is "+sb5);


        //reverse翻转字符串
        StringBuilder sb6=sb5.reverse();
        System.out.println("the value of sb6 is "+sb6);


        //替换字符串
        StringBuilder sb7=new StringBuilder("hello,java");
        sb7.setCharAt(6,'J');
        sb7.replace(0,5,"HELLO");
        System.out.println("the value of sb7 is "+sb7);



    }
}
