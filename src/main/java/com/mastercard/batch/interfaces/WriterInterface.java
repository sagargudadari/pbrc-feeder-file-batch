package com.mastercard.batch.interfaces;

import org.springframework.batch.item.database.JdbcBatchItemWriter;

public interface WriterInterface {

    public JdbcBatchItemWriter<?> writer();
}
