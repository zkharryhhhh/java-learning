package indi.kai.hello;
import java.sql.*;


public class InsertTest {
    public static void main (String[] args)  {
        //获取去与mysql数据库的连接对象con
        Connection con=dbtool.getConnection();
        PreparedStatement pstm=null;
        try{
            //定义向数据库插入数据的sql语句
            String sql="insert into student(name,age,sex,school,grade)values(?,?,?,?,?)";
            //获取pstm对象，并执行sql语句
            pstm=con.prepareStatement(sql);
            pstm.setString(1,"洋洋");
            pstm.setInt(2,15);
            pstm.setString(3,"男");
            pstm.setString(4,"第二小学");
            pstm.setString(5,"初二");
            //更新sql语句
            pstm.executeUpdate();
            System.out.println("数据插入成功");

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
