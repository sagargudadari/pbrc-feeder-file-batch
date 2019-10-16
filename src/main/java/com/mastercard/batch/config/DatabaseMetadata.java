package com.mastercard.batch.config;

import com.google.common.base.CaseFormat;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mastercard.batch.model.IFeeder;
import com.mastercard.batch.model.TableMetaDataModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
public class DatabaseMetadata {

    public TableMetaDataModel getTableMetaDataModel(final String tableName, IFeeder iFeeder) {
        TableMetaDataModel dataModel = new TableMetaDataModel();

        List<String> columnsList = Lists.newArrayList(Splitter.on(",").split(iFeeder.toCommaSeparatedVariables()));

        dataModel.setBuildFileHeaderFromDbColumns(buildFileHeaderFromDbColumns(columnsList));
        dataModel.setBuildInsertHeaderFromDbColumns(buildInsertHeaderFromDbColumns(columnsList));
        dataModel.setBuildValuesHeaderFromDbColumns(buildValuesHeaderFromDbColumns(columnsList));
        dataModel.setTableName(tableName);
        dataModel.setBuildQuery(buildInsertQuery(dataModel));

        log.info(dataModel.getBuildQuery());

        return dataModel;
    }

    private String buildInsertQuery(TableMetaDataModel dataModel) {
        return "INSERT INTO " + dataModel.getTableName() + " (" + dataModel.getBuildInsertHeaderFromDbColumns() + ") VALUES (" + dataModel.getBuildValuesHeaderFromDbColumns() + ")";
    }

    private String[] buildFileHeaderFromDbColumns(final List<String> columnsList) {
        return columnsList.stream().map(name -> name.matches("_") ? name.toUpperCase() : (CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name))).toArray(String[]::new);
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
