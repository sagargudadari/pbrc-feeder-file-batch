package com.mastercard.batch.custom;

import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;

import javax.sql.DataSource;

public class CustomJdbcBatchItemWriter<T> extends JdbcBatchItemWriter<T> {

    public JdbcBatchItemWriter<T> buildWriter(T t, String buildQuery, DataSource dataSource) {
        JdbcBatchItemWriter<T> writer = new JdbcBatchItemWriter<>();
        writer.setDataSource(dataSource);
        writer.setSql(buildQuery);
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<T>());
        return writer;
    }

}
