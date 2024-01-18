package com.itshaala.callableDemos;

import com.itshaala.util.ConnectionUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallStoredProcedure {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query = "call bulk_insert()";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        connection.close();
        System.out.println("Stored procedure is called");
    }
}
