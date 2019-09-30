package com.mastercard.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name="sales_data")
@SequenceGenerator(name="sales_data_seq", initialValue=1000)
@AllArgsConstructor
@NoArgsConstructor
public class SalesData  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="sales_data_seq")
    private Long dataId;
    private String region;
    private String country;
    private String itemType;
    private String salesChannel;
    private String orderPriority;
    private String orderDate;
    private String orderId;
    private String shipDate;
    private String unitsSold;
    private String unitPrice;
    private String unitCost;
    private String totalRevenue;
    private String totalCost;
    private String totalProfit;

}
