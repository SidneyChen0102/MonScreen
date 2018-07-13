package com;

        import java.sql.*;

public class Test {
    public static final String url = "jdbc:oracle:thin:@192.168.229.134:1521:orcl";
    public static final String name = "oracle.jdbc.driver.OracleDriver";
    public static final String user = "C##SIDNEY";
    public static final String password = "123456";

    public Connection conn = null;
    public PreparedStatement pst = null;

    public Test(String sql) {
        try {
            Class.forName(name);//指定连接类型
            conn = DriverManager.getConnection(url, user, password);//获取连接
            pst = conn.prepareStatement(sql);//准备执行语句
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            this.conn.close();
            this.pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        String   sql = "select * from cfg_PC";//SQL语句
        Test test = new Test(sql);//创建DBHelper对象
        ResultSet ret=null;
        try {
            ret = test.pst.executeQuery();//执行语句，得到结果集
            while (ret.next()) {
                String uid = ret.getString(1);
                String ufname = ret.getString(2);
                String ulname = ret.getString(3);
                String udate = ret.getString(4);
                System.out.println(uid + "\t" + ufname + "\t" + ulname + "\t" + udate );
            }//显示数据
            ret.close();
            test.pst.close();//关闭连接
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
