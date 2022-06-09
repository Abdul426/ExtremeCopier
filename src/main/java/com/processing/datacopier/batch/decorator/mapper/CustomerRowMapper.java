package com.processing.datacopier.batch.decorator.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.processing.datacopier.batch.decorator.model.Customer;

public class CustomerRowMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

        Customer customer = new Customer(rs.getLong("id"), rs.getString("firstName"), rs.getString("lastName"),
                rs.getString("birthdate"));
        return customer;
    }
}