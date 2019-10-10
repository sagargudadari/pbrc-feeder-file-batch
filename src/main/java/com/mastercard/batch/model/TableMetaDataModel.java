package com.mastercard.batch.model;

import java.util.Arrays;

public class TableMetaDataModel {

    private String fileName;
    private String[] buildFileHeaderFromDbColumns;
    private String buildInsertHeaderFromDbColumns;
    private String buildValuesHeaderFromDbColumns;
    private String buildQuery;
    private String tableName;

    public TableMetaDataModel() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String[] getBuildFileHeaderFromDbColumns() {
        return buildFileHeaderFromDbColumns;
    }

    public void setBuildFileHeaderFromDbColumns(String[] buildFileHeaderFromDbColumns) {
        this.buildFileHeaderFromDbColumns = buildFileHeaderFromDbColumns;
    }

    public String getBuildInsertHeaderFromDbColumns() {
        return buildInsertHeaderFromDbColumns;
    }

    public void setBuildInsertHeaderFromDbColumns(String buildInsertHeaderFromDbColumns) {
        this.buildInsertHeaderFromDbColumns = buildInsertHeaderFromDbColumns;
    }

    public String getBuildValuesHeaderFromDbColumns() {
        return buildValuesHeaderFromDbColumns;
    }

    public void setBuildValuesHeaderFromDbColumns(String buildValuesHeaderFromDbColumns) {
        this.buildValuesHeaderFromDbColumns = buildValuesHeaderFromDbColumns;
    }

    public String getBuildQuery() {
        return buildQuery;
    }

    public void setBuildQuery(String buildQuery) {
        this.buildQuery = buildQuery;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public String toString() {
        return "TableMetaDataModel{" +
                "\n fileName='" + fileName + '\'' +
                ",\n buildFileHeaderFromDbColumns=" + Arrays.toString(buildFileHeaderFromDbColumns) +
                ",\n buildInsertHeaderFromDbColumns='" + buildInsertHeaderFromDbColumns + '\'' +
                ",\n buildValuesHeaderFromDbColumns='" + buildValuesHeaderFromDbColumns + '\'' +
                ",\n buildQuery='" + buildQuery + '\'' +
                ",\n tableName='" + tableName + '\'' +
                '}';
    }
}
