package com.mastercard.batch.util;

import com.mastercard.entity.SalesData;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Component
public class HeaderGeneratorUtil {

    public String[] getHeader(Object o){
        Field[] fields = o.getClass().getDeclaredFields();
        List<String> header  = new ArrayList<>();
        for (int i = 0; i < fields.length; i++) {
            if(fields[i].getName()!="serialVersionUID") {
                header.add(fields[i].getName());
            }
        }
        fields = null;

        String[] arr = new String[header.size()];
        arr = header.toArray(arr);

        return arr;
    }

    public static void main(String[] args){
      HeaderGeneratorUtil headerGeneratorUtil = new HeaderGeneratorUtil();
      String [] header= headerGeneratorUtil.getHeader(new SalesData());
      String headerString = new String("");
        for (int i=0;i<header.length;i++){
           headerString +="\""+header[i]+"\",";
           // headerString +=header[i]+",";
        }
      System.out.println(headerString);


    }
}
