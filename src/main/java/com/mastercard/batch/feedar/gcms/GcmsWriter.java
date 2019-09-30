package com.mastercard.batch.feedar.gcms;

import com.mastercard.entity.GcmsTransactionDetail;
import com.mastercard.batch.util.QueryGeneratorUtil;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class GcmsWriter extends JdbcBatchItemWriter<GcmsTransactionDetail> implements ItemWriter<GcmsTransactionDetail> {

    GcmsWriter(DataSource dataSource){
        this.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<GcmsTransactionDetail>());
        QueryGeneratorUtil queryGeneratorUtil = new QueryGeneratorUtil();
        setSql(queryGeneratorUtil.getInsertQueryGenerator(new GcmsTransactionDetail()));
        setDataSource(dataSource);
    }
}
