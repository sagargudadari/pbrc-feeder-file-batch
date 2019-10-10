package com.mastercard.batch.custom;

import com.mastercard.batch.model.TableMetaDataModel;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.FileSystemResource;

public class CustomFlatFileItem<T> extends FlatFileItemReader<T> {

    @SuppressWarnings("unchecked")
    public FlatFileItemReader<T> buildFlatFileItemReader(T t, TableMetaDataModel tableMetaDataModel) {

        FlatFileItemReader<T> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("D:\\data_files\\billing_api\\20191006\\GCMS\\Extractedfiles\\GCMS_BA_191006_00000031329_BE\\GCMS_BA_191006_00000031329_BE"));
        reader.setLineMapper(new DefaultLineMapper<T>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(tableMetaDataModel.getBuildFileHeaderFromDbColumns());
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<T>() {{
                setTargetType((Class<? extends T>) t.getClass());
            }});
        }});
        return reader;
    }
}
