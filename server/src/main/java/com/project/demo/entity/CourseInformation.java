package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 课程信息：(CourseInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CourseInformation")
public class CourseInformation implements Serializable {

    // CourseInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_information_id")
    private Integer course_information_id;

    // 课程编号
    @Basic
    private String course_id;
    // 课程名称
    @Basic
    private String course_name;
    // 上课时间
    @Basic
    private Timestamp class_time;
    // 上课地点
    @Basic
    private String class_location;
    // 课程封面
    @Basic
    private String course_cover;
    // 课程介绍
    @Basic
    private String course_introduction;


    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
