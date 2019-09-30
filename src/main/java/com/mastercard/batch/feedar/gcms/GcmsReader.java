package com.mastercard.batch.feedar.gcms;

import com.mastercard.entity.GcmsTransactionDetail;
import com.mastercard.batch.util.HeaderGeneratorUtil;
import lombok.Getter;
import lombok.Setter;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
@StepScope
@Getter
@Setter
public class GcmsReader extends FlatFileItemReader<GcmsTransactionDetail> implements ItemReader<GcmsTransactionDetail> {

        public GcmsReader(@Value("#{jobParameters}") Map<String,String> jobParameters) {
                this.setResource(new FileSystemResource(jobParameters.get("input.file.path")));
                DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
                HeaderGeneratorUtil headerGeneratorUtil = new HeaderGeneratorUtil();
                lineTokenizer.setNames(headerGeneratorUtil.getHeader(new GcmsTransactionDetail()));

                BeanWrapperFieldSetMapper<GcmsTransactionDetail> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
                fieldSetMapper.setTargetType(GcmsTransactionDetail.class);

                DefaultLineMapper<GcmsTransactionDetail> lineMapper = new DefaultLineMapper<>();
                lineMapper.setFieldSetMapper(fieldSetMapper);
                lineMapper.setLineTokenizer(lineTokenizer);
                this.setLineMapper(lineMapper);
        }
}
