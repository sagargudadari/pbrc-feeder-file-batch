package com.mastercard.batch.util;

import com.mastercard.entity.GcmsTransactionDetail;
import org.springframework.stereotype.Component;

import javax.persistence.Table;
import java.lang.reflect.Field;

@Component
public class QueryGeneratorUtil {
    public String getInsertQueryGenerator(Object classObj){

        StringBuilder query = new StringBuilder("");


        String tableName = classObj.getClass().getAnnotation(Table.class).name();
        query.append("INSERT INTO ");
        query.append(tableName);
        query.append(" VALUES(");

        Field[] fields = classObj.getClass().getDeclaredFields();
        String [] header  = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            if(fields[i].getName()!="serialVersionUID"){
                query.append(":");
                query.append(fields[i].getName());
                if(i<fields.length-1)
                    query.append(", ");
                else
                    query.append(")");
            }
        }

        return query.toString();

    }

    public static void main(String[] args){
      QueryGeneratorUtil queryGeneratorUtil = new QueryGeneratorUtil();
      System.out.println(queryGeneratorUtil.getInsertQueryGenerator(new GcmsTransactionDetail()));
    }
}
