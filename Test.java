import java.sql.*;

public class Test {
    public static void main(String[] args) {
        try
        {
            String dburl="jdbc:mysql://localhost:3306/practise";
            String username = "siddharth";
            String password = "Chunnu@1";
            Connection myConnection=DriverManager.getConnection(dburl, username, password);
            Statement mysStatement=myConnection.createStatement();
            // ResultSet myrResultSet=mysStatement.executeQuery("select * from Doctor");
            mysStatement.executeUpdate("create table test(col1 integer)");
            // while(myrResultSet.next())
            // {
            //     System.out.println("Doctor name: "+myrResultSet.getString("name"));
            // }

            // Class.forName("com.mysql.jdbc.Driver"); //Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}


// javac Test.java
// java -cp .:mysql-connector-java-8.0.27.jar Test