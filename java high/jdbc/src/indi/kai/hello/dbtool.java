package indi.kai.hello;
import java.sql.*;
public class dbtool{
    public static Connection con;
    public static Connection getConnection(){
        try{
            //加载数据库驱动
            Class.forName("org.gjt.mm.mysql.Driver").newInstance();
            //数据库链接地址
            String url="jdbc:mysql://localhost/practice?user=root&password=123456"
                    +"&useUnicode=true&characterEncoding=8859_1&useSSL=false";
                      //此处有一些小疑问，当useSSL=true时便会报错，communications link failure，还不知道是为啥，等待以后弄清！
                      //+"&useUnicode=true&characterEncoding=utf-8&useSSL=true";
            con=DriverManager.getConnection(url);
            System.out.println("数据库连接成功！");

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;

    }
}
