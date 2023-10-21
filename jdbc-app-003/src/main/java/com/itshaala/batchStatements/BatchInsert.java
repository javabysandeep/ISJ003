package com.itshaala.batchStatements;

import com.itshaala.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query1 = "insert into course(course_id,course_name,course_duration,course_content,intake,course_price) values(5,'JDK','1 month','JDK internals',30,100);";
        String query2 = "insert into course(course_id,course_name,course_duration,course_content,intake,course_price) values(6,'JRE','1 month','JRE internals',30,100);";
        String query3 = "insert into course(course_id,course_name,course_duration,course_content,intake,course_price) values(7,'ORM','1 month','ORM internals',30,100);";
        String query4 = "insert into course(course_id,course_name,course_duration,course_content,intake,course_price) values(8,'Spring','1 month','Spring internals',30,100);";
        String query5 = "insert into course(course_id,course_name,course_duration,course_content,intake,course_price) values(9,'Security','1 month',' internals',30,100);";

        Statement statement = connection.createStatement();

        statement.addBatch(query1);
        statement.addBatch(query2);
        statement.addBatch(query3);
        statement.addBatch(query4);
        statement.addBatch(query5);

        statement.executeBatch();
        System.out.println("5 records inserted");
        connection.close();

    }


}
