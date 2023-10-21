package com.itshaala.callableDemos;

import com.itshaala.util.ConnectionUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CreateProcedure {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query = "CREATE PROCEDURE institute_mgmt_app.bulk_insert()\n" +
                "begin\n" +
                "\tinsert into course(course_id,course_name,course_duration,course_content,intake,course_price) values(5,'JDK','1 month','JDK internals',30,100);\n" +
                "    \n" +
                "\tinsert into course(course_id,course_name,course_duration,course_content,intake,course_price) values(6,'JRE','1 month','JRE internals',30,100);\n" +
                "       \n" +
                "\tinsert into course(course_id,course_name,course_duration,course_content,intake,course_price) values(7,'ORM','1 month','ORM internals',30,100);\n" +
                "        \n" +
                "\tinsert into course(course_id,course_name,course_duration,course_content,intake,course_price) values(8,'Spring','1 month','Spring internals',30,100);\n" +
                "       \n" +
                "\tinsert into course(course_id,course_name,course_duration,course_content,intake,course_price) values(9,'Security','1 month',' internals',30,100);\n" +
                "\n" +
                "END\n";

        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        connection.close();
        System.out.println("Stored procedure created");
    }
}
