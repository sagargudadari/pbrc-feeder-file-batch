package com.mastercard.batch.config;

import com.google.common.base.CaseFormat;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mastercard.batch.model.GcmsBillingEventDetail;
import com.mastercard.batch.model.TableMetaDataModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
public class DatabaseMetadata {

    public TableMetaDataModel getTableMetaDataModel(final String tableName) {
        TableMetaDataModel dataModel = new TableMetaDataModel();
        GcmsBillingEventDetail gcmsBillingEventDetail = new GcmsBillingEventDetail();

        //List<String> columnsList = buildColumnsFromTable(tableName, dataSource);
        List<String> columnsList2 = Lists.newArrayList(Splitter.on(",").split(gcmsBillingEventDetail.toCommaSeparatedVariables()));

        dataModel.setBuildFileHeaderFromDbColumns(buildFileHeaderFromDbColumns(columnsList2));
        dataModel.setBuildInsertHeaderFromDbColumns(buildInsertHeaderFromDbColumns(columnsList2));
        dataModel.setBuildValuesHeaderFromDbColumns(buildValuesHeaderFromDbColumns(columnsList2));
        dataModel.setTableName(tableName);
        dataModel.setBuildQuery(buildInsertQuery(dataModel));

        log.info("=====> getBuildQuery {}", dataModel.getBuildQuery());
        log.info("=====> new setBuildFileHeaderFromDbColumns {}", dataModel.getBuildValuesHeaderFromDbColumns());
        log.info("=====> new setBuildInsertHeaderFromDbColumns {}",dataModel.getBuildInsertHeaderFromDbColumns());
        log.info("=====> new setBuildValuesHeaderFromDbColumns {}", dataModel.getBuildValuesHeaderFromDbColumns());

        return dataModel;
    }

    private String buildInsertQuery(TableMetaDataModel dataModel) {
        return "INSERT INTO " + dataModel.getTableName() + " (" + dataModel.getBuildInsertHeaderFromDbColumns() + ") VALUES (" + dataModel.getBuildValuesHeaderFromDbColumns() + ")";
    }

    private String[] buildFileHeaderFromDbColumns(final List<String> columnsList) {
        return columnsList.stream().map(name -> (CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name))).toArray(String[]::new);
    }

    private String buildValuesHeaderFromDbColumns(final List<String> columnsList) {
        return String.join(",", columnsList
                .stream()
                .map(name -> (":" + name))
                .collect(Collectors.toList()));
    }

    private String buildInsertHeaderFromDbColumns(List<String> toCommaSeparatedVariables) {
        return String.join(",", toCommaSeparatedVariables
                .stream()
                .map(name -> (CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name)))
                .collect(Collectors.toList()));
    }
}
