package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 售后信息：(AfterSalesInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "AfterSalesInformation")
public class AfterSalesInformation implements Serializable {

    // AfterSalesInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "after_sales_information_id")
    private Integer after_sales_information_id;

    // 订单编号
    @Basic
    private String order_number;
    // 用户信息
    @Basic
    private Integer user_information;
    // 商品名称
    @Basic
    private String product_name;
    // 订单日期
    @Basic
    private Timestamp order_date;
    // 购买数量
    @Basic
    private String purchase_quantity;
    // 订单总价
    @Basic
    private String total_order_price;
    // 售后类型
    @Basic
    private String after_sales_type;
    // 售后内容
    @Basic
    private String after_sales_content;
    // 售后状态
    @Basic
    private String after_sales_status;
    // 售后回复
    @Basic
    private String after_sales_response;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
