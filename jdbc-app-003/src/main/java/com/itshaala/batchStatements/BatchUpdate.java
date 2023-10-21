package com.itshaala.batchStatements;

import com.itshaala.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdate {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query1 = "update course set course_name='Fullstack Java Development' where course_id =4;";
        String query2 = "update course set course_name='Data Science with Python' where course_id =3;";
        String query3 = "update course set course_name='Fullstack Python Development' where course_id =2;";
        String query4 = "update course set course_name='Spring Framework' where course_id =8;";
        String query5 = "update course set course_name='Spring Security' where course_id =9;";

        Statement statement = connection.createStatement();

        statement.addBatch(query1);
        statement.addBatch(query2);
        statement.addBatch(query3);
        statement.addBatch(query4);
        statement.addBatch(query5);

        statement.executeBatch();
        System.out.println("5 records Updated");
        connection.close();

    }


}
