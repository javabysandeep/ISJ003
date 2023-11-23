package dao;

import model.Lead;
import util.ConnectionUtil;

import java.sql.*;
import java.time.LocalDateTime;

public class LeadDao {
    public void addLead(Lead lead) {
        Connection connection = ConnectionUtil.getConnection();
        String sql = "insert into crm_app.lead(name,mobile,email,source,created_at) values(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, lead.getName());
            preparedStatement.setInt(2, lead.getMobile());
            preparedStatement.setString(3, lead.getEmail());
            preparedStatement.setString(4, lead.getSource());
            preparedStatement.setString(5,"2023-11-23");
            preparedStatement.executeUpdate();
            System.out.println("inserted");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("issue while closing the connection");
            }
        }
    }
}
