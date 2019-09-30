package com.mastercard.batch.feedar.salesdata;

import com.mastercard.entity.SalesData;
import com.mastercard.batch.util.QueryGeneratorUtil;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class SalesDataWriter extends JdbcBatchItemWriter<SalesData> implements ItemWriter<SalesData> {

    SalesDataWriter(DataSource dataSource){
        this.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<SalesData>());
        QueryGeneratorUtil queryGeneratorUtil = new QueryGeneratorUtil();
        setSql(queryGeneratorUtil.getInsertQueryGenerator(new SalesData()));
        setDataSource(dataSource);
    }


}
