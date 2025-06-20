package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 课程安排：(CourseArrangement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CourseArrangement")
public class CourseArrangement implements Serializable {

    // CourseArrangement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_arrangement_id")
    private Integer course_arrangement_id;

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
    // 教师用户
    @Basic
    private Integer teacher_users;
    // 教师姓名
    @Basic
    private String teachers_name;
    // 教师工号
    @Basic
    private String teacher_id;
    // 学员用户
    @Basic
    private Integer student_users;
    // 学员姓名
    @Basic
    private String student_name;
    // 安排备注
    @Basic
    private String arrange_remarks;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
