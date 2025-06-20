package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 课程考勤：(CourseAttendance)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CourseAttendance")
public class CourseAttendance implements Serializable {

    // CourseAttendance编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_attendance_id")
    private Integer course_attendance_id;

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
    // 考勤状态
    @Basic
    private String attendance_status;
    // 考勤备注
    @Basic
    private String attendance_notes;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
