package com.illuutech.tacocloud.jdbc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
@RequiredArgsConstructor
@Component
public class JdbcRepository {
    private final JdbcConfiguration configuration;

    public void setUser() throws SQLException {
        Connection connection = configuration.pgsqlDataSource().getConnection();
        PreparedStatement preparedStatement ;
        ResultSet resultSet;
        try{
            preparedStatement = connection.prepareStatement("select * from public.gym_user");
            resultSet = preparedStatement.executeQuery();
           if (resultSet.next())
           {
               System.out.println(resultSet.getString("id"));
               System.out.println(resultSet.getString("created_at"));
               System.out.println(resultSet.getString("modified_at"));
               System.out.println(resultSet.getString("user_plan_type"));

           }
        }
        catch (SQLException e ){
            System.out.println(e);
        }
    }
}
