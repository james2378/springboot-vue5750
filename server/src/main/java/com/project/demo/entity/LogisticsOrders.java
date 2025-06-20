package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 物流订单：(LogisticsOrders)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "LogisticsOrders")
public class LogisticsOrders implements Serializable {

    // LogisticsOrders编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "logistics_orders_id")
    private Integer logistics_orders_id;

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
    private Integer purchase_quantity;
    // 订单总价
    @Basic
    private String total_order_price;
    // 订单状态
    @Basic
    private String order_status;
    // 物流描述
    @Basic
    private String logistics_description;
    // 备注信息
    @Basic
    private String remarks;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
