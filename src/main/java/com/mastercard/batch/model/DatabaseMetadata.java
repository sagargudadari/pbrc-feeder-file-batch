package com.mastercard.batch.model;

import com.google.common.base.CaseFormat;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Data
public class DatabaseMetadata {

    private String[] buildFileHeaderFromDbColumns;
    private String buildInsertHeaderFromDbColumns;
    private String buildValuesHeaderFromDbColumns;
    private String buildQuery;
    private String tableName;

    public DatabaseMetadata(final String tableName,  List<String> columnsList) {


        //List<String> columnsList = Lists.newArrayList(Splitter.on(",").split(gcmsBillingEventDetail.toCommaSeparatedVariables()));

        setBuildFileHeaderFromDbColumns(buildFileHeaderFromDbColumns(columnsList));
        setBuildInsertHeaderFromDbColumns(buildInsertHeaderFromDbColumns(columnsList));
        setBuildValuesHeaderFromDbColumns(buildValuesHeaderFromDbColumns(columnsList));
        setTableName(tableName);
        setBuildQuery(buildInsertQuery());

    }

    private String buildInsertQuery() {
        return "INSERT INTO " + tableName + " (" + getBuildInsertHeaderFromDbColumns() + ") VALUES (" + getBuildValuesHeaderFromDbColumns() + ")";
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
