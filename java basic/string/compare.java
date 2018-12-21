package indi.kai.hello;

public class array {

    public static void main (String[] args){
        String s1="java";
        String s2="JAVA";
        String s3="java";
        String s4="script";


        //使用==比较时，比较对象为s1和s3，这两者值相同，但内存地址不同，所以不相等。
        System.out.println("使用==比较：");
        if(s1==s3){
            System.out.println("字符串相等");
        }
        else{
            System.out.println("字符串不相等");
        }

        //使用equals比较，只比较值的大小，区分大小写，若相等，返回值为true，若不等，返回值为false
        System.out.println("使用equals比较：");
        if(s1.equals(s3)){
            System.out.println("字符串相等");
        }
        else{
            System.out.println("字符串不相等");
        }


        //使用equalsIgnoreCase比较，只比较值的大小，不区分大小写，若相等，返回值为true，若不等，返回值为false
        System.out.println("使用equalsIgnoreCase比较：");
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("字符串相等");
        }
        else{
            System.out.println("字符串不相等");
        }


        //使用compareTo比较，按字典顺序比较，若等于，返回0，若小于，返回一个小于0的值；若大于，返回一个大于0的值
        //使用compareToIgnoreCase，忽略字母大小写
        System.out.println("使用compareTo比较：");

        int compareresult=s1.compareTo(s2);
        if(compareresult<0){
            System.out.println("字符串s1小于s2");
        }
        else if(compareresult>0){
            System.out.println("字符串s1大于s2");
        }
        else{
            System.out.println("字符串s1等于s2");
        }
        System.out.println();


    }
}
