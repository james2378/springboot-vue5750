package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 商品库存：(InventoryOfGoods)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "InventoryOfGoods")
public class InventoryOfGoods implements Serializable {

    // InventoryOfGoods编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_of_goods_id")
    private Integer inventory_of_goods_id;

    // 商品名称
    @Basic
    private String product_name;
    // 统计日期
    @Basic
    private Timestamp statistical_date;
    // 库存数量
    @Basic
    private Integer inventory_quantity;
    // 统计备注
    @Basic
    private String statistical_remarks;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
