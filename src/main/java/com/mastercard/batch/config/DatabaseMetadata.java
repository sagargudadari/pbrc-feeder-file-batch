package com.mastercard.batch.config;

import com.google.common.base.CaseFormat;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mastercard.batch.model.GcmsBillingEventDetail;
import com.mastercard.batch.model.TableMetaDataModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

        dataModel.setFileName("person.csv");
        dataModel.setBuildFileHeaderFromDbColumns(buildFileHeaderFromDbColumns(columnsList2));
        dataModel.setBuildInsertHeaderFromDbColumns(bulidUperCase(columnsList2));
        dataModel.setBuildValuesHeaderFromDbColumns(buildValuesHeaderFromDbColumns(columnsList2));
        dataModel.setTableName(tableName);
        dataModel.setBuildQuery(buildInsertQuery(dataModel));


        log.info("=====> toCommaSeparatedVariables {}", columnsList2);
        log.info("=====> new setBuildFileHeaderFromDbColumns {}", dataModel.getBuildValuesHeaderFromDbColumns());
        log.info("=====> new setBuildInsertHeaderFromDbColumns {}",dataModel.getBuildInsertHeaderFromDbColumns());
        log.info("=====> new setBuildValuesHeaderFromDbColumns {}", dataModel.getBuildValuesHeaderFromDbColumns());

        /*log.info("=====> columnsList {}", columnsList);
        log.info("=====> setBuildFileHeaderFromDbColumns {}", buildFileHeaderFromDbColumns(columnsList));
        log.info("=====> setBuildInsertHeaderFromDbColumns {}", buildInsertHeaderFromDbColumns(columnsList));
        log.info("=====> setBuildValuesHeaderFromDbColumns {}", buildValuesHeaderFromDbColumns(columnsList));
        System.exit(0);*/
        return dataModel;
    }

    private String buildInsertQuery(TableMetaDataModel dataModel) {
        return "INSERT INTO " + dataModel.getTableName() + " (" + dataModel.getBuildInsertHeaderFromDbColumns() + ") VALUES (" + dataModel.getBuildValuesHeaderFromDbColumns() + ")";
    }

    private List<String> buildColumnsFromTable(final String tableName, DataSource dataSource) {
        ResultSet resultSetTables = null;
        DatabaseMetaData datasourceMetaData = null;
        List<String> columnsList = null;
        Connection con = null;
        ResultSet resultsetColumns = null;
        try {
            con = dataSource.getConnection();
            datasourceMetaData = con.getMetaData();
            //resultSetTables = datasourceMetaData.getTables(null, null, null, new String[]{"TABLE"});
            /*while (resultSetTables.next()) {
                String dbTableName = resultSetTables.getString("TABLE_NAME");
                if (dbTableName.equalsIgnoreCase(tableName)) {*/
            columnsList = new ArrayList<>();
            resultsetColumns = datasourceMetaData.getColumns(null, null, tableName, "%");

            while (resultsetColumns.next()) {
                columnsList.add(resultsetColumns.getString("COLUMN_NAME"));
            }
            resultsetColumns.close();

            //}
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (resultsetColumns != null) {
                try {
                    resultsetColumns.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return columnsList;
    }

    private String[] buildFileHeaderFromDbColumns(final List<String> columnsList) {
        return columnsList.stream().map(name -> (CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name))).toArray(String[]::new);
    }

    private String buildInsertHeaderFromDbColumns(final List<String> columnsList) {
        return String.join(",", columnsList);
    }

    private String buildValuesHeaderFromDbColumns(final List<String> columnsList) {
        return String.join(",", columnsList
                .stream()
                .map(name -> (":" + name))
                .collect(Collectors.toList()));
    }

    private String bulidUperCase(List<String> toCommaSeparatedVariables) {
        return String.join(",", toCommaSeparatedVariables
                .stream()
                .map(name -> (CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name)))
                .collect(Collectors.toList()));
    }
}
